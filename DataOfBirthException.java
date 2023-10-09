package HomeWork;

public class DataOfBirthException extends RuntimeException {
	

	public DataOfBirthException(){
		super("Формат даты написан не верно");
	}
	public DataOfBirthException(String birth){
		super("Формат даты написан не верно: " + birth + " необходим формат dd.MM.yyyy");
	}
}
