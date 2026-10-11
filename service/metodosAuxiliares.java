package service;

public interface metodosAuxiliares {
	
	//Metodo que convierte las opciones en booleanos
	default boolean desconversor (int opcion) {
		boolean nvoValor;
		if (opcion == 1) {
			nvoValor = true;
		}
		else {
			nvoValor = false;
		}
		return nvoValor;
	}
}