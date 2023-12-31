package com.springboot.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
public class LoginData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userMail;
	private String password;
}
