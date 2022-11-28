package com.sparta.week03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //JPA Audition(감시,감사)기능 활성화
@SpringBootApplication
public class Week03Application {

    public static void main(String[] args) {

        SpringApplication.run(Week03Application.class, args);
    }

}
