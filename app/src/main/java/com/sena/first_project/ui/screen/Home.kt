package com.sena.first_project.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Home(
    onirProducto: () -> Unit,
    onIrCategorias: () -> Unit,
    onIrPedidos: () -> Unit,
    onIrClientes: () -> Unit,
    onIrServicios: () -> Unit,
    onIrOfertas: () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hola desde la Home",
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onirProducto,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "ir a producto")
        }
        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = onIrCategorias,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "ir a categorías")
        }
        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = onIrPedidos,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "ir a pedidos")
        }
        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = onIrClientes,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "ir a clientes")
        }
        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = onIrServicios,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "ir a servicios")
        }
        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = onIrOfertas,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "ir a ofertas")
        }
    }
}
