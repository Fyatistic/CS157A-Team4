package com.example.aroundtheworld;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<TravelUser, Long>{
	TravelUser findByUsername(String username);
}