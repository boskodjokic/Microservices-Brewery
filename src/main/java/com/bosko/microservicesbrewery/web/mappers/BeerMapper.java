package com.bosko.microservicesbrewery.web.mappers;

import com.bosko.microservicesbrewery.domain.Beer;
import com.bosko.microservicesbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
