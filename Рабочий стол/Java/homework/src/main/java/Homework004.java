import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Homework004 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ArrayList<String> ma = new ArrayList<>();
        ArrayList<String> ms = new ArrayList<>();
        ArrayList<String> md = new ArrayList<>();
        ArrayList<Integer> mf = new ArrayList<>();
        ArrayList<Boolean> mz = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<String> maSort = new ArrayList<>();
        ArrayList<String> msSort = new ArrayList<>();
        ArrayList<String> mdSort = new ArrayList<>();
        ArrayList<Integer> mfSort = new ArrayList<>();
        ArrayList<Boolean> mzSort = new ArrayList<>();
        ArrayList<Integer> idSorts = new ArrayList<>();
        while (true) {
            System.out.println("Введите фамилию -> ");
            ma.add(scanner.nextLine());
            System.out.println("Введите имя -> ");
            ms.add(scanner.nextLine());
            System.out.println("Введите отчество -> ");
            md.add(scanner.nextLine());
            System.out.println("Введите возраст -> ");
            mf.add(Integer.valueOf(scanner.nextLine()));
            System.out.println("Введите пол -> ");
            mz.add(scanner.nextLine().toLowerCase().contains("ж"));
            id.add(mz.size() - 1);
            System.out.println("Продолжить ввод да/нет? -> ");
            String tmp = scanner.nextLine();
            if (tmp.toLowerCase().contains("нет")) break;
        }
        for (int i = 0; i < ma.size(); i++) {
            System.out.println(ma.get(i) + " " + ms.get(i).toUpperCase().charAt(0) + "." + md.get(i).toUpperCase().charAt(0) + "." + " " + mf.get(i) + " " + (mz.get(i) ? "Ж" : "М"));
        }

        System.out.println("Сортировать по возрасту да/нет? -> ");
        String tmp = scanner.nextLine();

        if (tmp.toLowerCase().contains("да")) {
            id.sort(new Comparator<Integer>() {
                @Override

                public int compare(Integer o1, Integer o2) {
                    return mf.get(o1) - mf.get(o2);
                }
            });
            for (int i = 0; i < id.size(); i++) {
                System.out.println(ma.get(id.get(i)) + " " + ms.get(id.get(i)).toUpperCase().charAt(0) + "." + md.get(id.get(i)).toUpperCase().charAt(0) + "." + " " + mf.get(id.get(i)) + " " + (mz.get(id.get(i)) ? "Ж" : "М"));
            }
        }

        System.out.println("Сортировать по возрасту и полу да/нет? -> ");
        String tmr = scanner.nextLine();
        if (tmr.toLowerCase().contains("да")) {
            id.sort(new Comparator<Integer>() {
                public int compare(Integer o1, Integer o2) {
                    return boolToInt(mz.get(o1)) - boolToInt(mz.get(o2));
                }

                public int boolToInt(boolean b) {
                    if (b)
                        return 0;
                    return 1;
                }

            });
            for (int i = 0; i < id.size(); i++) {

                maSort.add(ma.get(id.get(i)));
                msSort.add(ms.get(id.get(i)));
                mdSort.add(md.get(id.get(i)));
                mfSort.add(mf.get(id.get(i)));
                mzSort.add(mz.get(id.get(i)));
                idSorts.add(i);
//                System.out.println(maSort);
//                System.out.println(msSort);
//                System.out.println(mdSort);
//                System.out.println(mfSort);
//                System.out.println(mzSort);
//                System.out.println(idSorts);



            idSorts.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return mfSort.get(o1) - mfSort.get(o2);
                }
            });
            }
            for (int i = 0; i < id.size(); i++) {
                System.out.println(maSort.get(idSorts.get(i)) + " " + msSort.get(idSorts.get(i)).toUpperCase().charAt(0) + "." + mdSort.get(idSorts.get(i)).toUpperCase().charAt(0) + "." + " " + mfSort.get(idSorts.get(i)) + " " + (mzSort.get(idSorts.get(i)) ? "Ж" : "М"));
            }




    }

    }

}

