package com.sena.first_project.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sena.first_project.ui.screen.CategoriasScreen
import com.sena.first_project.ui.screen.ClientesScreen
import com.sena.first_project.ui.screen.Home
import com.sena.first_project.ui.screen.OfertasScreen
import com.sena.first_project.ui.screen.PedidosScreen
import com.sena.first_project.ui.screen.Producto
import com.sena.first_project.ui.screen.ServiciosScreen

@Composable
fun AppNavegation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Inicio
    ){
        composable<Inicio>{
            Home(
                onirProducto = {
                    navController.navigate(Productos)
                },
                onIrCategorias = {
                    navController.navigate(Categorias)
                },
                onIrPedidos = {
                    navController.navigate(Pedidos)
                },
                onIrClientes = {
                    navController.navigate(Clientes)
                },
                onIrServicios = {
                    navController.navigate(Servicios)
                },
                onIrOfertas = {
                    navController.navigate(Ofertas)
                }
            )
        }
        composable<Productos>{
            Producto(
                onirDetalleProducto = { id ->
                    navController.navigate(DetalleProducto(id))
                },
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }
        composable<DetalleProducto>{ dato ->
            com.sena.first_project.ui.screen.DetalleProducto(
                id = dato.arguments?.getInt("id") ?: 0
            )
        }
        composable<Categorias>{
            CategoriasScreen(
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }
        composable<Pedidos>{
            PedidosScreen(
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }
        composable<Clientes>{
            ClientesScreen(
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }
        composable<Servicios>{
            ServiciosScreen(
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }
        composable<Ofertas>{
            OfertasScreen(
                onVolverHome = {
                    navController.popBackStack()
                }
            )
        }
    }
}
