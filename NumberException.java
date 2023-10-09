package HomeWork;

public class NumberException extends RuntimeException {
	public NumberException() {
		super("Номер телефона введён не правильно");
	}

	public NumberException(String numberPhone) {
		super("Номер телефона " + numberPhone + " введён не правильно");
	}
}
