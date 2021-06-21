package spring.learner.msscbreweryclient.web.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.learner.msscbreweryclient.web.model.BeerDto;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class BreweryClientTest {

    @Autowired
    BreweryClient breweryClient;
    @Test
    void getBeerById() {
        BeerDto beerDto = breweryClient.getBeerById(UUID.randomUUID());
        assertNotNull(beerDto);
    }

    @Test
    void testSaveNewBeer(){
    URI uri = breweryClient.saveNewBeerDto(BeerDto.builder().beerName("Blank Beer").beerStyle("style less").build());

    assertNotNull(uri);
    System.out.println(uri.toString());
    }

    @Test

    void testUpdateBeer(){
        breweryClient.updateBeer(UUID.randomUUID(),BeerDto.builder().build());
    }


}