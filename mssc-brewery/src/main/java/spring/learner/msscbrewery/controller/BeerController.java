package spring.learner.msscbrewery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import spring.learner.msscbrewery.services.BeerService;
import spring.learner.msscbrewery.web.model.BeerDto;

import javax.validation.ConstraintDefinitionException;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.lang.reflect.Array;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Validated
@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @Autowired
    BeerService  beerService;
    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeerById(@NotNull  @PathVariable("beerId") UUID beerId){
        return new ResponseEntity<BeerDto>(this.beerService.getBeerById(beerId),HttpStatus.OK);
    }
    @PostMapping
    public  ResponseEntity<BeerDto> createBeer(@Valid @NotNull @RequestBody BeerDto beerDto){
        System.out.println(beerDto);
        BeerDto newBeer = beerService.craeteBeer(beerDto);
        //this will simply give you the location in the header
       return  ResponseEntity.created(URI.create("http://localhost:8080/api/v1/beer/"+newBeer.getId())).body(newBeer);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> updateBeerById( @PathVariable("beerId") UUID beerId, @Valid @RequestBody BeerDto beerDto){
      this.beerService.updateBeer(beerId,beerDto);
      return new ResponseEntity<BeerDto>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId){
        beerService.deleteBeer(beerId);

    }

}
