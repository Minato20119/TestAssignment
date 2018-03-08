/**
 * 
 */
package com.minato.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minato.springboot.entity.Reader;

/**
 * @author Minato
 *
 */
public interface ReaderRepository extends JpaRepository<Reader, Integer> {

}
