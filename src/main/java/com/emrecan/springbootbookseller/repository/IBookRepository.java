package com.emrecan.springbootbookseller.repository;

import com.emrecan.springbootbookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Emrecan
 * @created 31/10/2021 - 23:36
 */
public interface IBookRepository extends JpaRepository<Book, Long> {


}
