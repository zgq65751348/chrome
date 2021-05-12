package com.google.chrome.service.server;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;
import com.google.chrome.tools.constant.RabbitConstant;

@Configuration
public class RabbitClient {

    /**
     * 死信队列跟交换机类型没有关系 不一定为directExchange  不影响该类型交换机的特性.
     */
    @Bean("deadLetterExchange")
    public Exchange deadLetterExchange() {
        return ExchangeBuilder.directExchange(RabbitConstant.DEAD_LETTER_EXCHANGE).durable(true).build();
    }

    @Bean("deadLetterQueue")
    public Queue deadLetterQueue() {
        Map<String, Object> args = new HashMap<>(3);
        args.put("x-message-ttl",100000);
//       x-dead-letter-exchange    声明  死信队列Exchange
        args.put("x-dead-letter-exchange", RabbitConstant.DEAD_LETTER_EXCHANGE);
//       x-dead-letter-routing-key    声明 死信队列抛出异常重定向队列的routingKey(TKEY_R)
        args.put("x-dead-letter-routing-key", RabbitConstant.DEAD_LETTER_REDIRECT_ROUTING_KEY);
        return QueueBuilder.durable(RabbitConstant.DEAD_LETTER_QUEUE).withArguments(args).build();
    }

    @Bean("redirectQueue")
    public Queue redirectQueue() {
        return QueueBuilder.durable(RabbitConstant.REDIRECT_QUEUE).build();
    }

    /**
     * 死信队列绑定到死信交换器上.
     *
     * @return the binding
     */
    @Bean
    public Binding deadLetterBinding() {
        return new Binding(RabbitConstant.DEAD_LETTER_QUEUE, Binding.DestinationType.QUEUE, RabbitConstant.DEAD_LETTER_EXCHANGE, RabbitConstant.DEAD_LETTER_TEST_ROUTING_KEY, null);
    }

    /**
     * 将重定向队列通过routingKey(TKEY_R)绑定到死信队列的Exchange上
     *
     * @return the binding
     */
    @Bean
    public Binding redirectBinding() {
        return new Binding(RabbitConstant.REDIRECT_QUEUE, Binding.DestinationType.QUEUE, RabbitConstant.DEAD_LETTER_EXCHANGE, RabbitConstant.DEAD_LETTER_REDIRECT_ROUTING_KEY, null);
    }

    @Bean
    public Queue queue() {
        return new Queue(RabbitConstant.QUEUE_NAME);
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(RabbitConstant.EXCHANGE_NAME);
    }

    @Bean
    public Binding testBinding() {
        return BindingBuilder.bind(queue()).to(exchange()).with(RabbitConstant.ROUTING_KEY);
    }
}
