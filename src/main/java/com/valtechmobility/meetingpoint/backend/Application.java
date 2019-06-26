package com.valtechmobility.meetingpoint.backend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Application {

    public static void main(final String[] args) {
        //noinspection resource - if this will be closed. Application ends
        SpringApplication.run(Application.class, args);
    }
}
