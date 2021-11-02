package com.emrecan.springbootbookseller.service;

import com.emrecan.springbootbookseller.model.Book;

import java.util.List;

/**
 * @author Emrecan
 * @created 31/10/2021 - 23:49
 */
public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
