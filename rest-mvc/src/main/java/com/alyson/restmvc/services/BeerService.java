package com.alyson.restmvc.services;

import com.alyson.restmvc.models.BeerDTO;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BeerService {

    List<BeerDTO> listBeers();

    Optional<BeerDTO> getBeerById(UUID id);

    BeerDTO saveNewBeer(BeerDTO beerDTO);

    Optional<BeerDTO> updateBeerById(UUID beerId, BeerDTO beerDTO);

    void deleteBeerById(UUID beerId);

    void patchBeerById(UUID beerId, BeerDTO beerDTO);
}
