package HomeWork;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateOfBirthValidator {

	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	String dateStr;
	public DateOfBirthValidator(String dateStr) {
		this.dateStr = dateStr;
	}

	public static void isValid(String dateStr) {
		try {
			LocalDate.parse(dateStr, FORMATTER);
		} catch (DateTimeParseException e) {
			throw new DataOfBirthException(dateStr);
		}
	}
}
