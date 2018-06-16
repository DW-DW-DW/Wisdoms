package com.example.wisdomApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WisdomAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(WisdomAppApplication.class, args);

        MongoTest mongo = new MongoTest();
        mongo.test();


    }
}
