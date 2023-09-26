package com.springboot.hotel.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.hotel.entity.User;

public interface UserRepo extends CrudRepository<User, Integer>{

}
