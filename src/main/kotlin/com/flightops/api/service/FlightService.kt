package com.magno.flightops.service

import com.magno.flightops.entity.Flight


interface FlightService{
    fun salvarVoo(flight: Flight): Flight
}