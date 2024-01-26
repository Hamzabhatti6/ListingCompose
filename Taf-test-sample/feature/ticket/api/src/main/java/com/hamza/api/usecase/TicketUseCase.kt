package com.hamza.api.usecase

import com.hamza.api.Ticket

interface TicketUseCase {
    suspend operator fun invoke(): TicketUseCaseResult
}
sealed class TicketUseCaseResult {
    data class Success(val launches: List<Ticket>): TicketUseCaseResult()
    data class Error(val throwable: Throwable?): TicketUseCaseResult()
}