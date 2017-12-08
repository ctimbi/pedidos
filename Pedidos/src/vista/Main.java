package vista;

import java.util.Scanner;

import controlador.GestionPersonas;
import modelo.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		GestionPersonas gp = new GestionPersonas();
		
		do {
			System.out.println("1. Ingresar registro de persona");
			System.out.println("2. Listar");
			System.out.println("3. Salir");
			String op = sc.nextLine();
			switch (op) {
			case "1":
				System.out.print("\tIngrese cédula: ");
				String cedula = sc.nextLine();
				System.out.print("\tIngrese nombre: ");
				String nombre = sc.nextLine();
				System.out.print("\tIngrese direccion: ");
				String direccion = sc.nextLine();
				Persona p = new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				p.setDireccion(direccion);
				gp.guardarPersona(p);
				break;
			
			case "3":
				System.exit(0);
				break;

			default:
				break;
			}
			
		}while(true);
		
		
		
	}

}
