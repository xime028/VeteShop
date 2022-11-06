package modelo;

import java.io.Serializable;

public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String codigo;
	private String nombre;
	private int unidades;
	private double precio;



	public Producto(String codigo, String nombre, int unidades, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.unidades = unidades;
		this.precio = precio;
	}



	public Producto() {
		// TODO Auto-generated constructor stub
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getUnidades() {
		return unidades;
	}



	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}









}
