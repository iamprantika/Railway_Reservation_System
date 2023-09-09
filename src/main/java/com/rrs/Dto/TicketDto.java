package com.rrs.Dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketDto {
	
	private int id;
    
    private String passengerName;
    
    private String trainName;
   
    private int seatNumber;
    
    private String SourceName;
    
    private String DestinationName;
    
    private long price;

}
