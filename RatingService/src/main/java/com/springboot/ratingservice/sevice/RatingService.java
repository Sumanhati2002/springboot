package com.springboot.ratingservice.sevice;

import java.util.List;

import com.springboot.ratingservice.entity.Rating;

public interface RatingService {

	Rating create(Rating rating);
	List<Rating> getAllRating();
	List<Rating> getRatingByUserId(String userId);
	List<Rating> getRatingByHotelId(String hotelId);
}
