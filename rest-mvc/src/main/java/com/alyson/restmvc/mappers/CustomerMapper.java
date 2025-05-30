package com.alyson.restmvc.mappers;

import com.alyson.restmvc.entities.Customer;
import com.alyson.restmvc.models.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO dto);

    CustomerDTO customerToCustomerDto(Customer customer);

}
