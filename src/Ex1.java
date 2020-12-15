import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        boolean flag = true;
        Double d = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        while (flag) {
            try {
                d = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели \"НЕ ЧИСЛО\" или введен неправильный разделитель цифр. Используйте \".\" как разделитель");
                System.out.print("Введите число еще раз: ");
                continue;
            }
            if (d > Double.MAX_VALUE || d < (-Double.MAX_VALUE)) {
                System.out.println("Вводимое число должно быть в пределах +-1.7Е308");
                System.out.print("Введите корректное число: ");
                continue;
            }
            flag = false;
        }

        if (d > 7) {
            System.out.println("Привет");
        }
        scanner.close();
    }
}
