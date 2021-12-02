package com.example.aroundtheworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/createtrip")
public class UserTripController {
    private TripServiceImpl tripService;

    public UserTripController(TripServiceImpl tripService) {
        super();
        this.tripService = tripService;
        
    }

    @ModelAttribute("trip")
    public UserTripDto userTripDto() {
        return new UserTripDto();
    }

    // get request
    @GetMapping
    public String showTripForm() {
        return "createtrip";
    }

    // post request
    @PostMapping
    public String createTrip(@ModelAttribute("user") UserTripDto tripDto) {
        tripService.save(tripDto);
        return "redirect:/createtrip?success";
    }
}
