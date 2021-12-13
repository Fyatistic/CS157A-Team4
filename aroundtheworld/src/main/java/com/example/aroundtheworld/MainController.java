package com.example.aroundtheworld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    TripService tripService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/")
	public String myTrips(Model model) {
        List<Trip> trips = tripService.findAllTripsForCurrentUser();
        model.addAttribute("trips", trips);
		return "index";
	}

    @GetMapping("/error")
    public String error(){
        return "error";
    }
}
