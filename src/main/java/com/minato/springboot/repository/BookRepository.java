/**
 * 
 */
package com.minato.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minato.springboot.entity.Book;

/**
 * @author Minato
 *
 */
public interface BookRepository extends JpaRepository<Book, Integer> {
	Book findByNameBook(String nameBook);
}
