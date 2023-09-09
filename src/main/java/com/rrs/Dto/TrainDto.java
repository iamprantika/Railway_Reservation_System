package com.rrs.Dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrainDto {
	private int trainNo;//primary key
	
	private String trainName;
	
	private int price;
	
	private LocalDateTime departureTime;//2007-12-03T10:15:30
	
	private LocalDateTime arrivalTime;
	
	private LocalDateTime date;

}
