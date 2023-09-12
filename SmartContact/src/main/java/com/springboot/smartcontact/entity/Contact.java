package com.springboot.smartcontact.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CONTACT_DETAILS")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "NICNAME")
	private String nicname;
	@Column(name = "WORK")
	private String work;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "IMAGE")
	private String imgage;
	@Column(name = "DESCRIPTION", length = 5000)
	private String description;
	@Column(name = "PHONE")
	private String phone;

	@ManyToOne
	private User user;
}
