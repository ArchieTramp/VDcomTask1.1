package VDcom;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * На вход приложение получает целое число больше 0 (n), далее в консоль выводится
 * следующее, все числа от 1 до n, при этом:
 * ● Если число кратно 3, выводится Foo;
 * ● Если число кратно 5, выводится Bar;
 * ● Если число кратно и 3, и 5, выводится FooBar;
 * ● Если число не кратно 3 или 5, выводится само число.
 * Необходимо предоставить минимум три разных решения, используя разные подходы
 * (минимум ветвлений, без циклов и т.п.).
 * <p>
 * Start way - classic principles
 * <p>
 * 1 способ - скажем так стандартная математика, со стандартными методами
 * в 1 способе показал отработку неверного ввода, далее ею пренебрегаю
 */

public class task1way0 {
    public static void main(String[] args) throws InputMismatchException {

        System.out.println("Введите число");

        try {

            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            for (int i = 1; i <= number; i++) {
                if ((i % 3) + (i % 5) == 0)
                    System.out.println("FooBar");
                else if (i % 5 == 0)
                    System.out.println("Bar");
                else if (i % 3 == 0)
                    System.out.println("Foo");
                else System.out.println(i);
            }
        } catch (InputMismatchException e) {
            System.out.println("ошибка ввода");
        }
    }
}
