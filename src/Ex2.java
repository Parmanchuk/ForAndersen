import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        String line;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");

        while ((line = scanner.nextLine()).isBlank()) {
            System.out.println("Вы не ввели ничего или только пробелы");
            System.out.print("Введите имя еще раз: ");
        }
        if ("Вячеслав".equals(line)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        scanner.close();
    }
}
