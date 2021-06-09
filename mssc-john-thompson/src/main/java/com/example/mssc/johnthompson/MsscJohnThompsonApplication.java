package com.example.mssc.johnthompson;

import controllers.BeerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = BeerController.class)
public class MsscJohnThompsonApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscJohnThompsonApplication.class, args);
    }

}
