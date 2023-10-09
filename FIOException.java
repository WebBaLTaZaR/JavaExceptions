package HomeWork;

public class FIOException extends RuntimeException {
	public FIOException(){
		super("напишите правильно ваше ФИО");
	}
	public FIOException(String fio){
		super(fio + " написано не верно!");
	}
}
