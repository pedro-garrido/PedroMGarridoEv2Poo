package pedromgarridoev2poo;

import java.util.ArrayList;

public class funcion {
	public static void Fagregar(trabajador trabajador, ArrayList<trabajador> trabajadores){
		trabajadores.add(trabajador);
		System.out.println("el largo del array es " + trabajadores.size());
	}	
}
