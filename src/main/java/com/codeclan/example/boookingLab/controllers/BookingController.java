package com.codeclan.example.boookingLab.controllers;

import com.codeclan.example.boookingLab.models.Booking;
import com.codeclan.example.boookingLab.repositories.bookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping
    public List<Booking> getAllBookings(){
        return bookingRepository.findAll();
    }

    @GetMapping(value = "/date/{date}")
    public List<Booking> findBookingByDate(@PathVariable String date){
        return bookingRepository.findBookingByDate(date);
    }
}
