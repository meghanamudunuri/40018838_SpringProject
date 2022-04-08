package com.ltts.Springrestapi.service;

import java.util.List;


import com.ltts.Springrestapi.model.Passenger;

public interface PassengerService {

	List<Passenger> getPassengers();
		
	Passenger savePassengers(Passenger passenger);
	
	Passenger getPassengerById(Long Id);
	
	void deletePassenger(Long id);
	
	Passenger updatePassenger(Passenger passenger);
}
