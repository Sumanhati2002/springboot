package com.springboot.validation.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

	@Size(min = 3, max = 50)
	@NotBlank
	private String username;
	@NotBlank
	@Email(message = "Please enter a valid e-mail address")
	private String email;
	@NotBlank
	@Size(min = 8, max = 15)
	private String password;
}
