package com.magno.flightops.service

import com.magno.flightops.entity.Flight
import com.magno.flightops.repository.FlightRepository
import org.springframework.stereotype.Service

@Service
class FlightServiceImpl(
    private val flightRepository: FlightRepository
) : FlightService {
    override fun salvarVoo(flight: Flight): Flight {
        return flightRepository.save(flight)
    }
}
