package com.rrs.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Train {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainNo;//primary key
	
	@Column(length=50)
	private String trainName;
	
	private int price;
	
	private LocalDateTime departureTime;//2007-12-03T10:15:30
	
	private LocalDateTime arrivalTime;
	
	private LocalDateTime date;
	
	@ManyToOne
	private Route route;	// Entity reference
	

}
