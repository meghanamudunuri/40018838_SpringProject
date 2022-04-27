 package com.ltts.Springrestapi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Springrestapi.model.Passenger;
import com.ltts.Springrestapi.service.PassengerService;



@RestController
public class PassengerController {
	
	@Autowired
	private PassengerService pService;
	
	
	@GetMapping(value="/passengers")
	public List<Passenger> getPassengers () {
		return pService.getPassengers();
	}

	@GetMapping("/passengers/{id}")
	public Passenger getPassenger(@PathVariable("id") Long id) {
		return pService.getPassengerById(id);
	}
	
	@PostMapping("/passengers")
	public Passenger save(@RequestBody Passenger p) {
		return pService.savePassengers(p);
	}
	
	@PutMapping("/passengers/{id}")
	public Passenger update(@RequestBody Passenger p, @PathVariable Long id) {
		p.setId(id);
		return pService.updatePassenger(p);
	}
		
	@DeleteMapping("/passengers")
	public void deletePassenger(@RequestParam("id") Long id) {
		pService.deletePassenger(id);
	}
}
