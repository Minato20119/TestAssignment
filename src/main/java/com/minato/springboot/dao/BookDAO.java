/**
 * 
 */
package com.minato.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.minato.springboot.entity.Book;
import com.minato.springboot.intfDAO.IBookDAO;
import com.minato.springboot.repository.BookRepository;

/**
 * @author Minato
 *
 */
public class BookDAO implements IBookDAO {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book getBookById(int id) {
		return bookRepository.findOne(id);
	}

	@Override
	public boolean addBook(Book book) {
		if (bookRepository.)
		bookRepository.save(book);
		return false;
	}

	@Override
	public boolean updateBook(Book book) {
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		return false;
	}

	@Override
	public boolean deleteAll() {
		return false;
	}

	@Override
	public boolean bookExist(String name) {
		return false;
	}

}
