package com.codeclan.example.boookingLab.controllers;

import com.codeclan.example.boookingLab.models.Customer;
import com.codeclan.example.boookingLab.repositories.bookingRepository.BookingRepository;
import com.codeclan.example.boookingLab.repositories.courseRepository.CourseRepository;
import com.codeclan.example.boookingLab.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/bookings/course/{id}")
    public List<Customer> findCustomerByCourse(@PathVariable Long id){
        return customerRepository.findCustomerByCourse(id);
    }


}
