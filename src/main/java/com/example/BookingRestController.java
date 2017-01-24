package com.example;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.BookingRepository;
import com.example.model.Bookings;

@RestController
public class BookingRestController {

	@Autowired
	BookingRepository bookingRepository;

	@RequestMapping("/bookings")
	Collection<Bookings> bookings() {
		return this.bookingRepository.findAll();
	}
}
