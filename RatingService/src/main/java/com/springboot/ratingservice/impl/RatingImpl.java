package com.springboot.ratingservice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.ratingservice.entity.Rating;
import com.springboot.ratingservice.repository.RatingRepo;
import com.springboot.ratingservice.sevice.RatingService;

@Service
public class RatingImpl implements RatingService{

	@Autowired
	private RatingRepo ratingRepo;
	@Override
	public Rating create(Rating rating) {
		// TODO Auto-generated method stub
		return ratingRepo.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		// TODO Auto-generated method stub
		return (List<Rating>) ratingRepo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return ratingRepo.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepo.findByHotelId(hotelId);
	}

	

}
