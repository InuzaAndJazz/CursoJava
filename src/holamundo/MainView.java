package holamundo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;

import holamundo.entity.Asignatura;
import holamundo.entity.Profesor;
import holamundo.entity.Sesion;
import holamundo.service.ProfesorService;

public class MainView {
	public static void main(String[] args) {
		
		List<Asignatura> lista_de_asignaturas = new ArrayList<>();
		List<Sesion> lista_de_sesiones = new ArrayList<>();

		boolean salir = false;
		while (!salir) {
			System.out.println("====================================================");
			System.out.println("Programa de administración de nota");
			System.out.println("====================================================");
			System.out.println("Ingrese una opción:");
			System.out.println("1. Inscribir un profesor");
			System.out.println("2. Ver lista de profesores");
			System.out.println("3. Inscribir un asignatura");
			System.out.println("4. Ver lista de asignatura");
			System.out.println("5. Inscribir una sesion");
			System.out.println("6. Ver lista de sesiones");
			System.out.println("0. Salir");

			Scanner scanner = new Scanner(System.in);
			int option = leerOpcion(scanner);

			switch (option) {
			case 1: {
				System.out.println("Ingrese el nombre del profesor:");
				String nombre_profesor = scanner.nextLine();
				ProfesorService.inscribirProfesor(nombre_profesor);
				break;
			}
			case 2: {
				System.out.println("A continuación se muestran los profesores inscritos:");
				for (int i = 0; i < ProfesorService.obtenerListaDeProfesores().size(); i++) {
					System.out.println(i + ". " + ProfesorService.obtenerListaDeProfesores().get(i).nombre);
				}
				break;
			}
			case 3: {
				System.out.println("Ingrese el nombre de la asignatura:");
				String nombre_asignatura = scanner.nextLine();
				boolean existe = existeAsignatura(lista_de_asignaturas, nombre_asignatura);
				if (!existe) {
					Asignatura asignatura = new Asignatura();
					asignatura.nombre = nombre_asignatura;
					lista_de_asignaturas.add(asignatura);
					System.out.println("La asignatura [" + nombre_asignatura + "] ha sido registrado exitosamente.");
				} else {
					System.out.println("La asignatura [" + nombre_asignatura + "] ya está registrada.");
				}
				break;
			}
			case 4: {
				System.out.println("A continuación se muestran las asignaturas creadas:");
				for (int i = 0; i < lista_de_asignaturas.size(); i++) {
					System.out.println(i + ". " + lista_de_asignaturas.get(i).nombre);
				}
				break;
			}
			case 5: {
				System.out.println("Ingrese el nombre de la asignatura:");
				String nombre_asignatura = scanner.nextLine();
				Asignatura asignatura_a_asignar = null;
				for (int i = 0; i < lista_de_asignaturas.size(); i++) {
					Asignatura asignatura = lista_de_asignaturas.get(i);
					if (asignatura.nombre.equals(nombre_asignatura)) {
						asignatura_a_asignar = asignatura;
					}
				}
				if (asignatura_a_asignar == null) {
					System.out.println("La asignatura [" + nombre_asignatura + "] no existe, por favor creela.");
					break;
				}
				System.out.println("Ingrese el nombre del profesor:");
				String nombre_profesor = scanner.nextLine();
				Profesor profesor_a_asignar = ProfesorService.obtenerProfesorPorNombre(nombre_profesor);
				if (profesor_a_asignar == null) {
					System.out.println("El profesor [" + nombre_profesor + "] no está registrado, por favor registrelo.");
					break;
				}
				break;
			}
			case 0: {
				salir = true;
				System.out.println("Adiós!");
				break;
			}
			default: {
				System.out.println("Opción inválida.");
				break;
			}
			}

			System.out.println("");
			System.out.println("");
			System.out.println("");
		}

	}

	private static boolean existeAsignatura(List<Asignatura> lista_de_asignaturas, String nombre_asignatura) {
		for (int i = 0; i < lista_de_asignaturas.size(); i++) {
			Asignatura asignatura = lista_de_asignaturas.get(i);
			if (asignatura.nombre.equals(nombre_asignatura)) {
				return true;
			}
		}
		return false;
	}

	private static int leerOpcion(Scanner scanner) {
		try {
			int ret = Integer.parseInt(scanner.nextLine());
			return ret;
		} catch (Exception e) {
			return -1;
		}
	}
}