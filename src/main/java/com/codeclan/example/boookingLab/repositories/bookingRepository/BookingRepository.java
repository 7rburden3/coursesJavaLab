package com.codeclan.example.boookingLab.repositories.bookingRepository;

import com.codeclan.example.boookingLab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findBookingByDate(String date);
}
