package HomeWork;

public class PhoneNumberValidator {
	public static final String PHONE_PATTERN = "^\\+?\\d{10,15}$";

	public static void isValid(String phoneNumber) {

		if (phoneNumber.matches(PHONE_PATTERN) || phoneNumber.length() < 4) {
			throw new NumberException(View.inputData[4] + "Номер написан не корректно");
		}

	}

}
