package modelo;

import java.io.Serializable;


public class Hospitalizacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Mascota mascota;
	private String descripcion;
	private String motivo;



	public Hospitalizacion(Mascota mascota, String descripcion, String motivo) {
		super();
		this.mascota = mascota;
		this.descripcion = descripcion;
		this.motivo = motivo;
	}


	public Hospitalizacion(){

	}



	public Mascota getMascota() {
		return mascota;
	}



	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getMotivo() {
		return motivo;
	}



	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}












}
