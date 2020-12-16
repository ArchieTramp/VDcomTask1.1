package VDcom;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Artur Gilyazov
 * задание 1 для VDcom
 *
 * 2 способ - реализация через классическую рекурсию.
 * Нелогичное действие, перегружающее память, но работает.
 */

public class task1way1 {

    static ArrayList<String> list = new ArrayList<>();


    public static void main(String[] args) {

        task1way1 start = new task1way1();

        System.out.println("start");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        list = (ArrayList<String>) start.recurMethod(number);
        reverse();

    }

    public Serializable recurMethod(int n) {
        int stopper = 0;
        if (n <= 0) {
            return stopper;
        }

        if ((n % 3) + (n % 5) == 0)
            list.add("FooBar");
        else if (n % 5 == 0)
            list.add("Bar");
        else if (n % 3 == 0)
            list.add("Foo");
        else list.add(String.valueOf(n));
        recurMethod(n - 1);

        return list;
    }

    public static void reverse() {
        String temp;
        String a[] = list.toArray(new String[0]);

        int n = a.length;

        for (int i = 0; i < n / 2; i++) {
            temp = String.valueOf(a[n - i - 1]);
            a[n - i - 1] = a[i];
            a[i] = String.valueOf(temp);
        }
        for (String s : a) {
            System.out.println(s);

        }


    }
}

