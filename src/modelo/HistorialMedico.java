package modelo;

import java.util.ArrayList;

public class HistorialMedico {


	private Mascota mascota;
	private ArrayList<Cita>citas = new ArrayList<>();
	private ArrayList<Hospitalizacion>hospitalizaciones = new ArrayList<>();



	public HistorialMedico(Mascota mascota, ArrayList<Cita> citas, ArrayList<Hospitalizacion> hospitalizaciones) {
		super();
		this.mascota = mascota;
		this.citas = citas;
		this.hospitalizaciones = hospitalizaciones;
	}



	public HistorialMedico() {
		// TODO Auto-generated constructor stub
	}



	public Mascota getMascota() {
		return mascota;
	}



	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}



	public ArrayList<Cita> getCitas() {
		return citas;
	}



	public void setCitas(ArrayList<Cita> citas) {
		this.citas = citas;
	}



	public ArrayList<Hospitalizacion> getHospitalizaciones() {
		return hospitalizaciones;
	}



	public void setHospitalizaciones(ArrayList<Hospitalizacion> hospitalizaciones) {
		this.hospitalizaciones = hospitalizaciones;
	}










}
