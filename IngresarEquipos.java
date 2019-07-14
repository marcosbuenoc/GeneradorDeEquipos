package generador;

import java.util.Scanner;

public class IngresarEquipos {
	static Scanner sc = new Scanner (System.in);
	
	static String jugadores [] = new String [10];
	//static String jugadoresA [] = new String [5];
	//static String jugadoresB [] = new String [5];
	
	static int aleatorio [] = new int [10];
	static int contadorA, contadorB;
	
public static void main(String[] args) {
	
	ingresarJugadores();
	crearEquipo();
	imprimirequipos();
	
	
}


private static void imprimirequipos() {
	for ( int i =0; i < 10; i++) {
		System.out.println(jugadores[i] + " juega en el equipo " + aleatorio[i]);
		
	}
	
}

private static void crearEquipo() {
	
	int contadorequipo [] = new int[2];
	
	//Seleccionamos al quipo que va
	
	for (int i = 0; i < 10; i++) {
		int equiposel=(int) ((Math.random()*2+1)-1);
		
	//Si el equipo esta lleno , ira al otro
		
	if(contadorequipo[equiposel] == 5) 
		equiposel=(equiposel+1)%2;
		
	//Añadimos el jugador al equipo y incrementamos	el contador
		contadorequipo[equiposel]++;
		aleatorio[i]=equiposel;
	
						
	}
		
}


private static void ingresarJugadores() {
	
	
	for ( int i = 0; i < jugadores.length; i++ ) {
	
		System.out.println("Ingrese jugadores : " + (i+1) + " : ");
		jugadores[i] = sc.nextLine();
	
	}
		
}
}

