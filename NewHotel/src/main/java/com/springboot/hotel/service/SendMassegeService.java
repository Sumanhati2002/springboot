package com.springboot.hotel.service;

import java.util.List;

import com.springboot.hotel.entity.SendMassege;

public interface SendMassegeService {

	//create
	SendMassege saveMassage(SendMassege massege);
	
	//get all massage
	List<SendMassege> getAllMasseges();
	
	//get massage by id
	SendMassege getMassegeById(int id);
}
