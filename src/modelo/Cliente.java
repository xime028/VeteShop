package modelo;

import java.util.ArrayList;

public class Cliente {


	private String nombre;
	private String cedula;
	private String correo;
	private String password;
	private ArrayList<Compra>listaCompras = new ArrayList<>();
	private ArrayList<Servicio>listaServicios = new ArrayList<>();
	private ArrayList<Mascota> listaMascotas = new ArrayList<>();



	public Cliente(String nombre, String cedula, String correo, String password, ArrayList<Compra> listaCompras,
			ArrayList<Servicio> listaServicios, ArrayList<Mascota> listaMascotas) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.correo = correo;
		this.password = password;
		this.listaCompras = listaCompras;
		this.listaServicios = listaServicios;
		this.listaMascotas = listaMascotas;
	}


	public Cliente(){

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



	public ArrayList<Compra> getListaCompras() {
		return listaCompras;
	}



	public void setListaCompras(ArrayList<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}



	public ArrayList<Servicio> getListaServicios() {
		return listaServicios;
	}



	public void setListaServicios(ArrayList<Servicio> listaServicios) {
		this.listaServicios = listaServicios;
	}



	public ArrayList<Mascota> getListaMascotas() {
		return listaMascotas;
	}



	public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
		this.listaMascotas = listaMascotas;
	}













}
