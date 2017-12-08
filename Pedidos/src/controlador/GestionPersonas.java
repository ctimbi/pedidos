package controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Persona;

public class GestionPersonas {
	
	private String pathPersonas = "archivos/personas.txt";

	public void guardarPersona(Persona p) {
		try {
			FileWriter file = new FileWriter(pathPersonas, true);
			BufferedWriter out = new BufferedWriter(file);
			String registro = p.getCedula()+";"+p.getNombre()+";"+p.getDireccion();
			out.append(registro+"\n");
			out.close();
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
