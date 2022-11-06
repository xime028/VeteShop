package Controllers;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import Exception.ClienteException;
import Exception.ProductoException;
import modelo.*;

public class ModelFactoryController implements Runnable {

	// Atributos de la clase ModelFactoryController

	Veterinaria veteShop;

	public Veterinaria getVeteShop() {
		return veteShop;
	}

	public void setVeteShop(Veterinaria veteShop) {
		this.veteShop = veteShop;
	}

	// ---------------------------------------------- Singleton
	// ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aquí al ser
		// protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryController getInstance() {
		return SingletonHolder.eINSTANCE;
	}
	// -------------------------------------------Constructor-de-la-Clase-----------------------------------------

	
	/**
	 * Este es el meotodo constructor de la clase ModelFactoryController
	 */
	public ModelFactoryController() {
		System.out.println("invocación clase singleton");

		inicializarDatosPrueba();
		inicializarDatos();

		if (veteShop == null) {
			System.out.println("La veterinaria es null");

		}
	}

	
	private void inicializarDatosPrueba() {

		// Inicializar datos
		veteShop = new Veterinaria("VeteShop");

	}

	public void inicializarDatos() {

		////////////// AUXILIAR////////////////////////////////

		Auxiliar auxiliar = new Auxiliar();
		auxiliar.setCorreo("Juan@gmail.com");
		auxiliar.setNombre("Juan");
		auxiliar.setPassword("1234");

		veteShop.getListaAuxiliares().add(auxiliar);

		Auxiliar auxiliar1 = new Auxiliar();
		auxiliar1.setCorreo("Camila@gmail.com");
		auxiliar1.setNombre("Camila");
		auxiliar1.setPassword("0000");

		veteShop.getListaAuxiliares().add(auxiliar1);

		Auxiliar auxiliar2 = new Auxiliar();
		auxiliar2.setCorreo("Sofia@gmail.com");
		auxiliar2.setNombre("Sofia");
		auxiliar2.setPassword("1111");

		veteShop.getListaAuxiliares().add(auxiliar2);

		Auxiliar auxiliar3 = new Auxiliar();
		auxiliar3.setCorreo("Andres@gmail.com");
		auxiliar3.setNombre("Andres");
		auxiliar3.setPassword("2222");

		veteShop.getListaAuxiliares().add(auxiliar3);

		//////////////////// Buzon Pqrs/////////////////////////

		BuzonPQRS buzon = new BuzonPQRS();
		buzon.setCodigo("12");
		buzon.setAsunto("Solicitud");
		buzon.setFecha(LocalDate.of(2022, 10, 15));
		buzon.setDescripcion("Solicitud de reembolso");

		veteShop.getBuzones().add(buzon);

		BuzonPQRS buzon1 = new BuzonPQRS();
		buzon1.setCodigo("13");
		buzon1.setAsunto("Solicitud");
		buzon1.setFecha(LocalDate.of(2022, 9, 3));
		buzon1.setDescripcion("Solicitud de cambio de cepillo");

		veteShop.getBuzones().add(buzon1);

		BuzonPQRS buzon2 = new BuzonPQRS();
		buzon2.setCodigo("14");
		buzon2.setAsunto("Reclamo");
		buzon2.setFecha(LocalDate.of(2022, 12, 3));
		buzon2.setDescripcion("Reclamo por mal estado de un producto");

		veteShop.getBuzones().add(buzon2);

		BuzonPQRS buzon3 = new BuzonPQRS();
		buzon3.setCodigo("14");
		buzon3.setAsunto("Queja");
		buzon3.setFecha(LocalDate.of(2022, 10, 30));
		buzon3.setDescripcion("Queja por mala atencion");

		veteShop.getBuzones().add(buzon3);

		//////////////////// PRODUCTOS ///////////////////////////

//		Producto producto = new Producto();
//		producto.setCodigo("1");
//		producto.setNombre("Peine");
//		producto.setPrecio(10000);
//		producto.setUnidades(10);
//
//		veteShop.getListaProductos().add(producto);
//		
//
//		Producto producto2 = new Producto();
//		producto2.setCodigo("2");
//		producto2.setNombre("Cepillo");
//		producto2.setPrecio(15000);
//		producto2.setUnidades(10);
//
//		veteShop.getListaProductos().add(producto2);
//
//		Producto producto3 = new Producto();
//		producto3.setCodigo("3");
//		producto3.setNombre("Pañoleta roja");
//		producto3.setPrecio(5000);
//		producto3.setUnidades(10);
//
//		veteShop.getListaProductos().add(producto3);
//
//		Producto producto4 = new Producto();
//		producto4.setCodigo("4");
//		producto4.setNombre("Correa canina rosada");
//		producto4.setPrecio(30000);
//		producto4.setUnidades(10);
//
//		veteShop.getListaProductos().add(producto4);
//		
//
//		try {
//			Persistencia.serializarObjectoXML("src/Persistencia/Archivos/Productos.xml", veteShop.getListaProductos());
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//
//		}

		//////////////// SERVICIOS////////////////////////

		Servicio servicio = new Servicio();
		servicio.setCodigo("1");
		servicio.setNombre("Baño canino ");
		servicio.setDescripcion("Baño, cepillada y peinada canina");
		servicio.setPrecio(40000);

		veteShop.getListaServicios().add(servicio);

		Servicio servicio1 = new Servicio();
		servicio1.setCodigo("1");
		servicio1.setNombre("Baño canino ");
		servicio1.setDescripcion("Baño, cepillada y peinada canina");
		servicio1.setPrecio(40000);

		veteShop.getListaServicios().add(servicio1);

		Servicio servicio2 = new Servicio();
		servicio2.setCodigo("1");
		servicio2.setNombre("Baño canino ");
		servicio2.setDescripcion("Baño, cepillada y peinada canina");
		servicio2.setPrecio(40000);

		veteShop.getListaServicios().add(servicio2);

		Servicio servicio3 = new Servicio();
		servicio3.setCodigo("1");
		servicio3.setNombre("Baño canino ");
		servicio3.setDescripcion("Baño, cepillada y peinada canina");
		servicio3.setPrecio(40000);

		veteShop.getListaServicios().add(servicio3);

		////////////////// MASCOTAS////////////////////////

		Mascota mascota1 = new Mascota();
		mascota1.setNombre("Tony");
		mascota1.setEdad(3);
		mascota1.setTipo(TipoMascota.PERRO);
		mascota1.setEnfermo("No");

		Mascota mascota2 = new Mascota();
		mascota2.setNombre("Lucas");
		mascota2.setEdad(2);
		mascota2.setTipo(TipoMascota.GATO);
		mascota2.setEnfermo("No");

		Mascota mascota3 = new Mascota();
		mascota3.setNombre("Fifi");
		mascota3.setEdad(1);
		mascota3.setTipo(TipoMascota.HASMTER);
		mascota3.setEnfermo("No");

		///////////////////// CLIENTE////////////////

		Cliente cliente = new Cliente();
		cliente.setCedula("123");
		cliente.setNombre("Juan");
		cliente.setCorreo("juan@gmail.com");
		cliente.setPassword("greehgeh");
		cliente.getListaMascotas().add(mascota1);

		veteShop.getListaClientes().add(cliente);

		Cliente cliente2 = new Cliente();
		cliente2.setCedula("554");
		cliente2.setNombre("Luis");
		cliente2.setCorreo("luis@gmail.com");
		cliente2.setPassword("gregfgfhgeh");
		cliente2.getListaMascotas().add(mascota2);

		veteShop.getListaClientes().add(cliente2);

		Cliente cliente3 = new Cliente();
		cliente3.setCedula("565664");
		cliente3.setNombre("Camilo");
		cliente3.setCorreo("cam@gmail.com");
		cliente3.setPassword("jyjy");
		cliente3.getListaMascotas().add(mascota3);

		veteShop.getListaClientes().add(cliente3);

		Cliente cliente4 = new Cliente();
		cliente4.setCedula("87966");
		cliente4.setNombre("Jose");
		cliente4.setCorreo("jose@gmail.com");
		cliente4.setPassword("jyjy");

		veteShop.getListaClientes().add(cliente4);

		///////////////////// VETERINARIOS///////////////////

		Veterinario veterinario = new Veterinario();
		veterinario.setCedula("9855");
		veterinario.setNombre("Willian");
		veterinario.setCorreo("will@gmail.com");
		veterinario.setPassword("egfefege");

		veteShop.getListaVeterinarios().add(veterinario);

		Veterinario veterinario1 = new Veterinario();
		veterinario1.setCedula("9555");
		veterinario1.setNombre("Julian");
		veterinario1.setCorreo("julian@gmail.com");
		veterinario1.setPassword("egfefege");

		veteShop.getListaVeterinarios().add(veterinario1);

		Veterinario veterinario2 = new Veterinario();
		veterinario2.setCedula("5454545");
		veterinario2.setNombre("Juana");
		veterinario2.setCorreo("j@gmail.com");
		veterinario2.setPassword("egfefege");

		veteShop.getListaVeterinarios().add(veterinario2);

		//////////////////// AGENDA///////////////////////

		Agenda agenda = new Agenda();
		agenda.setCodigo("1");
		agenda.setFecha(LocalDate.of(2022, 11, 15));
		agenda.setHora(Time.valueOf("13:00:00"));
		agenda.setVeterinario(veterinario);

		veteShop.getListaAgendas().add(agenda);

		Agenda agenda1 = new Agenda();
		agenda1.setCodigo("2");
		agenda1.setFecha(LocalDate.of(2022, 10, 15));
		agenda1.setHora(Time.valueOf("13:00:00"));
		agenda1.setVeterinario(veterinario1);

		veteShop.getListaAgendas().add(agenda1);

		Agenda agenda2 = new Agenda();
		agenda2.setCodigo("3");
		agenda2.setFecha(LocalDate.of(2022, 12, 15));
		agenda2.setHora(Time.valueOf("13:00:00"));
		agenda2.setVeterinario(veterinario2);

		veteShop.getListaAgendas().add(agenda2);

		//////////////////// CITAS////////////////////////

		Cita cita = new Cita();
		cita.setCodigo("1");
		cita.setAgenda(agenda);
		cita.setCliente(cliente);
		cita.setMascota(mascota1);

		Cita cita1 = new Cita();
		cita1.setCodigo("2");
		cita1.setAgenda(agenda1);
		cita1.setCliente(cliente2);
		cita1.setMascota(mascota2);

		Cita cita2 = new Cita();
		cita2.setCodigo("3");
		cita2.setAgenda(agenda2);
		cita2.setCliente(cliente3);
		cita2.setMascota(mascota3);

		veterinario.getCitasAsignadas().add(cita);
		veterinario1.getCitasAsignadas().add(cita1);
		veterinario2.getCitasAsignadas().add(cita2);

		///////////////////// COMPRA/////////////////////////

		Compra compra = new Compra();
		compra.setCodigo("10");
		compra.setCliente(cliente);
//		compra.getListaProductos().add(producto);
//		compra.getListaProductos().add(producto2);
		compra.getListaServicios().add(servicio);
		compra.setMetodoPago(MetodoPago.TARJETA_CREDITO);

		cliente.getListaCompras().add(compra);
		cliente.getListaServicios().add(servicio);

		Compra compra1 = new Compra();
		compra1.setCodigo("20");
		compra1.setCliente(cliente3);
//		compra1.getListaProductos().add(producto);
//		compra1.getListaProductos().add(producto2);
		compra1.getListaServicios().add(servicio);
		compra1.setMetodoPago(MetodoPago.TARJETA_DEBITO);

		cliente3.getListaCompras().add(compra1);
		cliente3.getListaServicios().add(servicio1);

		Compra compra2 = new Compra();
		compra2.setCodigo("30");
		compra2.setCliente(cliente2);
//		compra2.getListaProductos().add(producto);
//		compra2.getListaProductos().add(producto2);
		compra2.getListaServicios().add(servicio);
		compra2.setMetodoPago(MetodoPago.TARJETA_CREDITO);

		cliente2.getListaCompras().add(compra);
		cliente2.getListaServicios().add(servicio);

		Compra compra3 = new Compra();
		compra3.setCodigo("20");
		compra3.setCliente(cliente);
//		compra3.getListaProductos().add(producto);
//		compra3.getListaProductos().add(producto2);
		compra3.getListaServicios().add(servicio);
		compra3.setMetodoPago(MetodoPago.TARJETA_DEBITO);

		cliente.getListaCompras().add(compra3);
		cliente.getListaServicios().add(servicio);

		////////////// GUARDERIA/////////////

		Guarderia guarderia = new Guarderia();
		guarderia.setAuxiliar(auxiliar3);
		guarderia.getListaMascotas().add(mascota1);
		guarderia.getListaMascotas().add(mascota3);
		guarderia.getListaMascotas().add(mascota2);

		/////////// HOSPITALIZACION//////////////////////
		Hospitalizacion hospitalizacion = new Hospitalizacion();
		hospitalizacion.setMascota(mascota1);
		hospitalizacion.setMotivo("Fractura de femur");
		hospitalizacion.setDescripcion("Fractura multiple en el femur izquierdo");

		veteShop.getListaHospitalizados().add(hospitalizacion);

		Hospitalizacion hospitalizacion1 = new Hospitalizacion();
		hospitalizacion1.setMascota(mascota2);
		hospitalizacion1.setMotivo("Deshidratacion");
		hospitalizacion1.setDescripcion("Lleva una semana con los niveles de deshidratacion por debajo de 3");

		veteShop.getListaHospitalizados().add(hospitalizacion1);

		////////////// HISTORIAL MEDICO///////////////////

		HistorialMedico historial = new HistorialMedico();
		historial.getCitas().add(cita);
		historial.setMascota(mascota1);
		historial.getHospitalizaciones().add(hospitalizacion);

		HistorialMedico historial1 = new HistorialMedico();
		historial1.getCitas().add(cita1);
		historial1.setMascota(mascota2);
		historial1.getHospitalizaciones().add(hospitalizacion1);

	}

	public String crearCliente(String nombre, String cedula, String correo, String contraseña) throws ClienteException {
	
		String mensaje ="";
		getVeteShop().crearCliente(nombre, cedula, correo,contraseña);
		mensaje ="Cliente creado con exito";
		System.out.println("3");
	
		return mensaje;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	

}