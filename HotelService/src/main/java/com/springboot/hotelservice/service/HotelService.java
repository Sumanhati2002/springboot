package com.springboot.hotelservice.service;

import java.util.List;

import com.springboot.hotelservice.entity.Hotel;

public interface HotelService {

	Hotel createHotel(Hotel hotel);
	List<Hotel> getAllHotel();
	Hotel getHotelById(String id);
}
