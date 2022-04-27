package com.ltts.Springrestapi.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//Testing

class PassengerTest {

	@Test
	void testSetId() {
		Passenger passenger = new Passenger();
		passenger.setId(1L);
		Long actual = passenger.getId();
		Long expected = 1L;
		assertEquals(expected,actual);
	}
	
	@Test
	void testSetAge() {
		Passenger passenger = new Passenger();
		passenger.setAge(1L);
		Long actual = passenger.getAge();
		Long expected = 1L;
		assertEquals(expected,actual);
	}
	
	@Test
	void testSetName() {
		Passenger passenger = new Passenger();
		passenger.setName("n");
		String actual = passenger.getName();
		String expected = "n";
		assertEquals(expected,actual);
	}

	@Test
	void testSetDestination() {
		Passenger passenger = new Passenger();
		passenger.setDestination("d");
		String actual = passenger.getDestination();
		String expected = "d";
		assertEquals(expected,actual);
	}
	
	@Test
	void testSetArrival() {
		Passenger passenger = new Passenger();
		passenger.setArrival("a");
		String actual = passenger.getArrival();
		String expected = "a";
		assertEquals(expected,actual);
	}
	
	@Test
	void testSetEmail() {
		Passenger passenger = new Passenger();
		passenger.setEmail("e");
		String actual = passenger.getEmail();
		String expected = "e";
		assertEquals(expected,actual);
	}

}
