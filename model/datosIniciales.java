package model;

import java.util.ArrayList;

public class datosIniciales {
	ArrayList <Producto> listaInicialProductos = new ArrayList <>();
	
	//Se completan los datos preeliminares de los Productos
	public ArrayList <Producto> inicializarProductos () {
		Utensillo olla = new Utensillo ("OLL", "Olla", "Essen", 30, 50.0, 30.0, false);
		Utensillo cacerola = new Utensillo ("CRL", "Cacerola", "Essen", 40, 30.0, 10.0, true);
		Utensillo sarten = new Utensillo ("SRT", "Sarten", "Newsan", 40, 30.0, 15.0, true);
		Cubierto tenedor = new Cubierto ("TNR", "Tenedor", "Tramontina", 100, 5.0, "Mediano", false);
		Cubierto cuchillo = new Cubierto ("CLL", "Cuchillo", "Tramontina", 100, 7.0, "Mediano", false);
		Cubierto cuchara = new Cubierto ("CHR", "Cuchara", "Tramontina", 150, 8.0, "Grande", true);
		Recipiente plato = new Recipiente ("PLA", "Plato", "Turkiye", 100, 20.0, 20.0, false);
		Recipiente vaso = new Recipiente ("VAS", "Vaso", "Turkiye", 150, 10.0, 250.0, true);
		Recipiente jarra = new Recipiente ("JAR", "Jarra", "Gadnic", 50, 30.0, 1200.0, true);
		
		//Agregando prouctos a la lista inicial
		listaInicialProductos.add(olla);
		listaInicialProductos.add(cacerola);
		listaInicialProductos.add(sarten);
		listaInicialProductos.add(tenedor);
		listaInicialProductos.add(cuchillo);
		listaInicialProductos.add(cuchara);
		listaInicialProductos.add(plato);
		listaInicialProductos.add(vaso);
		listaInicialProductos.add(jarra);
		
		System.out.println("La lista de productos es: ");
		
		//Imprimiendo el resultado (solo de muestra)
		
		/* for (int i = 0; i < listaInicialProductos.size(); i++) {
			Producto pto = listaInicialProductos.get(i);
			int idProducto = 1 + i;
			
			System.out.println();
			System.out.println("Numero: " + idProducto);
			pto.calcularPrecio();
			pto.asignarCATEGORIA();
			pto.conversor();
			pto.mostrarResultado();
			System.out.println();
		}		
		*/
	return listaInicialProductos;	
	
	}
	
	ArrayList <Inventario> listaInicialInventario = new ArrayList <>();
	
	public ArrayList <Inventario> inicializarInventario () {
		Inventario olla = new Inventario ("OLL", "Olla", "Essen", 30, 50.0, 100);
		Inventario cacerola = new Inventario ("CRL", "Cacerola", "Essen", 40, 30.0, 120);
		Inventario sarten = new Inventario ("SRT", "Sarten", "Newsan", 40, 30.0, 120);
		Inventario tenedor = new Inventario ("TNR", "Tenedor", "Tramontina", 100, 5.0, 500);
		Inventario cuchillo = new Inventario ("CLL", "Cuchillo", "Tramontina", 100, 7.0, 500);
		Inventario cuchara = new Inventario ("CHR", "Cuchara", "Tramontina", 150, 8.0, 400);
		Inventario plato = new Inventario ("PLA", "Plato", "Turkiye", 100, 20.0, 400);
		Inventario vaso = new Inventario ("VAS", "Vaso", "Turkiye", 150, 10.0, 400);
		Inventario jarra = new Inventario ("JAR", "Jarra", "Gadnic", 50, 30.0, 150);

		//Agregando prouctos a la lista inicial
		listaInicialInventario.add(olla);
		listaInicialInventario.add(cacerola);
		listaInicialInventario.add(sarten);
		listaInicialInventario.add(tenedor);
		listaInicialInventario.add(cuchillo);
		listaInicialInventario.add(cuchara);
		listaInicialInventario.add(plato);
		listaInicialInventario.add(vaso);
		listaInicialInventario.add(jarra);
		
		System.out.println();
		System.out.println("El inventario inicial es: ");
		
		//Imprimiendo el resultado
		/*
		for (int i = 0; i < listaInicialInventario.size(); i++) {
			Inventario inv = listaInicialInventario.get(i);
			int idStock = 1 + i;
			
			System.out.println();
			System.out.println("Numero: " + idStock);
			inv.imprimirInventario();
			System.out.println();
		}
		*/
		return listaInicialInventario;
	}
	
}


