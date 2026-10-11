package ui;

import service.serviceProducto;
import service.serviceCompraVenta;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	
	public static void menuPrincipal () {
		System.out.println("BIENVENIDOS AL PROGRAMA DE GESTION");
		System.out.println();
		System.out.println("Elija alguna de las siguientes opciones");
		System.out.println();
		System.out.println("(1) Productos");
		System.out.println("(2) Inventario");
		System.out.println("(3) Compra o venta");
		System.out.println("(4) Saldo");
		System.out.println("(5) Salir");
		System.out.println();
		
		int opcion = sc.nextInt();
		sc.nextLine();
		switch (opcion) {
			case 1:
				menuProducto();
				break;
			case 2:
				menuInventario();
				break;
			case 3:
				menuCompraVenta();
				break;
			case 4:
				Saldo consulta = new Saldo();
				consulta.getSaldo();
				break;
			case 5:
				System.out.println("Muchas gracias por usar nuestro software");
				break;
			default:
				System.out.println("Elija una opcion correcta");
				menuPrincipal();
		}
	}
	
	public static void menuProducto(sc) {
		System.out.println("Elija alguna de las siguientes opciones");
		System.out.println();
		System.out.println("(1) Crear producto");
		System.out.println("(2) Ver producto");
		System.out.println("(3) Ver lista de productos");
		System.out.println("(4) Modificar producto");
		System.out.println("(5) Eliminar producto");
		System.out.println("(6) Volver");
		System.out.println();
		int opcion = sc.nextInt();
		sc.nextLine();
		switch (opcion) {
			case 1:
				System.out.println("Ingrese la categoria Utensillo/Cubierto/Recipiente: ")
				String categoria = sc.nextLine();
				if (categoria.equals("Utensillo")) {
					ServiceProducto.crearUtensillo();
				}
				else if (categoria.equals("Cubierto") {
					ServiceProducto.crearCubierto();
				}
				else {
					ServiceProducto.crearRecipiente();
				}		
				break;
			case 2:
				();
				break;
			case 3:
				ServiceProducto.leerProductosTotal();
				break;
			case 4:
				();
				break;
			case 5:
				();
				break;
			case 6:
				menuPrincipal ();
				break;
			default:
				System.out.println("Elija una opcion correcta");
				menuProducto();
		}
	}	
	public static void menuInventario() {
		System.out.println("Elija alguna de las siguientes opciones");
		System.out.println();
		System.out.println("(1) Ver producto");
		System.out.println("(2) Ver inventario");
		System.out.println("(3) Volver");
		System.out.println();
		int opcion = sc.nextInt();
		sc.nextLine();
		switch (opcion) {
			case 1:
				();
				break;
			case 2:
				();
				break;
			case 3:
				menuPrincipal ();
				break;
			default:
				System.out.println("Elija una opcion correcta");
				menuInventario();
		}
	}
	public static void menuCompraVenta {}
		System.out.println("Elija alguna de las siguientes opciones");
		System.out.println();
		System.out.println("(1) Comprar un producto");
		System.out.println("(2) Historial de compras");
		System.out.println("(3) Vender un producto")
		System.out.println("(4) Historial de ventas"
		System.out.println("(5) Volver");
		System.out.println();
		int opcion = sc.nextInt();
		sc.nextLine();
		switch (opcion) {
			case 1:
				();
				break;
			case 2:
				();
				break
			case 3:
				menuPrincipal ();
				break;
			default:
				System.out.println("Elija una opcion correcta");
				menuCompraVenta();
		}
	}
}
