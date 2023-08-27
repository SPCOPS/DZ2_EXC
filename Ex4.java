import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        try {
            String input = getUserInput();
            System.out.println("Вы ввели: " + input);
        } catch (EmptyInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String getUserInput() throws EmptyInputException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        
        if (input.isEmpty()) {
            throw new EmptyInputException("Пустые строки вводить нельзя.");
        }
        
        return input;
    }
}

class EmptyInputException extends Exception {
    public EmptyInputException(String message) {
        super(message);
    }
}
