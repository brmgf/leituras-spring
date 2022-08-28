package com.brmgf.readings.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String author;
	private Integer pages;
	private List<Genre> genre;
	@OneToMany(mappedBy = "book")
	private List<Reading> readings;
	
	public Book () {}
	
	public Book(Long id, String title, String author, Integer pages, List<Genre> genre) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.genre = genre;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Integer getPages() {
		return pages;
	}
	
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	
	public List<Genre> getGenre() {
		return genre;
	}
	
	public void setGenre(List<Genre> genre) {
		this.genre = genre;
	}

	public List<Reading> getReadings() {
		return readings;
	}

	public void setReadings(List<Reading> readings) {
		this.readings = readings;
	}

}
