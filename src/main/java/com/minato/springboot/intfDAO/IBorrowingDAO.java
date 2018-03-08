/**
 * 
 */
package com.minato.springboot.intfDAO;

import java.util.List;

import com.minato.springboot.entity.Borrowing;

/**
 * @author Minato
 *
 */
public interface IBorrowingDAO {

	public List<Borrowing> getAllBorrowing();
	
	public Borrowing getBorrowingById(int id);
	
	public int addBorrowing(Borrowing borrowing);
	
	public boolean updateBorrowing(Borrowing borrowing);
	
	public boolean deleteBorrowingById(int id);
	
	public boolean deleteAllBorrowing();
}
