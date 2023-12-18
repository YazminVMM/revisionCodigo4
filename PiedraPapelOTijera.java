package practica;

import java.util.Scanner;

/*
 * No contiene la clase principal
 * No está importada la librería Scanner
 * La inicializacíon de la variable s y s2 no tienen parametros
 * La condicion f (j1 == j2) tiene un parentesis de mas
 * El case "papel": no tiene la llave de cierre
 * Ambos prints dicen jugador 1
 * La variable s2 no se utiliza
 * Para comparar una variable String se utiliza el metodo .equals
 * El case "piedra": y el case "papel": no contienen break;
 * El default no contiene ninguna informacion
 * El case "tijera": le hace falta la s
 **********Mejora del código*********************
 *Cambio de nombre a variables
 *Se agregó un ciclo de control para continuar jugando
 *
 * */

public class PiedraPapelOTijera {

	public static void main(String arg []) {
		Scanner entrada = new Scanner(System.in);
		boolean continuar = true;
		
		while (continuar) {//Ciclo que dtermina si el juego continua
			
			System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
			String jugador1 = entrada.nextLine();

			System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
			String jugador2 = entrada.nextLine();

			if (jugador1.equals(jugador2)) {
				System.out.println("Empate intentalo de nuevo");
			} else {
				int ganador = 2;
				switch(jugador1) {
				case "piedra":
					if (jugador2.equals("tijeras")) {
						ganador = 1;
					}
					break;
				case "papel":
					if (jugador2.equals("piedra") ) {
						ganador = 1;
					}
					break;
				case "tijeras":
					if (jugador2.equals("papel")) {
						ganador = 1;
					}
					break;
				default:
					System.out.println("La opción del jugador uno no es válida");
				}
				System.out.println("Gana el jugador " + ganador);
				
				System.out.println("Volver a jugar si/no");
				if (entrada.nextLine().equals("no")) {
					continuar = false;
				}
			}
		}
		System.out.println("Adios!");
	}

}

