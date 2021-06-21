package spring.learner.msscbrewery.web.model.mappers;


import org.mapstruct.Mapper;
import spring.learner.msscbrewery.domain.Customer;
import spring.learner.msscbrewery.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {

    CustomerDto customerDto (Customer customer);

    Customer customer (CustomerDto customerDto);
}
