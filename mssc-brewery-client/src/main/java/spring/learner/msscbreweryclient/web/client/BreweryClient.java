package spring.learner.msscbreweryclient.web.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import spring.learner.msscbreweryclient.web.model.BeerDto;

import java.net.URI;
import java.util.UUID;

@Component
@ConfigurationProperties(value = "sfg.brewery", ignoreInvalidFields = false)
public class BreweryClient {



    public final String BEER_PATH_V1 = "/api/v1/beer/";
    private String apihost;
    private final RestTemplate restTemplate;

    public BreweryClient( RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();
    }

    public BeerDto getBeerById(UUID beerId) {
        return restTemplate.getForObject(apihost + BEER_PATH_V1 + beerId.toString(), BeerDto.class);
    }

    public URI saveNewBeerDto(BeerDto beerDto){

        return restTemplate.postForLocation(apihost+BEER_PATH_V1,beerDto);
    }
    public void updateBeer(UUID beerId, BeerDto beerDto){
        restTemplate.put(apihost + BEER_PATH_V1 + "/" + beerId.toString(), beerDto);
    }

    public void setApiHost(String apihost) {
        this.apihost = apihost;
    }
}
