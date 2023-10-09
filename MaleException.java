package HomeWork;

public class MaleException extends RuntimeException {
	public MaleException() {
		super("Пол должен быть написан буквами, 'm' или 'f'");
	}

	public MaleException(String male) {
		super("Пол должен быть написан буквами, 'm' или 'f', а не: " + male);
	}
}
