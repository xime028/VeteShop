package modelo;

import java.util.ArrayList;

public class Compra {


	private String codigo;
	Cliente cliente;
	MetodoPago metodoPago;
	private ArrayList<Producto>listaProductos = new ArrayList<>();
	private ArrayList<Servicio>listaServicios = new ArrayList<>();



	public Compra(String codigo, Cliente cliente, ArrayList<Producto> listaProductos,MetodoPago metodoPago, ArrayList<Servicio>listaServicios) {
		super();
		this.codigo = codigo;
		this.cliente = cliente;
		this.listaProductos = listaProductos;
		this.listaServicios = listaServicios;
		this.metodoPago = metodoPago;
	}

	public Compra() {

	}

	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}



	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}



	public MetodoPago getMetodoPago() {
		return metodoPago;
	}



	public void setMetodoPago(MetodoPago metodoPago) {
		this.metodoPago = metodoPago;
	}



	public ArrayList<Servicio> getListaServicios() {
		return listaServicios;
	}



	public void setListaServicios(ArrayList<Servicio> listaServicios) {
		this.listaServicios = listaServicios;
	}











}
