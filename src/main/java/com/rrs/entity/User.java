package com.rrs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id //Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-Increment
	private long id;
	
	@Column(length=50)
	private String UserName;
	
	@Column(length=20)
	private String PassWord;
	
	@Column(length=50)
	private String Email;
	
	
	private long Age;
	
	@Column(length=10)
	private String Gender;

}
