package com.ltts.Springrestapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="passenger_table")
public class Passenger {

	public Passenger(Long id, Long age, String name, String destination, String arrival, String email) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.destination = destination;
		this.arrival = arrival;
		this.email = email;
	}

	public Passenger() {
		super();
	}

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="age")
	private Long age;
	
	@Column(name="name")
	private String name;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="arrival")
	private String arrival;
	
	@Column(name="email")
	private String email;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", age=" + age + ", name=" + name + ", destination=" + destination + ", arrival="
				+ arrival + ", email=" + email + "]";
	}

	



	
	
	

}
