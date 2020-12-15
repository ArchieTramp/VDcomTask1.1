package VDcom;

import java.util.Scanner;


/**
 * @author Artur Gilyazov
 * задание 1 для VDcom
 * Last Way - ternary operator
 *
 * 3 способ - реализация через тернарный оператор, пришел в голову самым последним,
 * но выглядит самым изысканным
 */

public class task1way2 {
    public static void main(String[] args) {
        System.out.println("проверка тернатрного оператора, введи число");

        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();

        for (int i = 1; i <= numb; i++) {
            String j;

            j = ((i % 3) + (i % 5) == 0) ? "FooBar" : (
                     ((i % 3 == 0)) ? "Foo" : (
                             ((i % 5 == 0)) ? "Bar" :
                                    String.valueOf(i)));

           System.out.println(j);
        }
    }
}
