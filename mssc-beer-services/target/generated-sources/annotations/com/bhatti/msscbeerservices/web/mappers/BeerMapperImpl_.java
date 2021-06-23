package com.bhatti.msscbeerservices.web.mappers;

import com.bhatti.msscbeerservices.domain.Beer;
import com.bhatti.msscbeerservices.web.model.BeerDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-06-22T16:28:37+0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16 (Oracle Corporation)"
)
public class BeerMapperImpl_ implements BeerMapper {

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto beerDto = new BeerDto();

        return beerDto;
    }

    @Override
    public BeerDto beerToBeerDtoWithInventory(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto beerDto = new BeerDto();

        return beerDto;
    }

    @Override
    public Beer beerDtoToBeer(BeerDto dto) {
        if ( dto == null ) {
            return null;
        }

        Beer beer = new Beer();

        return beer;
    }
}
