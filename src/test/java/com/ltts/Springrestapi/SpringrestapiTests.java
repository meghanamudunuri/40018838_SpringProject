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
		System.out.println(list);
		assertThat(list).size().isGreaterThan(0);
	}
	
	@Test
	public void testIndividual() {
		Passenger p = pr.findById(1L).get();
		assertEquals(30L, p.getAge());
	}
	
	@Test
	public void testUpdate() {
		Passenger p = pr.findById(1L).get();
		p.setAge(30L);
		Long actual=pr.findById(1L).get().getAge();
		pr.save(p);
		Long expected = 40L;
		assertNotEquals(expected,actual);
	}
	
	@Test
	public void testDelete() {
		pr.deleteById(1L);
		assertThat(pr.existsById(1L)).isFalse();
	}
	
}
