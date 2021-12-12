package com.example.aroundtheworld;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public String createTrip(@ModelAttribute("trip") UserTripDto tripDto) {
        tripService.save(tripDto);
        return "createtrip_success";
    }

   @GetMapping("/index") 
   public String getTrips(Model model) {
        List<Trip> trips = tripService.findAllTrips();
        model.addAttribute("trips", trips);
        return "index";
   }
}
