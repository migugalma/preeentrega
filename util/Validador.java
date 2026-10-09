package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validador {
	
	//Validador de Strings
	
	public static void validarString(String dato) {
        // Un nombre nulo o vacío no representa un producto válido
        if (dato == null || dato.trim().isEmpty()){
            throw new IllegalArgumentException("");
		}
	}
	

	//Validador de enteros
	public static void validarInt(int dato){
		if (dato < 0 || (((Object) dato).getClass().getSimpleName()) != integer) {
				throw new IllegalArgumentException("");
		}
	}
}

		
			
