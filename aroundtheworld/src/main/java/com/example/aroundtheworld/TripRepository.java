package com.example.aroundtheworld;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TripRepository extends JpaRepository<Trip, Long>{
    public List<Trip> findAllByUser(TravelUser user);
}