package com.rrs.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rrs.Dto.TicketDto;
import com.rrs.Repository.TicketRepository;
import com.rrs.Service.TicketService;
import com.rrs.Util.TicketConverter;
import com.rrs.entity.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository rrsRepository;
	
	@Autowired
	TicketConverter rrsConverter;
	
	@Override
	public TicketDto saveTicket(Ticket rrs) {
	    
	    
	    // Save the Ticket to the repository
	    rrsRepository.save(rrs);
	    
	    // Convert the saved Ticket entity to a TicketDto and return it
	    return rrsConverter.convertEntityToTicketDto(rrs);
	}

	@Override
	public TicketDto getTicketById(int id) {
	    // Retrieve the Ticket from the repository by its ID, or throw a ResourceNotFoundException if not found
		Ticket rrs = rrsRepository.findById((long) id).get();
				
	    // Convert the retrieved TicketEntity to a TicketDto and return it
	    return rrsConverter.convertEntityToTicketDto(rrs);
		
	}
	@Override
	public TicketDto updateTicketById(long id, Ticket newRrs) {
	    // Retrieve the existing Ticket from the repository by its ID
		Ticket existingRrs = rrsRepository.findById(id).get();
	    
	    // Update the ticket's PassengerName, SeatNumber and TrainName
	    existingRrs.setPassengerName(newRrs.getPassengerName());
	    existingRrs.setSeatNumber(newRrs.getSeatNumber());
	    existingRrs.setTrainName(newRrs.getTrainName());
	    existingRrs.setDestinationName(newRrs.getDestinationName());
	    existingRrs.setSourceName(newRrs.getSourceName());
	    
	    // Save the updated Ticket entity to the repository
	    rrsRepository.save(existingRrs);
	    
	    // Convert the updated Ticket entity to a TicketDto and return it
	    return rrsConverter.convertEntityToTicketDto(existingRrs);
	}

	@Override
	public void deleteTicketById(int id) {
	    // Check if the Ticket with the given ID exists, or throw a ResourceNotFoundException if not found
	    rrsRepository.findById((long)id).get();
	    
	    // Delete the Ticket from the repository by its ID
	    rrsRepository.deleteById((long)id);
	}
	



}