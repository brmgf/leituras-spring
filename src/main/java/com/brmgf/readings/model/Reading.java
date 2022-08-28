package com.brmgf.readings.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reading {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "reader_id")
	private Reader reader;
	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book book;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private Double rating;
	
	public Reading () {}
	
	public Reading(Long id, Reader reader, Book book, LocalDateTime startDate, LocalDateTime endDate, Double rating) {
		super();
		this.id = id;
		this.reader = reader;
		this.book = book;
		this.startDate = startDate;
		this.endDate = endDate;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Reader getReader() {
		return reader;
	}
	
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	
	public Book getBook() {
		return book;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	public LocalDateTime getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	
	public LocalDateTime getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
	
	public Double getRating() {
		return rating;
	}
	
	public void setRating(Double rating) {
		this.rating = rating;
	}
	
}
