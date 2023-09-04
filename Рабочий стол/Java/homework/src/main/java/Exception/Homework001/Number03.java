package Exception.Homework001;

import java.util.Scanner;

public class Number03 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scanner01 = new Scanner(System.in);
        int number01 = scanner01.nextInt();
        System.out.println("Введите второе число: ");
        Scanner scanner02 = new Scanner(System.in);
        int number02 = scanner02.nextInt();
        System.out.println("Введите третье число: ");
        Scanner scanner03 = new Scanner(System.in);
        int number03 = scanner02.nextInt();
        try {
            if (number01 > 100){
                throw new NumberOutOfRangeException ("Первое число вне допустимого диапазона");
            }
            if (number02 < 0){
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            }
            if (number01+number02 < 10){
                throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            }
            if (number03 == 0){
                    throw new DivisionByZeroException ("Деление на ноль недопустимо");
                }
            System.out.println("Проверка пройдена успешно");
        }
        catch (DivisionByZeroException exception){
            System.out.println("DivisionByZeroException caught: " + exception.getMessage());

        }
        catch (NumberOutOfRangeException exception){
            System.out.println("NumberOutOfRangeException caught: " + exception.getMessage());
        }
        catch (NumberSumException exception){
            System.out.println("NumberSumException caught: " + exception.getMessage());
        }
    }
}
