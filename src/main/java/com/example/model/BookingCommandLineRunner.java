package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookingCommandLineRunner implements CommandLineRunner {

	@Autowired
	BookingRepository bookingRepository;

	@Override
	public void run(String... arg0) throws Exception {

		for (Bookings b : this.bookingRepository.findAll()) {
			System.out.println(b.toString());
		}

	}

}
