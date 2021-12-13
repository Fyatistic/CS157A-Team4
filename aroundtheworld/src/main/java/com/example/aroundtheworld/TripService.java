package com.example.aroundtheworld;

import java.util.List;

public interface TripService {
    Trip save(UserTripDto tripDto);
    List<Trip> findAllTrips();
    List<Trip> findAllTripsForCurrentUser();
}
