/**
 * 
 */
package com.minato.springboot.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Minato
 *
 */
@Entity
public class Book {

	private int id;
	private String nameBook;
	private String publisher;
	private int publishYear;

	private Set<Borrowing> borrowings = new HashSet<>();

	public Book() {

	}

	public Book(int id, String nameBook, String publisher, int publishYear) {
		this.id = id;
		this.nameBook = nameBook;
		this.publisher = publisher;
		this.publishYear = publishYear;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	@OneToMany(mappedBy = "book")
	public Set<Borrowing> getBorrowings() {
		return borrowings;
	}

	public void setBorrowings(Set<Borrowing> borrowings) {
		this.borrowings = borrowings;
	}

}
