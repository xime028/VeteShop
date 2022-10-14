package exepciones;

public class HospitalizacionException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public HospitalizacionException(String mensaje){
		super("Problema: "+mensaje);
	}
}
