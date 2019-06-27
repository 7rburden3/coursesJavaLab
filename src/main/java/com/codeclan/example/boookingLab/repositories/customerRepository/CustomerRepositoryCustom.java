package com.codeclan.example.boookingLab.repositories.customerRepository;

import com.codeclan.example.boookingLab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomerByCourse(Long id);
}
