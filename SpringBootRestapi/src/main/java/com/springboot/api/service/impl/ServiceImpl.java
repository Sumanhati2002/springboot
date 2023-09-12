package com.springboot.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.api.model.Book;
import com.springboot.api.repository.BookRepo;
import com.springboot.api.service.BookService;

import lombok.AllArgsConstructor;

@Service
public class ServiceImpl implements BookService{
	
	@Autowired
	private BookRepo bookRepo;
	@Override
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return (List<Book>) bookRepo.findAll();
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		  Optional<Book> optionalBook= bookRepo.findById(id);
		  return optionalBook.get();
	}

	
	@Override
    public Book updateUser(Book book) {
		Book existingUser = bookRepo.findById(book.getId()).get();
        existingUser.setId(book.getId());
        existingUser.setName(book.getName());
        existingUser.setAuthor(book.getAuthor());
        Book updatedUser = bookRepo.save(existingUser);
        return updatedUser;
    }
	 
	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		bookRepo.deleteById(id);
	}

}
