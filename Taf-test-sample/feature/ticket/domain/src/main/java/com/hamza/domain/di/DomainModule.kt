package com.hamza.domain.di

import com.hamza.api.repo.TicketRepository
import com.hamza.api.usecase.TicketUseCase
import com.hamza.domain.repo.TicketsRepositoryImpl
import com.hamza.domain.usecase.TicketsUseCaseImpl
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module

val TicketDomainModule = module {
    single<TicketRepository> { TicketsRepositoryImpl(get()) }
    single<TicketUseCase> { TicketsUseCaseImpl(coroutineContext = Dispatchers.IO, get()) }
}