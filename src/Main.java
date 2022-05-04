import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa el largo del rectangulo: ");
		String lineaLeida = lector.nextLine();
		double largo = Double.parseDouble(lineaLeida);
		
		System.out.println("Ingresa el ancho del rectangulo: ");
		lineaLeida = lector.nextLine();
		double ancho = Double.parseDouble(lineaLeida);

		System.out.println("El area del rectangulo es " + (largo * ancho));
		System.out.println("El perimetro del rectangulo es " + (largo*2 + ancho*2));
	}

}
