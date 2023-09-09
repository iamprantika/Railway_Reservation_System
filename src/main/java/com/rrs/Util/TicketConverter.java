package com.rrs.Util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.rrs.Dto.TicketDto;
import com.rrs.entity.Ticket;

@Component
public class TicketConverter {

	// This method converts a Ticket entity object to a TicketDto data transfer object.
	public TicketDto convertEntityToTicketDto(Ticket rrs)
	{
		// Create a new TicketDto instance to hold the converted data.
		TicketDto rRs =new TicketDto();
		
		// Check if the input Ticket entity is not null before copying properties.
		if(rrs != null)
		{
			// Copy properties from the Ticket entity to the TicketDto using BeanUtils.
			BeanUtils.copyProperties(rrs, rRs);
		}
		
		// Return the converted TicketDto.
		return rRs;
	}
	
	// This method converts a TicketDto data transfer object to a Ticket entity object.
	public Ticket convertTicketDtoToEntity(TicketDto rRs)
	{
		// Create a new Ticket instance to hold the converted data.
		Ticket rrs =new Ticket();
		
		// Check if the input TicketDto is not null before copying properties.
		if(rRs != null)
		{
			// Copy properties from the TicketDto to the Ticket entity using BeanUtils.
			BeanUtils.copyProperties(rRs, rrs);
		}
		
		// Return the converted Ticket entity.
		return rrs;
	}
}
