package com.emrecan.springbootbookseller.controller;

import com.emrecan.springbootbookseller.model.Book;
import com.emrecan.springbootbookseller.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Emrecan
 * @created 06/11/2021 - 01:52
 */

@RestController
@RequestMapping("api/books")
public class BooksController {

    @Autowired
    private IBookService bookService;

    @PostMapping //api/books
    public ResponseEntity<?> saveBook(@RequestBody Book book){
        return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.CREATED);
    }

    @DeleteMapping("{bookId}")
    public ResponseEntity<?> deleteBook(@PathVariable Long bookId){
        bookService.deleteBook(bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping //api/books
    public ResponseEntity<?> getAllBooks(){
        return new ResponseEntity<>(bookService.findAllBooks(), HttpStatus.OK);
    }


}
