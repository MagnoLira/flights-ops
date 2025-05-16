package com.magno.flightops.controller

import com.magno.flightops.entity.Flight
import com.magno.flightops.service.FlightService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/voos")
class FlightController(
    private val flightService: FlightService
) {
    @PostMapping
    fun insertDb(@RequestBody request: Flight): String {
        println("Recebido nova inserção: $request")
        flightService.salvarVoo(request)
        return "Voo salvo com sucesso"
    }
}
