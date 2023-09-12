package com.springboot.smartcontact.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.smartcontact.entity.User;

public interface UserRepo extends CrudRepository<User, Integer>{

}
