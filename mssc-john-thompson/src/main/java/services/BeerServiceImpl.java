package services;

import model.BeerDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;


public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}