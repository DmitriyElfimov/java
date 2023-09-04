package Exception.Homework001;

import java.util.Scanner;

public class Number01 {

    public static void main(String[] args) {
        System.out.println("Введите положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        try {
            if (numb <= 0){
                throw new InvalidNumberException("Число не положительное");
            }
            System.out.println("Число корректно");
        }
        catch (InvalidNumberException exception){
            System.out.println("InvalidNumberException caught: " + exception.getMessage());

        }
    }
}
