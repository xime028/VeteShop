package modelo;

public class Cita {

	Agenda agenda;
	Mascota mascota;
	Cliente cliente;



	public Cita(Agenda agenda, Mascota mascota, Cliente cliente) {
		super();
		this.agenda = agenda;
		this.mascota = mascota;
		this.cliente = cliente;
	}



	public Agenda getAgenda() {
		return agenda;
	}



	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}



	public Mascota getMascota() {
		return mascota;
	}



	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}












}
