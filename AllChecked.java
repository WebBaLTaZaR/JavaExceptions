package HomeWork;

public class AllChecked {
	public static void CallingAllChecks(){
		DateOfBirthValidator.isValid(View.inputData[3]);
		CurrentFIOValidator.validateFirstThreeItems();
		PhoneNumberValidator.isValid(View.inputData[4]);
		MaleValidator.checkMale(View.inputData[5]);
	}
}
