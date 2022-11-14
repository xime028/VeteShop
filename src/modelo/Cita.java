package modelo;

public class Cita {

	private String codigo;
	private Agenda agenda;
	private Mascota mascota;
	private Cliente cliente;



	public Cita(String codigo, Agenda agenda, Mascota mascota, Cliente cliente) {
		this.codigo = codigo;
		this.agenda = agenda;
		this.mascota = mascota;
		this.cliente = cliente;
	}

	public Cita(){

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



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}















}
