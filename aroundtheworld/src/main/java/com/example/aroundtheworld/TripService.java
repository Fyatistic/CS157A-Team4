package com.example.aroundtheworld;

import java.util.List;

public interface TripService {
    Trip save(UserTripDto tripDto);
    List<Trip> findAllTrips();
    //Trip findTripByUserID(long userid);
    //void deleteTrip(long tripid);
}
