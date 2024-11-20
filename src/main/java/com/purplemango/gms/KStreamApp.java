package com.purplemango.gms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@EnableKafka
@SpringBootApplication(scanBasePackages = "com.purplemango.gms")
public class KStreamApp {

    public static void main(String[] args) {
        // Run the Spring Boot application
         SpringApplication.run(KStreamApp.class, args);
    }
}
