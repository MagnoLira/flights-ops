package com.flightops.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlightopsApiApplication

fun main(args: Array<String>) {
	runApplication<FlightopsApiApplication>(*args)
}
