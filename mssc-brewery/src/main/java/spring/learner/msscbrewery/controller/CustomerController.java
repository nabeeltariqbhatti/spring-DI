package spring.learner.msscbrewery.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.learner.msscbrewery.web.model.CustomerDto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> getCustomer(@NotNull  @PathVariable UUID customerId){

        System.out.println(CustomerDto.builder().id(customerId).name("Alex").build());
        return new  ResponseEntity<CustomerDto>(CustomerDto.builder().id(customerId).name("Alex").build(),HttpStatus.FOUND);
    }

   @PostMapping
    public ResponseEntity<CustomerDto> createCustomer(@Valid @NotNull @RequestBody CustomerDto customerDto){
        CustomerDto newCustomerDto = CustomerDto.builder().id(UUID.randomUUID()).name("Alex").build();
        return   ResponseEntity.created(URI.create("http://loclahost:8080/api/v1/customer/" + newCustomerDto.getId())).body(newCustomerDto);
    }
    @PutMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> updateCustomer(@NotNull @PathVariable UUID customerId, @Valid @RequestBody CustomerDto customerDto){
        return new  ResponseEntity(null,HttpStatus.NO_CONTENT);
    }
    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable UUID customerId){

    }


}
