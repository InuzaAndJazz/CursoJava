package holamundo.service;

import java.util.ArrayList;
import java.util.List;

import holamundo.entity.Profesor;

public class ProfesorService {

	public static List<Profesor> lista_de_profesores = new ArrayList<>();

	public static void inscribirProfesor(String nombre_profesor) {
		boolean existe = existeProfesor(lista_de_profesores, nombre_profesor);
		if (!existe) {
			Profesor profesor = new Profesor();
			profesor.nombre = nombre_profesor;
			lista_de_profesores.add(profesor);
			System.out.println("El profesor [" + nombre_profesor + "] ha sido registrado exitosamente.");
		} else {
			System.out.println("El profesor [" + nombre_profesor + "] ya está registrado.");
		}
	}

	public static List<Profesor> obtenerListaDeProfesores() {
		return lista_de_profesores;
	}

	private static boolean existeProfesor(List<Profesor> lista_de_profesores, String nombre_profesor) {
		for (int i = 0; i < lista_de_profesores.size(); i++) {
			Profesor profesor = lista_de_profesores.get(i);
			if (profesor.nombre.equals(nombre_profesor)) {
				return true;
			}
		}
		return false;
	}

	public static Profesor obtenerProfesorPorNombre(String nombre_profesor) {
		for (int i = 0; i < lista_de_profesores.size(); i++) {
			Profesor profesor = lista_de_profesores.get(i);
			if (profesor.nombre.equals(nombre_profesor)) {
				return profesor;
			}
		}
		return null;
	}

}
