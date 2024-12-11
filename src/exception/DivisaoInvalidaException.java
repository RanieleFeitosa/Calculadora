package exception;

public class DivisaoInvalidaException extends RuntimeException {
	

	private static final long serialVersionUID = 1L;

	public DivisaoInvalidaException() {
		super("\nNão é possível dividir por zero. Tente novamente usando outro denominador. \n");
	}

	
}