package com.alyson.restmvc.mappers;

import com.alyson.restmvc.entities.Beer;
import com.alyson.restmvc.models.BeerDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}
