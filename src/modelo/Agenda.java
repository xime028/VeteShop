package modelo;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Agenda {

	private String codigo;
	private LocalDate fecha;
	private Time hora;
	private Veterinario veterinario;




	public Agenda(){

	}

	public Agenda(String codigo, LocalDate fecha, Time hora, Veterinario veterinario) {
		super();
		this.fecha = fecha;
		this.hora = hora;
		this.veterinario = veterinario;
	}





	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
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
