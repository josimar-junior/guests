package com.jj.guest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jj.guest.model.Guest;
import com.jj.guest.service.GuestService;

@Controller
@RequestMapping("/guests")
public class GuestsController {

	@Autowired
	private GuestService guestService;
	
	@GetMapping
	public ModelAndView findAll() {
		ModelAndView modelAndView = new ModelAndView("guests");
		modelAndView.addObject("guests", guestService.findAll());
		modelAndView.addObject(new Guest());
		return modelAndView;
	}
	
	@PostMapping
	public String save(Guest guest) {
		guestService.save(guest);
		return "redirect:/guests";
	}
}
