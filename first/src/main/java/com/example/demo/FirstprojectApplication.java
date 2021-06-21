package com.example.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstprojectApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext coxt = SpringApplication.run(FirstprojectApplication.class, args);

        Alien alien = (Alien) coxt.getBean("alien");

        alien.show();


    }

}
