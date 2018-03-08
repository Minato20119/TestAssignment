/**
 * 
 */
package com.minato.springboot.intfDAO;

import java.util.List;

import com.minato.springboot.entity.Book;

/**
 * @author Minato
 *
 */
public interface IBookDAO {

	public List<Book> getAllBooks();
	
	public Book getBookById(int id);
	
	public boolean addBook(Book book);
	
	public boolean updateBook(Book book);
	
	public boolean deleteById(int id);
	
	public boolean deleteAll();
	
	public boolean bookExist(String name);
}
