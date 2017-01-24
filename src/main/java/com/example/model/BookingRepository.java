package com.example.model;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Bookings, Long> {

	Collection<Bookings> findByBookingName(String bookingName);

}
