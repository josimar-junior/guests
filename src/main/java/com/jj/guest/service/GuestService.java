package com.jj.guest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jj.guest.model.Guest;
import com.jj.guest.repository.Guests;

@Service
public class GuestService {

	@Autowired
	private Guests guests;
	
	public List<Guest> findAll() {
		return guests.findAll();
	}
	
	public void save(Guest guest) {
		guests.save(guest);
	}
}
