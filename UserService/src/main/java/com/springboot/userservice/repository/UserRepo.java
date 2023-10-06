package com.springboot.userservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.userservice.enntity.User;

public interface UserRepo extends CrudRepository<User, String>{

}
