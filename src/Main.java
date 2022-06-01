import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		int numero_usuario = lector.nextInt();
		System.out.println("Los números primos encontrados de 1 a " + numero_usuario + " son:");

		for (int i = 1; i <= numero_usuario; i++) {
//			System.out.println("===================================================");
//			System.out.println("Validando si el número " + i + " es un número primo");
//			System.out.println("===================================================");
			int divisores = 0;
			for (int j = 1; j <= i; j++) {
//				System.out.println("Validando si el número " + j + " es un divisor de " + i);
				if (i % j == 0) {
					divisores++;
				}
			}
			if (divisores <= 2) {
				System.out.println(i);
			} else {
//				System.out.println(i + " NO es un número primo");
			}

		}
	}

}
