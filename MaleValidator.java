package HomeWork;

public class MaleValidator {
    public static void checkMale(String male) {
        if (!male.equals("m") && !male.equals("f")) {
            throw new MaleException(male);
        }
    }
}
