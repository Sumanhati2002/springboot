package com.springboot.smartcontact.entity;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@NoArgsConstructor
@ToString
@Entity
@Table(name = "USER_DETAILS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "USER_NAME")
	private String name;
	@Column(name = "USER_MAIL")
	private String email;
	@Column(name = "USER_PASSWORD")
	private String password;
	@Column(name = "USER_ROLE")
	private String role;
	@Column(name = "USER_ACTIVITY")
	private boolean enabled;
	@Column(name = "USER_IMG")
	private String imageurl;
	@Column(name = "ABOUT_USER", length = 500)
	private String about;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<Contact> list=new ArrayList<>();
}






