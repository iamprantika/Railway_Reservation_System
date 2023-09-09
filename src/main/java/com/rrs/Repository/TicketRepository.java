package com.rrs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rrs.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
