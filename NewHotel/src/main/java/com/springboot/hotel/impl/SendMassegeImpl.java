package com.springboot.hotel.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.hotel.entity.SendMassege;
import com.springboot.hotel.repo.SendMassegeRepo;
import com.springboot.hotel.service.SendMassegeService;

@Service
public class SendMassegeImpl implements SendMassegeService{

	@Autowired
	private SendMassegeRepo massegeRepo;
	@Override
	public SendMassege saveMassage(SendMassege massege) {
		// TODO Auto-generated method stub
		return massegeRepo.save(massege);
	}

	@Override
	public List<SendMassege> getAllMasseges() {
		// TODO Auto-generated method stub
		return (List<SendMassege>) massegeRepo.findAll();
	}

	@Override
	public SendMassege getMassegeById(int id) {
		// TODO Auto-generated method stub
		java.util.Optional<SendMassege> optionalUser = massegeRepo.findById(id);
		return optionalUser.get();
	}

}
