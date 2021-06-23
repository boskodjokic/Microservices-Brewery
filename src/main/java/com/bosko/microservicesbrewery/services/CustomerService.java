package com.bosko.microservicesbrewery.services;

import com.bosko.microservicesbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

}
