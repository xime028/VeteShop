package modelo;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import Exception.AgendaException;
import Exception.BuzonException;
import Exception.ClienteException;
import Exception.HospitalizacionException;
import Exception.ProductoException;
import Exception.ServicioException;
import Exception.VeterinarioException;

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

			return hospitalizacion;

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




		//###############################################################################################################################
		//##################################################### Metodos de Veterinario #####################################################



		public Veterinario crearVeterinario(String nombre, String cedula, String correo, String password) throws VeterinarioException{

			Veterinario veterinario = null;
			Veterinario veterinarioExistente = obtenerVeterinario(cedula);

			if(veterinarioExistente != null){
				throw new VeterinarioException("El veterinario con esta cedula: "+ cedula + "ya existe ");
			}
			else{
				veterinario = new Veterinario();
				veterinario.setCedula(cedula);
				veterinario.setNombre(nombre);
				veterinario.setCorreo(correo);
				veterinario.setPassword(password);

				getListaVeterinarios().add(veterinario);
			}
			return veterinario;
		}


		public Veterinario obtenerVeterinario(String cedula){

			Veterinario veterinarioEncontrado = null;
			Iterator<Veterinario>iterador = getListaVeterinarios().iterator();

			while(iterador.hasNext()){
				Veterinario veterinario = iterador.next();
				if(veterinario.getCedula().equalsIgnoreCase(cedula)){
					veterinarioEncontrado = veterinario;
					break;
				}
			}
			return veterinarioEncontrado;
		}



		public boolean eliminarVeterinario(String cedula) throws VeterinarioException{

			boolean VeteEliminado = false;
			Veterinario veterinario = obtenerVeterinario(cedula);

			if(veterinario != null){
				getListaVeterinarios().remove(veterinario);
				VeteEliminado = true;
			}
			else{
				throw new VeterinarioException("El veterinario con la cedula: "+ cedula + "no existe");
			}

			return VeteEliminado;
		}






		//###############################################################################################################################
		//##################################################### Metodos de Cliente #####################################################



		public Cliente crearCliente(String nombre, String cedula, String correo, String password) throws ClienteException{

			Cliente cliente = null;
			Cliente clienteExistente = obtenerCliente(cedula);

			if(clienteExistente != null){
				throw new ClienteException("El cliente con la cedula: "+ cedula +"ya existe" );
			}
			else{
				cliente = new Cliente ();
				cliente.setCedula(cedula);
				cliente.setNombre(nombre);
				cliente.setCorreo(correo);
				cliente.setPassword(password);

				getListaClientes().add(cliente);

			}
			return cliente;
		}



		public Cliente obtenerCliente(String cedula){

			Cliente clienteEncontrado = null;
			Iterator<Cliente >iterador = getListaClientes().iterator();

			while(iterador.hasNext()){
				Cliente cliente = iterador.next();
				if(cliente.getCedula().equalsIgnoreCase(cedula)){
					clienteEncontrado = cliente;
					break;
				}
			}
			return clienteEncontrado;
		}



		public boolean eliminarCliente(String cedula) throws ClienteException{

			boolean clienteEliminado = false;
			Cliente cliente = obtenerCliente(cedula);

			if(cliente != null){
				getListaClientes().remove(cliente);
				clienteEliminado = true;
			}
			else{
				throw new ClienteException("El cliente con cedula: " + cedula + "no existe");
			}
			return clienteEliminado;
		}




		//###############################################################################################################################
	    //##################################################### Metodos de Buzon #####################################################



		public BuzonPQRS crearBuzon(String codigo, String descripcion, String asunto, Date fecha) throws BuzonException{

			BuzonPQRS buzon = null;
			BuzonPQRS buzonExistente = obtenerBuzon(codigo);

			if(buzonExistente != null){
				throw new BuzonException("El buzon PQRS con el codigo: " + codigo + "ya existe");
			}
			else{
				buzon = new BuzonPQRS();
				buzon.setCodigo(codigo);
				buzon.setAsunto(asunto);
				buzon.setDescripcion(descripcion);
				buzon.setFecha(LocalDate.now());

				getBuzones().add(buzon);
			}
			return buzon;
		}



		public BuzonPQRS obtenerBuzon(String codigo){

			BuzonPQRS buzonEncontrado = null;
			Iterator<BuzonPQRS> iterador = getBuzones().iterator();

			while(iterador.hasNext()){
				BuzonPQRS buzon = iterador.next();
				if(buzon.getCodigo().equalsIgnoreCase(codigo)){
					buzonEncontrado = buzon;
					break;
				}
			}
			return buzonEncontrado;
		}



		public boolean eliminarBuzon(String codigo) throws BuzonException{

			boolean buzonEliminado = false;
			BuzonPQRS buzon = obtenerBuzon(codigo);

			if(buzon != null){
				getBuzones().remove(buzon);
				buzonEliminado = true;
			}
			else{
				throw new BuzonException("El buzon con el codigo: " + codigo + "no existe");
			}
			return buzonEliminado;
		}



		//###############################################################################################################################
		//##################################################### Metodos de Veterinario #####################################################



		public Agenda crearAgenda(String codigo, LocalDate fecha, Time hora, Veterinario veterinario) throws AgendaException{

			Agenda agenda = null;
			Agenda agendaExistente = obtenerAgenda(codigo);

			if(agendaExistente != null){
				throw new AgendaException("La agenda con el codigo: " + codigo + "ya existe");
			}
			else {
				agenda = new Agenda();
				agenda.setCodigo(codigo);
				agenda.setFecha(LocalDate.now());
				agenda.setHora(hora);
				agenda.setVeterinario(veterinario);

				getListaAgendas().add(agenda);
			}
			return agenda;
		}


		public Agenda obtenerAgenda (String codigo){

			Agenda agendaEncontrada = null;
			Iterator<Agenda>iterador = getListaAgendas().iterator();

			while(iterador.hasNext()){
				Agenda agenda = iterador.next();
				if(agenda.getCodigo().equalsIgnoreCase(codigo)){
					agendaEncontrada = agenda;
					break;
				}
			}
			return agendaEncontrada;
		}



		public boolean eliminarAgenda(String codigo) throws AgendaException{

			boolean agendaEliminada = false;
			Agenda agenda = obtenerAgenda(codigo);

			if(agenda != null){
				getListaAgendas().remove(agenda);
				agendaEliminada = true;
			}
			else{
				throw new AgendaException("La agenda con codigo: " + codigo + "no existe");
			}
			return agendaEliminada;
		}
}
