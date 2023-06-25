import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Homework001 {

    public static void main(String[] args) {
        int i = new Random().nextInt(2001);
        System.out.println(i);

        homework2();

        System.out.println("Введите число i: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите число n: ");
        Scanner scanner1 = new Scanner(System.in);
        int n = scanner1.nextInt();

        System.out.println(findAvailableDivider(a,n));

        System.out.println("Введите число i: ");
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner.nextInt();
        System.out.println("Введите число n: ");
        Scanner scanner3 = new Scanner(System.in);
        int y = scanner1.nextInt();

        System.out.println(findAvailableNoDivider(b,y));

    }
    static void homework2() {
        int i = new Random().nextInt();
        System.out.println(i);
        int n = (Integer.toBinaryString(i)).length();
        System.out.println(n);
    }
    static List<Integer> findAvailableDivider (int number, int divider) {

        List<Integer> m1 = new ArrayList<>();
        for (int x = number; x <= Short.MAX_VALUE; x++) {
            if (x % divider == 0) {
                m1.add(x);
            }

        }
        return m1;

    }

    static List<Integer> findAvailableNoDivider (int number, int divider) {

        List<Integer> m2 = new ArrayList<>();
        for (int x = Short.MIN_VALUE; x <= number; x++) {
            if (x % divider != 0) {
                m2.add(x);
            }

        }
        return m2;

    }
}