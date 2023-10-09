package HomeWork;

public class CurrentFIOValidator {

    public static void validateFirstThreeItems() {
        for (int i = 0; i < 3 && i < View.inputData.length; i++) {
            if (!View.inputData[i].matches("^[a-zA-Z\\s]+$") ||
                    View.inputData[i].length() < 2 ||
                    View.inputData[i].length() > 10) {
                throw new FIOException(View.inputData[i] + ": Проверьте длину и правильность ввода.");
            }
        }
    }
}
