package spring.learner.msscbrewery.web.model.mappers;


import org.mapstruct.Mapper;
import spring.learner.msscbrewery.domain.Beer;
import spring.learner.msscbrewery.web.model.BeerDto;

@Mapper
public interface BeerMapper {
    BeerDto beerDto (Beer beer);
    Beer beerDtoToBeer (BeerDto dto);
}
