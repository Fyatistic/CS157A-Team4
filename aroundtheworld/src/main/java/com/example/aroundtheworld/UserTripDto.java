package com.example.aroundtheworld;

import java.sql.Date;

public class UserTripDto {
    private Date startDate;
    private Date endDate;
    private String location;
    private String description;
    private int tripRating;

    public UserTripDto() {

    }

    public UserTripDto(Date startDate, Date endDate, String location, String description, int tripRating) {
        super();
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.description = description;
        this.tripRating = tripRating;
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
