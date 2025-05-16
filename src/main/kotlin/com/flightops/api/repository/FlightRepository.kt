package com.magno.flightops.repository

import com.magno.flightops.entity.Flight
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface FlightRepository : JpaRepository<Flight, Long>