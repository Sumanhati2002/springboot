package com.springboot.hotelservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.hotelservice.entity.Hotel;

public interface HotelRepo extends CrudRepository<Hotel, String>{

}
