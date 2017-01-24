package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bookings {

	@Id
	@GeneratedValue
	private Long id;

	private String bookingName;

	public Bookings(String bookingName) {
		super();
		this.bookingName = bookingName;
	}
	
	public Bookings() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBookingName() {
		return bookingName;
	}

	public void setBookingName(String bookingName) {
		this.bookingName = bookingName;
	}

	@Override
	public String toString() {
		return "Bookings [id=" + id + ", bookingName=" + bookingName + "]";
	}
}
