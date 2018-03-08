/**
 * 
 */
package com.minato.springboot.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Minato
 *
 */
@Entity
public class Borrowing implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Book book;
	private Reader reader;
	private Date borrowedDay;
	private Date reimbursedDay;

	@Id
	@ManyToOne
	@JoinColumn(name = "book_id")
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Id
	@ManyToOne
	@JoinColumn(name = "reader_id")
	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public Date getBorrowedDay() {
		return borrowedDay;
	}

	public void setBorrowedDay(Date borrowedDay) {
		this.borrowedDay = borrowedDay;
	}

	public Date getReimbursedDay() {
		return reimbursedDay;
	}

	public void setReimbursedDay(Date reimbursedDay) {
		this.reimbursedDay = reimbursedDay;
	}

}
