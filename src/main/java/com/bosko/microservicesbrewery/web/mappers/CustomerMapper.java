package com.bosko.microservicesbrewery.web.mappers;

import com.bosko.microservicesbrewery.domain.Customer;
import com.bosko.microservicesbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
