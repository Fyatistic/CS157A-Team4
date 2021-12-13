package com.example.aroundtheworld;


import java.sql.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.JoinColumn;

@Entity
@Table (name = "trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tripid;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

    private String location;

    private String description;

    private int tripRating;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable=true)
    private TravelUser user;

    public Trip() {
        super();
    }

    public Trip(Date startDate, Date endDate, String location, String description, int tripRating, TravelUser user) {
        super();
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.description = description;
        this.tripRating = tripRating;
        this.user = user;
    }

    public Long getTripId() {
		return tripid;
	}
	public void setId(Long tripid) {
		this.tripid = tripid;
	}
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getTripRating() {
        return tripRating;
    }
    public void setTripRating(int tripRating) {
        this.tripRating = tripRating;
    }
}