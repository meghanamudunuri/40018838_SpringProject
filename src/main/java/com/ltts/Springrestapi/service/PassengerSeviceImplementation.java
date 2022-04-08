package com.ltts.Springrestapi.service;

import java.util.ArrayList;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ltts.Springrestapi.model.Passenger;
import com.ltts.Springrestapi.repository.PassengerRepository;

@Service
public class PassengerSeviceImplementation implements PassengerService {

	@Autowired
	private PassengerRepository pRepository;
	
	@Override
	public List<Passenger> getPassengers(){
		return pRepository.findAll();
		
	}

	@Override
	public Passenger savePassengers(Passenger passenger) {
		return pRepository.save(passenger);
	}

	@Override
	public Passenger getPassengerById(Long id) {
		Optional<Passenger> passenger = pRepository.findById(id);
		
		if(passenger.isPresent()) {
			return passenger.get();
		}
		else {
			throw new RuntimeException("Passenger is not found with id "+id);
		}
		
	}

	@Override
	public void deletePassenger(Long id) {
		pRepository.deleteById(id); 
	}

	@Override
	public Passenger updatePassenger(Passenger passenger) {
		
		return pRepository.save(passenger);
	}
}
