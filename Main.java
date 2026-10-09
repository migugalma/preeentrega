import model.datosIniciales;
import service.serviceProducto;

import java.util.ArrayList;

public class Main {
	public static void main (String [] args) {
		/*Carga de datos incial
		datosIniciales listaStd = new datosIniciales();
		listaStd.inicializarProductos();
		listaStd.inicializarInventario();
		*/
		
		//Leer los datos iniciales
		serviceProducto cargaDatos = new serviceProducto();
		//cargaDatos.leerProductosTotal();
		cargaDatos.leerInventarioTotal();
	}
}

/*
Utensillo (String nombre, String marca, int stockMinimo, double costo,
	double diametro, boolean conMango)
*/	
