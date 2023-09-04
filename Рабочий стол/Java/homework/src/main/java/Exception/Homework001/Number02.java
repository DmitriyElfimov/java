package Exception.Homework001;

import java.util.Scanner;

public class Number02 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scanner01 = new Scanner(System.in);
        int numb01 = scanner01.nextInt();
        System.out.println("Введите второе число: ");
        Scanner scanner02 = new Scanner(System.in);
        int numb02 = scanner02.nextInt();
        try {
            if (numb02 == 0){
                throw new DivisionByZeroException ("Деление на ноль недопустимо");
            }
            System.out.println(numb01 +" / " + numb02 + " = " + numb01/numb02);
        }
        catch (DivisionByZeroException exception){
            System.out.println("DivisionByZeroException caught: " + exception.getMessage());

        }
    }
}
