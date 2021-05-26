package com.google.chrome.service.listener;

import com.alibaba.fastjson.JSONObject;
import com.google.chrome.tools.constant.RabbitConstant;
import com.rabbitmq.client.AMQP;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
@Slf4j(topic = "酷睿i7为游戏而生")
public class RabbitListeners {

    @RabbitListener(queues = RabbitConstant.QUEUE_NAME)
    public void consumeMessage(Message message) throws Exception{
        String msg = new String(message.getBody(), "UTF-8");
        JSONObject jsonObject = JSONObject.parseObject(msg);
        log.info("====> 来自普通队列的消息：<{}>",jsonObject);
    }

    @RabbitListener(queues = RabbitConstant.REDIRECT_QUEUE)
    public void consumeTTLMessage(Message message) throws Exception{
        String msg = new String(message.getBody(), "UTF-8");
        JSONObject jsonObject = JSONObject.parseObject(msg);
        log.info("====>来自死信队列的消息：<{}>",msg);
    }

    public void confirm(AMQP.Channel channel){

    }
}
