import java.util.*;

import static java.util.Collections.*;

public class Homework003 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Введите размер списка: ");
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner.nextInt();
        for (int i = 0; i < sizeArray; i++)
            list.add(new Random().nextInt(100));
        System.out.println(list);

        ArrayList<Integer> listNotEven = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0)
                listNotEven.add(list.get(i));
        }
        System.out.println(listNotEven);

        int minim = min(list);
        System.out.println("Минимальное значение " + minim);

        int maxim = max(list);
        System.out.println("Максимальное значение " + maxim);

        double medium;
        double summaList = 0;
        for (int i = 0; i < list.size(); i++) {
            summaList += list.get(i);
        }
        medium = summaList / list.size();
        System.out.println("Среднее значение = " + medium);
    }

}
