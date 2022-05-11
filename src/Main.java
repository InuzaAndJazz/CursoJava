import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingresa tu edad actual: ");
		int edadUsuario = lector.nextInt();
		
		System.out.println("Ingresa la edad de tu madre: ");
		int edadMadre = lector.nextInt();
		
		System.out.println("La edad de tu madre cuando naciste era de "+(edadMadre-edadUsuario)+ " años");
	}

}
