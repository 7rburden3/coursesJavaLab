package com.codeclan.example.boookingLab.repositories.bookingRepository;

import com.codeclan.example.boookingLab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
