package com.springboot.ratingservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.ratingservice.entity.Rating;

public interface RatingRepo extends CrudRepository<Rating, String>{

	//custom method
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);
}
