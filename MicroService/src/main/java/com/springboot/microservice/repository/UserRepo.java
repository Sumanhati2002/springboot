package com.springboot.microservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.microservice.enntity.User;

public interface UserRepo extends CrudRepository<User, String>{

}
