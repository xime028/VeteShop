package modelo;

import java.sql.Date;
import java.sql.Time;

public class Agenda {

	private Date fecha;
	private Time hora;
	private Veterinario veterinario;




	public Agenda(){

	}

	public Agenda(Date fecha, Time hora, Veterinario veterinario) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.veterinario = veterinario;
	}




	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public Veterinario getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}








}
