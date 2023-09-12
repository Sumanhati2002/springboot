package com.springboot.login.service;


import java.util.List;

import com.springboot.login.entity.LoginData;

public interface LoginService {

	LoginData createData(LoginData loginData);
	List<LoginData> getalldata();
}
