package com.ltts.Springrestapi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.*;
import com.ltts.Springrestapi.model.Passenger;
import com.ltts.Springrestapi.repository.PassengerRepository;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import static org.junit.Assert.fail;

//for testing

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
public class SpringrestapiTests {
	
	@Autowired
	PassengerRepository pr;
	
	@Test
	@BeforeEach
	public void testCreate() {
		Passenger p = new Passenger();
		p.setId(1L);
		p.setAge(30L);
		p.setName("Kiran");
		p.setDestination("Mysore");
		p.setArrival("Banglore");
		p.setEmail("abc@gmail.com");		
		pr.save(p);
		assertNotNull(pr.findById(1L).get());
	}
	
	@Test
	public void testReadAll() {
		List<Passenger> list = pr.findAll();
		assertThat(list).size().isGreaterThan(0);
	}

	@Test
	public void testIndividual1() {
		Passenger p = pr.findById(1L).get();
		assertEquals(30L, p.getAge());
	}
	
	@Test
	public void testIndividual2() {
		Passenger p = pr.findById(2L).get();
		assertEquals(30L, p.getAge());
	}
	
	@Test
	public void testIndividual3() {
		Passenger p = pr.findById(3L).get();
		assertEquals(45L, p.getAge());
	}
	
	@Test
	public void testNotIndividualByAge() {
		Passenger p = pr.findById(1L).get();
		assertNotEquals(Long.valueOf(20L), p.getAge());
	}
	
	@Test
	public void testNotIndividual2ByAge() {
		Passenger p = pr.findById(2L).get();
		assertNotEquals(Long.valueOf(40L), p.getAge());
	}
	
	@Test
	public void testNotIndividual3ByAge() {
		Passenger p = pr.findById(3L).get();
		assertNotEquals(Long.valueOf(40L), p.getAge());
	}
	
	@Test
	public void testNotIndividual1ByName() {
		Passenger p = pr.findById(1L).get();
		assertNotEquals("kiran", p.getName());
	}
	
	@Test
	public void testNotIndividual2ByName() {
		Passenger p = pr.findById(2L).get();
		assertNotEquals("mary", p.getName());
	}
	
	@Test
	public void testNotIndividual3ByName() {
		Passenger p = pr.findById(3L).get();
		assertNotEquals("john", p.getName());
	}
	
	@Test
	public void testNotIndividualByArrival() {
		Passenger p = pr.findById(1L).get();
		assertNotEquals("Mysore", p.getArrival());
	}
	
	@Test
	public void testNotIndividual2ByArrival() {
		Passenger p = pr.findById(2L).get();
		assertNotEquals("Mysore", p.getArrival());
	}
	
	@Test
	public void testNotIndividual3ByArrival() {
		Passenger p = pr.findById(3L).get();
		assertNotEquals("Mysore", p.getArrival());
	}
	
	@Test
	public void testNotIndividual1ByDestination() {
		Passenger p = pr.findById(1L).get();
		assertNotEquals("Hyderabad", p.getDestination());
	}
	
	@Test
	public void testNotIndividual2ByDestination() {
		Passenger p = pr.findById(2L).get();
		assertNotEquals("Chennai", p.getDestination());
	}
	
	@Test
	public void testNotIndividual3ByDestination() {
		Passenger p = pr.findById(3L).get();
		assertNotEquals("Pune", p.getDestination());
	}
	
	@Test
	public void testNotIndividual1ByEmail() {
		Passenger p = pr.findById(1L).get();
		assertNotEquals("meghana@gmail.com", p.getEmail());
	}
	
	@Test
	public void testNotIndividual2ByEmail() {
		Passenger p = pr.findById(2L).get();
		assertNotEquals("xyz@gmail.com", p.getEmail());
	}
	
	@Test
	public void testNotIndividual3ByEmail() {
		Passenger p = pr.findById(3L).get();
		assertNotEquals("xyz@gmail.com", p.getEmail());
	}
	
	@Test
	public void testUpdate() {
		Passenger p = pr.findById(1L).get();
		Long Expectedage = 40L;
		p.setAge(Expectedage);
		pr.save(p);
		System.out.println(p);
		Long actual=pr.findById(1L).get().getAge();	
		assertEquals(Expectedage,actual);
	}
	
	@Test
	public void testDeleteById() {
		pr.deleteById(1L);
		assertThat(pr.existsById(1L)).isFalse();
	}
	
}
