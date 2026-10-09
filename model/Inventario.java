package model;

import java.util.ArrayList;

public class Inventario {
	
	//Creacion del array
	
	
	
	//Generacion de atributos
	private String codigoProducto;
	private String nombre;
	private String marca;
	private int stockMinimo;
	private double costo;
	private int stock;

	public Inventario (String codigoProducto, String nombre, String marca, int stockMinimo,
	double costo, int stock) {
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.marca = marca;
		this.stockMinimo = stockMinimo;
		this.costo = costo;
		this.stock = stock;
	}
	
	public void imprimirInventario () {
		System.out.println("Codigo: " + codigoProducto);
		System.out.println("Nombre: " + nombre);
		System.out.println("Marca: " + marca);
		System.out.println("Stock minimo: " + stockMinimo );
		System.out.println("Costo unitario: " + costo);
		System.out.println("Stock actual: " + stock);
	}
	
	
}


	
	
