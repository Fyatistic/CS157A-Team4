package com.example.aroundtheworld;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TripRepository extends JpaRepository<Trip, Long>{
	Collection<Trip> findByUser(User user);
}