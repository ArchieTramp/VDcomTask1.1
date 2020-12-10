package VDcom;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1way0 {
    public static void main(String[] args) throws InputMismatchException {

        System.out.println("Введите число");
        // 1 способ - скажем так стандартная математика, со стандартными методами
        // в 1 способе показал отработку неверного ввода, далее ею пренебрегаю

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
