package com.hamza.domain.repo

import com.hamza.api.Ticket
import com.hamza.api.repo.TicketRepository
import com.hamza.domain.extention.toTickets
import com.hamza.network.ApiService

class TicketsRepositoryImpl(private val apiService: ApiService): TicketRepository {
    override suspend fun fetchTickets(): List<Ticket> {
        return apiService.fetchTickets().toTickets()
    }
}