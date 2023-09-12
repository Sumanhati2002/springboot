package com.springboot.login.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.login.entity.LoginData;
import com.springboot.login.repo.Loginrepo;
import com.springboot.login.service.LoginService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoginImpl implements LoginService{

	@Autowired
	private Loginrepo loginrepo;
	@Override
	public LoginData createData(LoginData loginData) {
		// TODO Auto-generated method stub
		return loginrepo.save(loginData);
	}
	@Override
	public List<LoginData> getalldata() {
		// TODO Auto-generated method stub
		return (List<LoginData>) loginrepo.findAll();
	}

}
