package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Mascota {

	private String nombre;
	private int edad;
	private TipoMascota tipo;
	private String enfermo;
	private ArrayList<Cita>citas = new ArrayList<>();



	public Mascota(String nombre, int edad, TipoMascota tipo, ArrayList<Cita> citas, String enfermo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.tipo = tipo;
		this.citas = citas;
		this.enfermo = enfermo;
	}
	
	
	
	
	//###############################################################################################################################
	//##################################################### Metodos de Cita #####################################################
			
			
			/*
			public Cita crearCita(Agenda agenda, Mascota mascota, Cliente cliente){
				
				Cita cita = null;
				cita = 
			}
			
			
			
			public Cita obtenerCita(String codigo){
				
				Cita citaEncontrada = null;
				Iterator<Cita> iterador = getLi
			}
			*/


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public TipoMascota getTipo() {
		return tipo;
	}



	public void setTipo(TipoMascota tipo) {
		this.tipo = tipo;
	}



	public ArrayList<Cita> getCitas() {
		return citas;
	}



	public void setCitas(ArrayList<Cita> citas) {
		this.citas = citas;
	}



	public String getEnfermo() {
		return enfermo;
	}



	public void setEnfermo(String enfermo) {
		this.enfermo = enfermo;
	}












}
