package com.example.stream.namesink.df;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
@Slf4j
public class Subscriber {

    @Bean
    public Consumer<Message> listen() {
        return message -> log.info(message.getBody()+ " is received!!!");
    }


}
