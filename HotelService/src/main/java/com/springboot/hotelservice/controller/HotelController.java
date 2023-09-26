package com.springboot.hotelservice.controller;

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

import com.springboot.hotelservice.entity.Hotel;
import com.springboot.hotelservice.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	//create
	@PostMapping
    public ResponseEntity<Hotel> createUser(@RequestBody Hotel hotel){
		Hotel savedHotel = hotelService.createHotel(hotel);
        return new ResponseEntity<>(savedHotel, HttpStatus.CREATED);            
}
	
	//get all hotels
	@GetMapping
	 public ResponseEntity<List<Hotel>> getAllHotels(){
	        List<Hotel> hotels = hotelService.getAllHotel();
	        return new ResponseEntity<>(hotels, HttpStatus.OK);
	    }
	
	//find hotel by id
	  @GetMapping("/{id}")
	    public ResponseEntity<Hotel> getUserById(@PathVariable("id") String id){
		  Hotel hotel = hotelService.getHotelById(id);
	        return new ResponseEntity<>(hotel, HttpStatus.OK);
	    }
}
