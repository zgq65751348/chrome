package com.google.chrome.service.service;

import cn.hutool.core.util.RandomUtil;
import com.alibaba.fastjson.JSONObject;
import com.google.chrome.tools.constant.RabbitConstant;
import com.google.chrome.tools.model.legends.Legends;
import com.google.chrome.tools.repository.legends.LegendsMapper;
import com.google.chrome.tools.utils.HttpStatus;
import com.google.chrome.tools.utils.RestBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j(topic = "酷睿i9为运算而生")
public class LegendService {

    @Autowired
    private LegendsMapper legendsMapper;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public RestBody createLegends(Legends legends){
        legendsMapper.insertSelective(legends);
        return RestBody.success(HttpStatus.OK);
    }

    public void sendMessage(){
        JSONObject jsonObject = new JSONObject();
        String number = RandomUtil.randomNumbers(18);
        jsonObject.put("id",number);
        jsonObject.put("timestamp", System.currentTimeMillis());
        String jsonString = jsonObject.toJSONString();
        Message message = MessageBuilder.withBody(jsonString.getBytes())
                .setDeliveryMode(MessageDeliveryMode.PERSISTENT)
                .setContentType(MessageProperties.CONTENT_TYPE_JSON).setContentEncoding("utf-8")
                .build();
        rabbitTemplate.convertAndSend(RabbitConstant.QUEUE_NAME, message);
        log.warn("发送至普通队列 : {}", number);
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
}
