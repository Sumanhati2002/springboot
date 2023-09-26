package com.springboot.ratingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ratingservice.entity.Rating;
import com.springboot.ratingservice.sevice.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	//create
	@PostMapping
    public ResponseEntity<Rating> createUser(@RequestBody Rating rating){
		Rating savedRating = ratingService.create(rating);
        return new ResponseEntity<>(savedRating, HttpStatus.CREATED);
    }
	
	//get all ratings
	@GetMapping
    public ResponseEntity<List<Rating>> getAllUsers(){
        List<Rating> ratings = ratingService.getAllRating();
        return new ResponseEntity<>(ratings, HttpStatus.OK);
    }
	
	//get rating by user id
	@GetMapping("/{userId}")
    public ResponseEntity<Rating> getRatingByUserId(@PathVariable("userId") String userId){
		Rating rating = (Rating) ratingService.getRatingByUserId(userId);
        return new ResponseEntity<>(rating, HttpStatus.OK);
    }
	
	//get rating by hotel id
		@GetMapping("/{hotelId}")
	    public ResponseEntity<Rating> getRatingByHotelId(@PathVariable("hotelId") String hotelId){
			Rating rating = (Rating) ratingService.getRatingByHotelId(hotelId);
	        return new ResponseEntity<>(rating, HttpStatus.OK);
	    }
}
