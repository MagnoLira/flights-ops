package com.magno.flightops.entity

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDateTime


@Entity
@Table(name = "flights_smiles")
data class Flight(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(name = "aer_de", nullable = false)
    val aer_de: String,
    @Column(name = "aer_para",nullable = false)
    val aer_para: String,
    @Column(name = "companhia", nullable = false)
    val companhia: String,
    @Column(name = "hora_saida")
    val hora_saida: String? = null,
    @Column(name = "hora_chegada")
    val hora_chegada: String?= null,
    @Column(name = "valor_milhas")
    val valor_milhas: String?= null,
    @Column(name = "valor_reais", precision = 19, scale = 4)
    val valor_reais: BigDecimal? = null,
    @Column(name = "tipo_emissao")
    val tipo_emissao: String,
    @Column(name = "data_passagem")
    val data_passagem: String,
    @Column(name = "data_busca")
    val data_busca: LocalDateTime? = null,
    @Column(name = "link_emissao")
    val link_emissao: String,
    @Column(name = "site")
    val site: String? = "smiles"    
)