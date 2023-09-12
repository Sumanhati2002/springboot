package com.springboot.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.api.model.Book;
import com.springboot.api.service.BookService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/books")
public class MainController {

	private BookService bookService;
	
	// build create User REST API
    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        Book savedBook = bookService.createBook(book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }
    
    @GetMapping("{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") int id){
    	Book book = bookService.getBookById(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
    
    @PutMapping("{id}")
    // http://localhost:8080/api/users/1
    public ResponseEntity<Book> updateBook(@PathVariable("id") int id,
                                           @RequestBody Book book){
    	book.setId(id);
    	Book updatedBook = bookService.updateUser(book);
        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }
    
}























