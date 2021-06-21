package spring.learner.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import spring.learner.msscbrewery.web.model.BeerDto;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(beerId).beerName("galaxy Beer").beerStyle("good Style").build();
    }

    @Override
    public BeerDto craeteBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName(beerDto.getBeerName()).upc(beerDto.getUpc()).beerStyle(beerDto.getBeerStyle()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        log.debug("Deleted Successfully ....");


    }

    @Override
    public void deleteBeer(UUID beerId) {

    }
}
