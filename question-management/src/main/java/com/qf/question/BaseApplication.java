package com.qf.question;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.qf.question","com.qf.common"})
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class,args);
    }
}
