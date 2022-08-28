package com.brmgf.readings.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Reader {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String forename;
	private String surname;
	private String email;
	private List<Genre> likings;
	@OneToMany(mappedBy = "reader")
	private List<Reading> readings;
	
	public Reader() {}
	
	public Reader(Long id, String forename, String surname, String email, List<Genre> likings) {
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.email = email;
		this.likings = likings;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getForename() {
		return forename;
	}
	
	public void setForename(String forename) {
		this.forename = forename;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Genre> getLikings() {
		return likings;
	}
	
	public void setLikings(List<Genre> likings) {
		this.likings = likings;
	}

	public List<Reading> getReadings() {
		return readings;
	}

	public void setReadings(List<Reading> readings) {
		this.readings = readings;
	}
	
}
