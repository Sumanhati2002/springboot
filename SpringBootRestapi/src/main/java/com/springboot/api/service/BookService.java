package com.springboot.api.service;

import java.util.List;

import com.springboot.api.model.Book;

public interface BookService {

	Book createBook(Book book);
	List<Book> getAllBooks();
	Book getBookById(int id);

	void deleteBook(int id);
	Book updateUser(Book book);
}
