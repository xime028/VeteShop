package exepciones;

public class ProductoException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public ProductoException(String mensaje){
		super("Problema: "+mensaje);
	}
}
