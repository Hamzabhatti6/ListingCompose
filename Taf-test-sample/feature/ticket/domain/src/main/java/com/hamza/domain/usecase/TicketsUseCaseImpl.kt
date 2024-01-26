package com.hamza.domain.usecase

import com.hamza.api.repo.TicketRepository
import com.hamza.api.usecase.TicketUseCase
import com.hamza.api.usecase.TicketUseCaseResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

class TicketsUseCaseImpl(
    private val coroutineContext: CoroutineContext = Dispatchers.IO,
    private val ticketsRepository: TicketRepository
) : TicketUseCase {
    override suspend fun invoke(): TicketUseCaseResult {
        return withContext(coroutineContext) {
            try {
                val Tickets = ticketsRepository.fetchTickets()
                TicketUseCaseResult.Success(Tickets.take(50))
            } catch (e: Exception) {
                TicketUseCaseResult.Error(e.cause)
            }
        }
    }
}