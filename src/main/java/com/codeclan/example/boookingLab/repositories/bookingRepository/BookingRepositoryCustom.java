package com.codeclan.example.boookingLab.repositories.bookingRepository;

import com.codeclan.example.boookingLab.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {

    List<Booking> findBookingByDate(String date);
}
