package com.team.ai_assessor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.team.ai_assessor")
public class AiAssessorApplication {
    public static void main(String[] args) {
        SpringApplication.run(AiAssessorApplication.class, args);
    }
}