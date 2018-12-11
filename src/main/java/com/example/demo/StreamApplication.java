package com.example.demo;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@Slf4j
@EnableBinding(Sink.class)
@SpringBootApplication
/**
 * Binds to rabbit @5672 and creates a queue named "input.streamHello".
 * Publish a message to the anonymous queue with a payload of:
 *   {"name" : "codebeneath" }
 */
public class StreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamApplication.class, args);
    }

    @StreamListener(Sink.INPUT)
    public void handle(Person person) {
        log.info("Received: {}", person);
    }

    @Data
    public static class Person {
        private String name;
    }
}
