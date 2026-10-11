package service;

import model.datosIniciales;
import model.Producto;
import model.Utensillo;
import model.Cubierto;
import model.Recipiente;
import model.Inventario;
import service.metodosAuxiliares;

import java.util.Scanner;
import java.util.ArrayList;



public class serviceProducto implements metodosAuxiliares {
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
	
	public ArrayList <Producto> crearUtensillo() {
		//Iniciando la carga de los objetos
		Scanner sc = new Scanner(System.in);
		Utensillo nvoPto = new Utensillo();
		//Cargar del codigo identificatorio
		System.out.println("Ingrese un codigo de tres letras mayusculas: ");
		String nvoCodigoProducto = sc.nextLine();
		nvoPto.setCodigoProducto(nvoCodigoProducto);
		//Cargar el nombre del producto
		System.out.println("Ingrese un nombre del producto: ");
		String nvoNombre = sc.nextLine();
		nvoPto.setNombre(nvoNombre);
		//Cargar marca del producto
		System.out.println("Ingrese la marca del producto");
		String nvoMarca = sc.nextLine();
		nvoPto.setMarca(nvoMarca);
		//Cargar el minimo en stock
		System.out.println("Ingrese el stock minimo del producto");
		int nvoStockMinimo = sc.nextInt();
		sc.nextLine();
		nvoPto.setStockMinimo(nvoStockMinimo);
		//Cargar el costo del producto
		System.out.println("Ingrese el costo del producto");
		double nvoCosto = sc.nextDouble();
		sc.nextLine();
		nvoPto.setCosto(nvoCosto);
		//Cargar el diametro
		System.out.println("Ingrese el diametro en cm");
		double nvoDiametro = sc.nextDouble();
		sc.nextLine();
		nvoPto.setDiametro(nvoDiametro);
		//Cargar forma de sujecion
		System.out.println("Cual es la forma de sujeccion: ");
		System.out.println("(1) Mango o (2) Asas");
		int opcion = sc.nextInt();
		sc.nextLine();
		boolean nvoConMango = desconversor(opcion);
		nvoPto.setConMango(nvoConMango);
		//Preparar el nuevo registro
		id = id + 1;
		listaFinalProductos.add(nvoPto);
		//Imprimir resultado
		System.out.println("El nuevo registro es: ");
		System.out.println();
		System.out.println("Numero: " + id);
		nvoPto.calcularPrecio();
		nvoPto.asignarCATEGORIA();
		nvoPto.conversor();
		nvoPto.mostrarResultado();
		System.out.println();
		
		return listaFinalProductos;
	}
		
	
	public void leerProductosTotal() {
		this.cargarProductos();
		//this.cargarInventario();
		
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



	