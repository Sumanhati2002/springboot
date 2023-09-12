package com.springboot.api.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Books")
public class Book {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "book_id")
private int id;
@Column(name = "book_name")
private String name;
@Column(name = "book_author")
private String author;
}
