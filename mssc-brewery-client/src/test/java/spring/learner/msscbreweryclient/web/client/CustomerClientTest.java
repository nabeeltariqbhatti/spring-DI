package spring.learner.msscbreweryclient.web.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.learner.msscbreweryclient.web.model.CustomerDto;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerClientTest {

    @Autowired
    CustomerClient customerClient;

    @Test
    public void getCustomerById(){
        customerClient.getCustomerById(UUID.randomUUID());
    }
    @Test
    public void crateCustomer(){

        CustomerDto customerDto = CustomerDto.builder().name("John").build();
        customerClient.saveNewCustomer(customerDto);
    }

    @Test void updateCustomer(){
        customerClient.updateCustomer(UUID.randomUUID(),CustomerDto.builder().build());
    }
}