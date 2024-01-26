package com.hamza.api.repo

import com.hamza.api.Ticket

interface TicketRepository {
    suspend fun fetchTickets(): List<Ticket>

}