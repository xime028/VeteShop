package Controllers;

import java.util.ArrayList;

import org.eclipse.swt.widgets.Text;

import Exception.ClienteException;
import modelo.Compra;
import modelo.Mascota;
import modelo.Servicio;
import modelo.Veterinaria;

public class Controlador {

	static ModelFactoryController modelFactoryController;
	Veterinaria veterinaria;

	public Veterinaria getVeterinaria() {
		return veterinaria;
	}

	public void setVeterinaria(Veterinaria veterinaria) {
		this.veterinaria = veterinaria;
	}

	public Controlador() {

		modelFactoryController = ModelFactoryController.getInstance();
		veterinaria = modelFactoryController.getVeteShop();
	}

	public static String crearCliente(String nombre, String cedula, String correo, String contraseña) throws ClienteException {

	

		return modelFactoryController.crearCliente(nombre, cedula, correo, contraseña);

	}

}
