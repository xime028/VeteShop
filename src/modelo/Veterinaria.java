package modelo;

import java.util.ArrayList;
import java.util.Iterator;

import exepciones.HospitalizacionException;
import exepciones.ProductoException;
import exepciones.ServicioException;

public class Veterinaria {

	String nombre;
	private ArrayList<Veterinario>listaVeterinarios = new ArrayList<>();
	private ArrayList<Cliente>listaClientes = new ArrayList<>();
	private ArrayList<BuzonPQRS>buzones = new ArrayList<>();
	private ArrayList<Agenda>listaAgendas = new ArrayList<>();
	private ArrayList<Auxiliar>listaAuxiliares = new ArrayList<>();
	private ArrayList<Hospitalizacion>listaHospitalizados = new ArrayList<>();
	private ArrayList<Producto>listaProductos = new ArrayList<>();
	private ArrayList<Servicio>listaServicios = new ArrayList<>();




	//------------------------------------------------------Metodos-Constructores---------------------------------------------------------------

		/**
		 * Este es el metodo constructor vacio de Veterinaria
		 */
		 public Veterinaria(){
			super();
		}

		/**
		 * Este es el metodo constructor de Veterinaria
		 * @param string
		 */
		public Veterinaria(String string) {
			this.nombre = string;
		}


		//------------------------------------------------------Metodos-Set-&-Get---------------------------------------------------------------
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public ArrayList<Veterinario> getListaVeterinarios() {
			return listaVeterinarios;
		}

		public void setListaVeterinarios(ArrayList<Veterinario> listaVeterinarios) {
			this.listaVeterinarios = listaVeterinarios;
		}

		public ArrayList<Cliente> getListaClientes() {
			return listaClientes;
		}

		public void setListaClientes(ArrayList<Cliente> listaClientes) {
			this.listaClientes = listaClientes;
		}

		public ArrayList<BuzonPQRS> getBuzones() {
			return buzones;
		}

		public void setBuzones(ArrayList<BuzonPQRS> buzones) {
			this.buzones = buzones;
		}

		public ArrayList<Agenda> getListaAgendas() {
			return listaAgendas;
		}

		public void setListaAgendas(ArrayList<Agenda> listaAgendas) {
			this.listaAgendas = listaAgendas;
		}

		public ArrayList<Auxiliar> getListaAuxiliares() {
			return listaAuxiliares;
		}

		public void setListaAuxiliares(ArrayList<Auxiliar> listaAuxiliares) {
			this.listaAuxiliares = listaAuxiliares;
		}

		public ArrayList<Hospitalizacion> getListaHospitalizados() {
			return listaHospitalizados;
		}

		public void setListaHospitalizados(ArrayList<Hospitalizacion> listaHospitalizados) {
			this.listaHospitalizados = listaHospitalizados;
		}

		public ArrayList<Producto> getListaProductos() {
			return listaProductos;
		}

		public void setListaProductos(ArrayList<Producto> listaProductos) {
			this.listaProductos = listaProductos;
		}

		public ArrayList<Servicio> getListaServicios() {
			return listaServicios;
		}

		public void setListaServicios(ArrayList<Servicio> listaServicios) {
			this.listaServicios = listaServicios;
		}

		//###############################################################################################################################
				//##################################################### Metodos de Auxiliar#####################################################
//		public Producto crearAuxiliar(String nombre, String correo, String password) throws ProductoException {
//
//
//			Producto producto =  null;
//			Producto productoExistente = obtenerProducto(nombre);
//
//			if(productoExistente != null)
//				throw new ProductoException("Ya existe un producto registrado con nombre: "+nombre);
//			else
//			{
//				producto = new Producto();
//				producto.setCodigo(codigo);
//				producto.setNombre(nombre);
//				producto.setUnidades(unidades);
//				producto.setPrecio(precio);
//
//				getListaProductos().add(producto);
//
//			}
//
//		}
//
//		/**
//		 * Este metodo permite obtener un producto por medio de su nombre
//		 * @param nombreProducto
//		 * @return el producto encontrado
//		 */
//		public Producto obtenerProducto(String nombreProducto) {
//
//			Producto productoEncontrado = null;
//			Iterator<Producto> iterador = getListaProductos().iterator();
//
//			while (iterador.hasNext()) {
//				Producto producto = iterador.next();
//				if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
//					productoEncontrado = producto;
//					break;
//				}
//			}
//
//			return productoEncontrado;
//		}
//
//
//
//		/**
//		 * Este metodo permite eliminar un producto por medio de su nombre
//		 * @param nombreProducto
//		 * @return el producto encontrado
//		 */
//		public Boolean eliminarProducto(String nombreProducto) {
//
//			Boolean flagEliminado = false;
//			Producto producto = obtenerProducto(nombreProducto);
//
//			if (producto != null) {
//				getListaProductos().remove(producto);
//				flagEliminado = true;
//			}
//
//			return flagEliminado;
//		}
//
//
//

		//###############################################################################################################################
		//##################################################### Metodos de Hospitalizacion#####################################################


		public Hospitalizacion crearHospitalizacion(Mascota mascota, String descripcion, String motivo) throws HospitalizacionException {


			Hospitalizacion hospitalizacion =  null;
			Hospitalizacion HospitalizacionRegistrada = obtenerHospitalizacion(nombre);

			if(HospitalizacionRegistrada != null)
				throw new HospitalizacionException("Ya existe una mascota hospitalizada con nombre: "+nombre);
			else
			{
				hospitalizacion = new Hospitalizacion();
				hospitalizacion.setMascota(mascota);
				hospitalizacion.setMotivo(motivo);
				hospitalizacion.setDescripcion(descripcion);
				getListaHospitalizados().add(hospitalizacion);

			}

		}

		/**
		 * Este metodo permite obtener un producto por medio de su nombre
		 * @param nombreProducto
		 * @return el producto encontrado
		 */
		public Hospitalizacion obtenerHospitalizacion(String nombreMascota) {

			Hospitalizacion mascotaEncontrada = null;
			Iterator<Hospitalizacion> iterador = getListaHospitalizados().iterator();

			while (iterador.hasNext()) {
				Hospitalizacion hospitalizacion = iterador.next();
				if (hospitalizacion.getMascota().getNombre().equalsIgnoreCase(nombreMascota)) {
					mascotaEncontrada = hospitalizacion;
					break;
				}
			}

			return mascotaEncontrada;
		}



		/**
		 * Este metodo permite eliminar un producto por medio de su nombre
		 * @param nombreProducto
		 * @return el producto encontrado
		 */
		public Boolean eliminarHospitalizacion(String nombreMascota) {

			Boolean flagEliminado = false;
			Hospitalizacion hospitalizacion = obtenerHospitalizacion(nombreMascota);

			if (hospitalizacion != null) {
				getListaHospitalizados().remove(hospitalizacion);
				flagEliminado = true;
			}

			return flagEliminado;
		}


		//###############################################################################################################################
		//##################################################### Metodos de producto #####################################################


		public Producto crearProducto(String codigo, String nombre, int unidades, double precio) throws ProductoException {


			Producto producto =  null;
			Producto productoExistente = obtenerProducto(nombre);

			if(productoExistente != null)
				throw new ProductoException("Ya existe un producto registrado con nombre: "+nombre);
			else
			{
				producto = new Producto();
				producto.setCodigo(codigo);
				producto.setNombre(nombre);
				producto.setUnidades(unidades);
				producto.setPrecio(precio);

				getListaProductos().add(producto);

			}

		}

		/**
		 * Este metodo permite obtener un producto por medio de su nombre
		 * @param nombreProducto
		 * @return el producto encontrado
		 */
		public Producto obtenerProducto(String nombreProducto) {

			Producto productoEncontrado = null;
			Iterator<Producto> iterador = getListaProductos().iterator();

			while (iterador.hasNext()) {
				Producto producto = iterador.next();
				if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
					productoEncontrado = producto;
					break;
				}
			}

			return productoEncontrado;
		}



		/**
		 * Este metodo permite eliminar un producto por medio de su nombre
		 * @param nombreProducto
		 * @return el producto encontrado
		 */
		public Boolean eliminarProducto(String nombreProducto) {

			Boolean flagEliminado = false;
			Producto producto = obtenerProducto(nombreProducto);

			if (producto != null) {
				getListaProductos().remove(producto);
				flagEliminado = true;
			}

			return flagEliminado;
		}


	//###############################################################################################################################
	//##################################################### Metodos de Servicio #####################################################


		public Servicio crearServicio(String codigo, String nombre, String descripcion, double precio) throws ServicioException {


			Servicio servicio =  null;
			Servicio servicioExistente = obtenerServicio(nombre);

			if(servicioExistente != null)
				throw new ServicioException("Ya existe un servicio registrado con nombre: "+nombre);
			else
			{
				servicio = new Servicio();
				servicio.setCodigo(codigo);
				servicio.setNombre(nombre);
				servicio.setDescripcion(descripcion);
				servicio.setPrecio(precio);

				getListaServicios().add(servicio);

			}

		}

		/**
		 * Este metodo permite obtener un servicio por medio de su nombre
		 * @param nombreServicio
		 * @return el servicio encontrado
		 */
		public Servicio obtenerServicio(String nombreServicio) {

			Servicio servicioEncontrado = null;
			Iterator<Servicio> iterador = getListaServicios().iterator();

			while (iterador.hasNext()) {
				Servicio servicio = iterador.next();
				if (servicio.getNombre().equalsIgnoreCase(nombreServicio)) {
					servicioEncontrado = servicio;
					break;
				}
			}

			return servicioEncontrado;
		}



		/**
		 * Este metodo permite eliminar un servicio por medio de su nombre
		 * @param nombreServicio
		 * @return el servicio encontrado
		 */
		public Boolean eliminarServicio(String nombreServicio) {

			Boolean flagEliminado = false;
			Servicio servicio = obtenerServicio(nombreServicio);

			if (servicio != null) {
				getListaServicios().remove(servicio);
				flagEliminado = true;
			}

			return flagEliminado;
		}


}
