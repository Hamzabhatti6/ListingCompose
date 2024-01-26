package com.hamza.network

import com.hamza.network.model.TicketsDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("launches")
    suspend fun fetchTickets(): List<TicketsDto>
}