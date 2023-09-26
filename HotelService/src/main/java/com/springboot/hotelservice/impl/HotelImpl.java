package com.springboot.hotelservice.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.springboot.hotelservice.entity.Hotel;
import com.springboot.hotelservice.exception.ResourceNotFoundException;
import com.springboot.hotelservice.repository.HotelRepo;
import com.springboot.hotelservice.service.HotelService;

@Service
public class HotelImpl implements HotelService{

	@Autowired
	private HotelRepo hotelRepo;
	
	@Override
	public Hotel createHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		String hotelId=UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		return (List<Hotel>) hotelRepo.findAll();
	}

	@Override
	public Hotel getHotelById(String id) {
		// TODO Auto-generated method stub
		return hotelRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("hotel not exit!!"));
	}

}
