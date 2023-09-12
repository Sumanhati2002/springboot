package com.springboot.api.repository;

import org.springframework.data.repository.CrudRepository;
import com.springboot.api.model.Book;

public interface BookRepo extends CrudRepository<Book, Integer>{

}
