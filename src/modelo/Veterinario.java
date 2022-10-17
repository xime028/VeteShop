package modelo;

import java.util.ArrayList;

public class Veterinario {

	private String nombre;
	private String cedula;
	private String correo;
	private String password;

	private ArrayList<Hospitalizacion>listaHospitalizados = new ArrayList<>();
	private ArrayList<Cita>citasAsignadas = new ArrayList<>();



	public Veterinario(String nombre, String cedula, String correo, String password,
			ArrayList<Hospitalizacion> listaHospitalizados, ArrayList<Cita> citasAsignadas) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.correo = correo;
		this.password = password;
		this.listaHospitalizados = listaHospitalizados;
		this.citasAsignadas = citasAsignadas;
	}
	
	
	public Veterinario(){
		
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public ArrayList<Hospitalizacion> getListaHospitalizados() {
		return listaHospitalizados;
	}



	public void setListaHospitalizados(ArrayList<Hospitalizacion> listaHospitalizados) {
		this.listaHospitalizados = listaHospitalizados;
	}



	public ArrayList<Cita> getCitasAsignadas() {
		return citasAsignadas;
	}



	public void setCitasAsignadas(ArrayList<Cita> citasAsignadas) {
		this.citasAsignadas = citasAsignadas;
	}












}
