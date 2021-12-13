package com.example.aroundtheworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;

import java.security.Principal;
import java.util.List;

import com.example.aroundtheworld.Trip;
import com.example.aroundtheworld.TravelUser;
import com.example.aroundtheworld.TripRepository;
import com.example.aroundtheworld.UserTripDto;

@Service
public class TripServiceImpl implements TripService {

    @Autowired
    private TripRepository tripRepository;
    
    @Autowired
    private UserRepository userRepository;

    public TripServiceImpl(TripRepository tp) {
        super();
        tripRepository = tp;
    }
    
    @Override
    public Trip save(UserTripDto tripDto) {
        TravelUser currentUser = getCurrentUser();
        
        Trip trip = new Trip(tripDto.getStartDate(), tripDto.getEndDate(), tripDto.getLocation(), tripDto.getDescription(), tripDto.getTripRating(), currentUser);
        return tripRepository.save(trip);
    }

    private TravelUser getCurrentUser() {
        User pricipal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String userName = pricipal.getUsername();
        TravelUser currentUser = userRepository.findByUsername(userName);
        return currentUser;
    }
    
    @Override
    public List<Trip> findAllTrips() {
        return tripRepository.findAll();
    }
    
    @Override
    public List<Trip> findAllTripsForCurrentUser() {
        TravelUser currentUser = getCurrentUser();
        return tripRepository.findAllByUser(currentUser);
    }
}
