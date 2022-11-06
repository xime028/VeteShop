package modelo;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

public class BuzonPQRS implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String descripcion;
	private String asunto;
	private LocalDate fecha;



	public BuzonPQRS(String codigo, String descripcion, String asunto, LocalDate fecha) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.asunto = asunto;
		this.fecha = fecha;
	}


	public BuzonPQRS(){

	}


	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getAsunto() {
		return asunto;
	}



	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}



	public LocalDate getFecha() {
		return fecha;
	}



	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}










}
