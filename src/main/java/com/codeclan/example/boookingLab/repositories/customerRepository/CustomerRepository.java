package com.codeclan.example.boookingLab.repositories.customerRepository;

import com.codeclan.example.boookingLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findCustomerByCourse(Long id);
}
