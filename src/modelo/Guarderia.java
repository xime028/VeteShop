package modelo;

import java.util.ArrayList;

public class Guarderia {

	private ArrayList<Mascota> listaMascotas = new ArrayList<>();
	Auxiliar auxiliar;



	public Guarderia(ArrayList<Mascota> listaMascotas, Auxiliar auxiliar) {
		super();
		this.listaMascotas = listaMascotas;
		this.auxiliar = auxiliar;
	}



	public Guarderia() {
		// TODO Auto-generated constructor stub
	}



	public ArrayList<Mascota> getListaMascotas() {
		return listaMascotas;
	}



	public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
		this.listaMascotas = listaMascotas;
	}



	public Auxiliar getAuxiliar() {
		return auxiliar;
	}



	public void setAuxiliar(Auxiliar auxiliar) {
		this.auxiliar = auxiliar;
	}








}
