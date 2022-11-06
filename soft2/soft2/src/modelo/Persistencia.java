package modelo;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Formatter;


public class Persistencia {
	

	/**
	 * Se crean variables de tipo string para asignarles una ruta, para la creacion de archivos de texto en donde se va a guardar los objetos
	 */

	/**
	 * se crean unas listas en odnde se van a guardar lso objetos que se deserializan
	 */


	
	public static ArrayList<Veterinario> listaVeterinariosRecuperados = new ArrayList<>();
	public static ArrayList<Cliente> listaClientesRecuperados = new ArrayList<>();
	public static ArrayList<BuzonPQRS> listaBuzonPQRSRecuperadas = new ArrayList<>();
	public static ArrayList<Agenda> listaAgendaRecuperados = new ArrayList<>();
	public static ArrayList<Auxiliar> listaAuxiliaresRecuperados = new ArrayList<>();
	public static ArrayList<Hospitalizacion> listaHospitalizadosRecuperados = new ArrayList<>();
	public static ArrayList<Producto> listaProductoRecuperados = new ArrayList<>();
	public static ArrayList<Servicio> listaServicioRecuperados = new ArrayList<>();



	public static void almacenarDatos(String rutaArchivo, String formato, Object args,Object args1,Object args2,Object args3) throws IOException {


		Formatter archivo;

		archivo = new Formatter(rutaArchivo);
		archivo.format(formato, args,args1,args2,args3);
		archivo.flush();
		archivo.close();


	}


	public static void escribirArchivo(String rutaArchivo, ArrayList<String> texto,boolean adicionar) throws IOException
	{

		FileWriter archivoSalida = null;
		BufferedWriter  bufferSalida;

		archivoSalida = new FileWriter(rutaArchivo, adicionar);
		bufferSalida =  new BufferedWriter(archivoSalida);

		for (String linea : texto)
		{
			bufferSalida.write(linea+"\n");
		}


		bufferSalida.flush();
		bufferSalida.close();

		archivoSalida.close();
	}

   /**
    * Metodo que lee un archivo de texto con una arraylist
    * @param ruta
    * @return contendio
    * @throws IOException
    */


	public static ArrayList<String> leerArchivo(String ruta) throws IOException {

		ArrayList<String>  contenido = new ArrayList<String>();
		FileReader fr=new FileReader(ruta);
		BufferedReader bfr=new BufferedReader(fr);
		String linea="";
		while((linea = bfr.readLine())!=null)
		{
			contenido.add(linea);
		}
		bfr.close();
		fr.close();
		return contenido;
	}
	
	/**
	 * Metodo que permite seriliazar arraylist en archivos xml
	 * @param nombreArchivo
	 * @param objeto
	 * @throws Exception
	 */

	public static void serializarObjectoXML(String nombreArchivo, Object objeto) throws Exception{

		XMLEncoder codificador;

		codificador= new XMLEncoder(new FileOutputStream(nombreArchivo, false));
		codificador.writeObject(objeto);
		codificador.close();

	}

    /**
     * 
     * @param nombreArchivo
     * @param listaVeterinarios
     * @return
     * @throws Exception
     */

	public static ArrayList<Veterinario> deserializarVeterinariosXML(String nombreArchivo, ArrayList<Veterinario> listaVeterinarios) throws Exception{

		XMLDecoder decodificador;
		decodificador = new XMLDecoder(new FileInputStream(nombreArchivo));
		listaVeterinariosRecuperados = (ArrayList<Veterinario>) decodificador.readObject();
		decodificador.close();

		for (Veterinario veterinario : listaVeterinariosRecuperados) {
			listaVeterinarios.add(veterinario);
			System.out.println(veterinario);
		}

		return listaVeterinarios;

	}

	/**
	 * 
	 * @param nombreArchivo
	 * @param listaClientes
	 * @return
	 * @throws FileNotFoundException
	 */

	public static  ArrayList<Cliente> deserializarClienteXML(String nombreArchivo, ArrayList<Cliente> listaClientes) throws FileNotFoundException {

		XMLDecoder decodificador;
		decodificador = new XMLDecoder(new FileInputStream(nombreArchivo));
		listaClientesRecuperados = (ArrayList<Cliente>) decodificador.readObject();
		decodificador.close();


		for (Cliente cliente : listaClientesRecuperados) {

			listaClientes.add(cliente);
			System.out.println(cliente);

		}

		return listaClientes;
	}


	/**
	 * 
	 * @param nombreArchivo
	 * @param buzones
	 * @return
	 * @throws FileNotFoundException
	 */


	public static ArrayList<BuzonPQRS>  deserializarBuzonPQRSXML(String nombreArchivo, ArrayList<BuzonPQRS> buzones) throws FileNotFoundException {

		XMLDecoder decodificador;
		decodificador = new XMLDecoder(new FileInputStream(nombreArchivo));
		listaBuzonPQRSRecuperadas = (ArrayList<BuzonPQRS>) decodificador.readObject();
		decodificador.close();

		for (BuzonPQRS buzonPqrs : listaBuzonPQRSRecuperadas) {

			buzones.add(buzonPqrs);
			System.out.println(buzonPqrs);

		}

		return buzones;
	}

    /**
     * 
     * @param nombreArchivo
     * @param listaAgendas
     * @return
     * @throws FileNotFoundException
     */

	public static ArrayList<Agenda>  deserializarAgendasXML(String nombreArchivo, ArrayList<Agenda> listaAgendas) throws FileNotFoundException {

		XMLDecoder decodificador;
		decodificador = new XMLDecoder(new FileInputStream(nombreArchivo));
		listaAgendaRecuperados = (ArrayList<Agenda>) decodificador.readObject();
		decodificador.close();

		for (Agenda agenda : listaAgendaRecuperados) {

			listaAgendas.add(agenda);
			System.out.println();

		}

		return listaAgendas;
	}

    /**
     * 
     * @param nombreArchivo
     * @param listaAuxiliares
     * @return
     * @throws FileNotFoundException
     */


	public static ArrayList<Auxiliar>  deserializarAuxiliaresXML(String nombreArchivo, ArrayList<Auxiliar> listaAuxiliares) throws FileNotFoundException {

		XMLDecoder decodificador;
		decodificador = new XMLDecoder(new FileInputStream(nombreArchivo));
		listaAuxiliaresRecuperados = (ArrayList<Auxiliar>) decodificador.readObject();
		decodificador.close();

		for (Auxiliar auxiliar : listaAuxiliaresRecuperados) {

			listaAuxiliares.add(auxiliar);
			System.out.println(auxiliar);

		}

		return listaAuxiliares;
	}

	/**
	 * 
	 * @param nombreArchivo
	 * @param listaHospitalizados
	 * @return
	 * @throws FileNotFoundException
	 */
	
	
	public static  ArrayList<Hospitalizacion>  deserializarHospitalizadosXML(String nombreArchivo,
			ArrayList<Hospitalizacion> listaHospitalizados) throws FileNotFoundException {

		XMLDecoder decodificador;
		decodificador = new XMLDecoder(new FileInputStream(nombreArchivo));
		listaHospitalizadosRecuperados = (ArrayList<Hospitalizacion>) decodificador.readObject();
		decodificador.close();

		for (Hospitalizacion hospitalizados : listaHospitalizadosRecuperados) {

			listaHospitalizados.add(hospitalizados);
			System.out.println(hospitalizados);

		}

		return listaHospitalizados;
	}

	/**
	 * 
	 * @param nombreArchivo
	 * @param listaProductos
	 * @return
	 * @throws FileNotFoundException
	 */


	public static ArrayList<Producto> deserializarProductoXML(String nombreArchivo,
			ArrayList<Producto> listaProductos) throws FileNotFoundException {


		XMLDecoder decodificador;
		decodificador = new XMLDecoder(new FileInputStream(nombreArchivo));
		listaProductoRecuperados = (ArrayList<Producto>) decodificador.readObject();
		decodificador.close();

		for (Producto producto : listaProductoRecuperados) {

			listaProductos .add(producto);
			System.out.println(producto);

		}

		return listaProductos;
	}


	/**
	 * 
	 * @param nombreArchivo
	 * @param listaServicios
	 * @return
	 * @throws FileNotFoundException
	 */
	
	public static ArrayList<Servicio> deserializarServiciosXML(String nombreArchivo,
			ArrayList<Servicio> listaServicios) throws FileNotFoundException {


		XMLDecoder decodificador;
		decodificador = new XMLDecoder(new FileInputStream(nombreArchivo));
		listaServicioRecuperados = (ArrayList<Servicio>) decodificador.readObject();
		decodificador.close();

		for (Servicio servicio : listaServicioRecuperados) {

			listaServicios.add(servicio);
			System.out.println(servicio);

		}

		return listaServicios;

	}







}
