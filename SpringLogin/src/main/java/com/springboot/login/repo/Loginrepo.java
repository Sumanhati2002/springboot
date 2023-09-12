package com.springboot.login.repo;

import org.springframework.data.repository.CrudRepository;

import com.springboot.login.entity.LoginData;

public interface Loginrepo extends CrudRepository<LoginData, Integer>{

}
