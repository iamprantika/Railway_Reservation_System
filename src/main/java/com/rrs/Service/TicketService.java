package com.rrs.Service;

import com.rrs.Dto.TicketDto;
import com.rrs.entity.Ticket;

public interface TicketService {
	//Create and save a new Ticket.
	TicketDto saveTicket(Ticket ticket);

	// Retrieve a Ticket by their unique ID.
	TicketDto getTicketById(int id);

	// Update a Ticket by their unique ID.
	TicketDto updateTicketById(long id, Ticket ticket);

	// Delete a Ticket by their unique ID.
	void deleteTicketById(int id);
}
