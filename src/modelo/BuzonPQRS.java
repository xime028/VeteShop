package modelo;

import java.sql.Date;

public class BuzonPQRS {

	private int codigo;
	private String descripcion;
	private String asunto;
	private Date fecha;



	public BuzonPQRS(int codigo, String descripcion, String asunto, Date fecha) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.asunto = asunto;
		this.fecha = fecha;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
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



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}










}
