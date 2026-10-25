package com.sena.first_project.navegation

import kotlinx.serialization.Serializable

@Serializable
data object Inicio

@Serializable
data object Productos

@Serializable
data class DetalleProducto(
    val id: Int,
)

@Serializable
data object Categorias

@Serializable
data object Pedidos

@Serializable
data object Clientes

@Serializable
data object Servicios

@Serializable
data object Ofertas
