package com.alyson.restmvc.services;

import com.alyson.restmvc.models.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

    List<Customer> listCustomers();

    Customer getCustomerById(UUID customersId);

}
