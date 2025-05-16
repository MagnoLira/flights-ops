package com.flightops.dto



data class flight (
    val aer_de: String,
    val aer_para: String,
    val companhia: String,
    val hora_saida: String? = null ,
    val hora_chegada: String? = null ,
    val valor_milhas: String? = null ,
    val valor_reais: String? = null ,
    val tipo_emissao: String,
    val data_passagem: String? = null ,
    val data_busca: String? = null ,
    val link_emissao: String? = null ,
    val site: String? = "smiles"
)


data class searchRequest(
    val aer_de: String, 
    val aer_para: String,
    val data_passagem: String
)