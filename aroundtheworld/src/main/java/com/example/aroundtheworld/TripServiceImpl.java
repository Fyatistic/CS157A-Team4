package com.example.aroundtheworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aroundtheworld.Trip;
import com.example.aroundtheworld.User;
import com.example.aroundtheworld.TripRepository;
import com.example.aroundtheworld.UserTripDto;

@Service
public class TripServiceImpl implements TripService {

    @Autowired
    private TripRepository tripRepository;

    public TripServiceImpl(TripRepository tp) {
        super();
        tripRepository = tp;
    }
    
    @Override
    public Trip save(UserTripDto tripDto) {
        Trip trip = new Trip(tripDto.getStartDate(), tripDto.getEndDate(), tripDto.getLocation(), tripDto.getDescription(), tripDto.getTripRating());
        return tripRepository.save(trip);
    }
}
