package com.alyson.restmvc.services;

import com.alyson.restmvc.models.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {

    List<Beer> listBeers();

    Beer getBeerById(UUID id);
}
