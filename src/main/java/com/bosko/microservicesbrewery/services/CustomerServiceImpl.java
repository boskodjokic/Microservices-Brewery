package com.bosko.microservicesbrewery.services;

import com.bosko.microservicesbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Customer 1").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a customer");
    }
}
