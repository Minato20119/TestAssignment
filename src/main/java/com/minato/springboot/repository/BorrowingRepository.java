/**
 * 
 */
package com.minato.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minato.springboot.entity.Borrowing;

/**
 * @author Minato
 *
 */
public interface BorrowingRepository extends JpaRepository<Borrowing, Integer> {

}
