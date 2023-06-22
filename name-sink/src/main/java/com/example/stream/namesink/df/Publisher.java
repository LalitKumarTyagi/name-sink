package com.example.stream.namesink.df;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;

@Slf4j
public class Publisher {
    @Bean
    public Function<String, String> publish() {
        return message -> {
            log.info(message + " is sent?!!!");
            return message.toUpperCase();
        };
    }
}
