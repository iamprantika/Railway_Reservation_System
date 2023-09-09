package com.rrs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rrs.Dto.TicketDto;
import com.rrs.Service.TicketService;
import com.rrs.Util.TicketConverter;

@RestController
public class TicketController {
	@Autowired
    TicketService ticketService;

	@Autowired
	TicketConverter ticketConverter;
   
    @PostMapping("/createTicket")
    public ResponseEntity<TicketDto> createTicket(@RequestBody TicketDto ticketDto) {
        TicketDto createdTicket = ticketService.saveTicket(ticketConverter.convertTicketDtoToEntity(ticketDto));
        return new ResponseEntity<>(createdTicket, HttpStatus.CREATED);
    }

    @GetMapping("getTicketById/{id}")
    public ResponseEntity<TicketDto> getTicketById(@PathVariable int id) {
        TicketDto ticket = ticketService.getTicketById(id);
        return new ResponseEntity<>(ticket, HttpStatus.OK);
    }

    @PutMapping("updateTicketById/{id}")
    public ResponseEntity<TicketDto> updateTicketById(@PathVariable int id, @RequestBody TicketDto ticketDto) {
        TicketDto updatedTicket = ticketService.updateTicketById(id, ticketConverter.convertTicketDtoToEntity(ticketDto));
        return new ResponseEntity<>(updatedTicket, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTicketById(@PathVariable int id) {
        ticketService.deleteTicketById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
