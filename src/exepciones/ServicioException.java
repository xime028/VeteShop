package exepciones;

public class ServicioException extends Exception{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public ServicioException(String mensaje){
		super("Problema: "+mensaje);
	}
}
