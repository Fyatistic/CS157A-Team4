package com.example.aroundtheworld;


import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.JoinColumn;

@Entity
@Table(name =  "user", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
public class TravelUser {
	// primary key
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	private String email;
	
	private String password;
	
	// retrieves all roles eagerly given user
	// operations on parent entity also performed on child entities
	@ManyToMany(cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(
		            name = "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(
				            name = "role_id", referencedColumnName = "id"))
	private Collection<Role> roles;

	//@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	//@LazyCollection(LazyCollectionOption.FALSE)
	@JoinColumn(name="user_id")
	private Collection<Trip> trips;


	// @ManyToMany(fetch = FetchType.EAGER)
	// @JoinTable(
	// 	name = "relation",
	// 	joinColumns =  @JoinColumn(name = "user_id"),
	// 	inverseJoinColumns = @JoinColumn(name = "following_id"))
	// private Collection<User> following;
	
	public TravelUser() {
		
	}
	
	public TravelUser(String username, String email, String password, Collection<Role> roles) {
		super();
    	this.username = username;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
  	public String getUsername() {
    	return username;
  	}

  	public void setUsername(String username) {
    	this.username = username;
  	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	public Collection<Trip> getTrips() {
		return trips;
	}
	public void setTrips(Collection<Trip> trips) {
		this.trips = trips;
	}
	// public Collection<User> getFollowers() {
	// 	return following;
	// }
	// public void setFollowers(Collection<User> following) {
	// 	this.following = following;
	// }
}