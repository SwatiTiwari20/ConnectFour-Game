package exceptions;

@SuppressWarnings("serial")
public class InvalidColumnException extends ConnectFourException {

	public InvalidColumnException() {
	}

	public InvalidColumnException(String message) {
		super(message);
	}

}
