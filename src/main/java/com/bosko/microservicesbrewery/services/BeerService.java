package com.bosko.microservicesbrewery.services;

import com.bosko.microservicesbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

}
