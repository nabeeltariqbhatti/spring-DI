package com.bhatti.msscbeerservices;

import com.bhatti.msscbeerservices.domain.Beer;
import com.bhatti.msscbeerservices.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class MsscBeerServicesApplication {
    private final BeerRepository beerRepository;



    public MsscBeerServicesApplication(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MsscBeerServicesApplication.class, args);
    }


}
