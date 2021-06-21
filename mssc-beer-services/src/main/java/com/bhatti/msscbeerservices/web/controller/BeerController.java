package com.bhatti.msscbeerservices.web.controller;

import com.bhatti.msscbeerservices.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("api/v1/beer")
public class BeerController {
    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beeerId){
        //todo impl
        return ResponseEntity.ok().body(BeerDto.builder().build());

    }

    @PostMapping
    public ResponseEntity<BeerDto> saveNewBeer(@Valid @RequestBody @Validated BeerDto beerDto){

        return ResponseEntity.created(URI.create("")).body(BeerDto.builder().build());
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity updateBeerById(@Valid @Validated @PathVariable("beerId") UUID beeerId){
        //todo impl
        return new ResponseEntity(null, HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeerById(@PathVariable("beerId") UUID beerId){

    }
}
