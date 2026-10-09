package service;

import model.datosIniciales;
import model.Producto;
import model.Inventario;

import java.util.Scanner;
import java.util.ArrayList;



public class serviceProducto {
	//Creacion de Array Base de datos definitivo
	
	private ArrayList <Producto> listaFinalProductos = new ArrayList <>();	
	private ArrayList <Inventario> listaFinalInventario = new ArrayList <>();
	private datosIniciales datos = new datosIniciales();
	
	int id = 9;
	
	//Copia de la lista inicial a la final
	
	public ArrayList <Producto> cargarProductos () {
		listaFinalProductos.clear();
		listaFinalProductos.addAll(datos.inicializarProductos());
		return listaFinalProductos;
	}
	
	public ArrayList <Inventario> cargarInventario () {
		listaFinalInventario.clear();
		listaFinalInventario.addAll(datos.inicializarInventario());
		return listaFinalInventario;
	}
	
	/* public int cargarContador () {
		id = listaFinalProductos.size();
		return id;
	}
	*/
	
	
	public void crear() {
		
	}		
	
	public void leerProductosTotal() {
		this.cargarProductos();
		// this.cargarInventario();
		// id = this.cargarContador();
		
		for (int i = 0; i < id; i++) {
			Producto pto = listaFinalProductos.get(i);
			int idProducto = 1 + i;
			
			System.out.println();
			System.out.println("Numero: " + idProducto);
			pto.calcularPrecio();
			pto.asignarCATEGORIA();
			pto.conversor();
			pto.mostrarResultado();
			System.out.println();
		}
	}	
	
	public void leerInventarioTotal() {
		// this.cargarProductos();
		this.cargarInventario();
		//int j = listaFinalInventario.size();
		
		for (int i = 0; i < id; i++) {
			Inventario inv = listaFinalInventario.get(i);
			int idStock = 1 + i;
			
			System.out.println();
			System.out.println("Numero: " + idStock);
			inv.imprimirInventario();
			System.out.println();
		}	
	}
}

	
	//public void modificar() {
	//}
	
	//public void eliminar() {
	//}



	