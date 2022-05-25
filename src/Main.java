import java.util.Scanner;

public class Main {

	// if, else, else if, switch -> Comparador (*comparacion*) { *codigo a ejecutar*
	// }
	/*
	 * comparadores numericos == == Igualdad < menor > mayor >= mayor o igual <
	 * menor o igual != diferente
	 */

	public static void main(String[] args) {
		String pais = "iaoshfioh";

//		if (pais.equals("Chile")) {
//			System.out.println("Wena wn");
//		} else if (pais.equals("EEUU")) {
//			System.out.println("Hello");
//		} else if (pais.equals("Argentina")) {
//			System.out.println("Hola Boludo");
//		} else if (pais.equals("España")) {
//			System.out.println("Hola cabron");
//		} else {
//			System.out.println("Hola");
//		}

		switch (pais) {
		case "Chile": {
			System.out.println("Wena wn");
			break;
		}
		case "EEUU": {
			System.out.println("Hello");
			break;
		}
		case "Argentina": {
			System.out.println("Hola Boludo");
			break;
		}
		case "España": {
			System.out.println("Hola Cabrón");
			break;
		}
		default:{
			System.out.println("Hola");
			break;
		}
		}
	}

}
