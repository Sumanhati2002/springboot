package com.springboot.ratingservice.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@javax.persistence.Entity
@javax.persistence.Table(name = "RATING")
public class Rating {

	@javax.persistence.Id
	private String ratingId;
	private String userId;
	private String hotelId;
	private String rating;
}
