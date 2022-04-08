package com.ltts.Springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ltts.Springrestapi.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {

	
}
