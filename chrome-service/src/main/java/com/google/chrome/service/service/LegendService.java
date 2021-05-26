package com.google.chrome.service.service;

import cn.hutool.core.util.RandomUtil;
import com.alibaba.fastjson.JSONObject;
import com.google.chrome.tools.constant.RabbitConstant;
import com.google.chrome.tools.model.mall.BrokerMessageLog;
import com.google.chrome.tools.repository.mall.BrokerMessageLogMapper;
import com.google.chrome.tools.utils.HttpStatus;
import com.google.chrome.tools.utils.RestBody;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j(topic = "酷睿i9为运算而生")
public class LegendService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private BrokerMessageLogMapper brokerMessageLogMapper;

    public void sendMessage(){
        JSONObject jsonObject = new JSONObject();
        String number = RandomUtil.randomNumbers(18);
        jsonObject.put("id",number);
        jsonObject.put("timestamp", System.currentTimeMillis());
        String jsonString = jsonObject.toJSONString();
        BrokerMessageLog brokerMessageLog = new BrokerMessageLog();
        // 消息唯一ID
        brokerMessageLog.setMessageId(RandomUtil.randomNumbers(8));
        // 保存消息整体 转为JSON 格式存储入库
        brokerMessageLog.setMessage(jsonString);
        // 设置消息状态为0 表示发送中
        brokerMessageLog.setStatus("0");
        // 设置消息未确认超时时间窗口为 一分钟
        brokerMessageLog.setNextRetry(DateUtils.addMinutes(new Date(), RabbitConstant.ORDER_TIMEOUT));
        brokerMessageLog.setCreateTime(new Date());
        brokerMessageLog.setUpdateTime(new Date());
        brokerMessageLogMapper.insert(brokerMessageLog);
      /*  Message message = MessageBuilder.withBody(jsonString.getBytes())
                .setDeliveryMode(MessageDeliveryMode.PERSISTENT)
                .setContentType(MessageProperties.CONTENT_TYPE_JSON).setContentEncoding("utf-8")
                .build();
        rabbitTemplate.convertAndSend(RabbitConstant.QUEUE_NAME, message);*/
        log.warn("发送至普通队列 : {}", number);
        sendMessageConform(number);
    }

    public void sendTTLMessage(){
        JSONObject jsonObject = new JSONObject();
        String number = RandomUtil.randomNumbers(18);
        jsonObject.put("id",number);
        jsonObject.put("timestamp", System.currentTimeMillis());
        String jsonString = jsonObject.toJSONString();
        rabbitTemplate.convertAndSend(
                RabbitConstant.DEAD_LETTER_EXCHANGE,
                RabbitConstant.DEAD_LETTER_TEST_ROUTING_KEY,
                jsonString);
        log.warn("发送至死信队列  : {}", number);
    }

    final RabbitTemplate.ConfirmCallback confirmCallback = (correlationData, ack, cause) -> {
        System.err.println("correlationData: " + correlationData);
        String messageId = correlationData.getId();
        if(ack){
            //成功
            System.out.println("====>success");
        }else {
            //失败
            System.err.println("====>fail");
        }
    };

    public void sendMessageConform(String id){
        rabbitTemplate.setConfirmCallback(confirmCallback);
        CorrelationData correlationData = new CorrelationData(id);
        rabbitTemplate.convertAndSend(RabbitConstant.EXCHANGE_NAME,RabbitConstant.QUEUE_NAME, id,correlationData);
    }
}
