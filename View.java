package HomeWork;

import java.util.Scanner;

public class View {
    public static String[] inputData;

    public static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(
                    "Пожалуйста, введите Фамилию, Имя, Отчество, дату рождения, номер телефона и пол через пробел:");
            String input = scanner.nextLine();
            inputData = input.split(" ");
            try {
                DataValidator.validate(inputData);
            } catch (DataException e) {
                switch (e.getErrorCode()) {
                    case DataException.LESS_DATA_ERROR:
                        System.out.println("Вы ввели меньше данных, чем требуется.");
                        break;
                    case DataException.MORE_DATA_ERROR:
                        System.out.println("Вы ввели больше данных, чем требуется.");
                        break;
                }

            }
        }

    }

}
