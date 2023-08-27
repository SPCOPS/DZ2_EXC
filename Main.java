import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double user_input = getDoubleInput();
        System.out.println("Вы ввели: " + user_input);
    }

    public static double getDoubleInput() {
        Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                value = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Пожалуйста, введите корректное дробное число.");
                scanner.nextLine();
            }
        }
        return value;
    }
}
