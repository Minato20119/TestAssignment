/**
 * 
 */
package com.minato.springboot.intfDAO;

import java.util.List;

import com.minato.springboot.entity.Reader;

/**
 * @author Minato
 *
 */
public interface IReaderDAO {

	public List<Reader> getAllReaders();

	public Reader getReaderById(int id);

	public boolean addReader(Reader reader);

	public boolean updateReader(Reader reader);

	public boolean deleteById(int id);

	public boolean deleteAll();
}
