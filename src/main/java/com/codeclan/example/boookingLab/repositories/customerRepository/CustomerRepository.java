package com.codeclan.example.boookingLab.repositories.customerRepository;

import com.codeclan.example.boookingLab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
