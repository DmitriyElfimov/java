import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.*;

public class Homework005 {
    public static void main(String[] args) {
        HashMap<Long, String> myPhoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер телефона -> ");
            Long number = Long.valueOf(scanner.nextLine());
            System.out.println("Введите Фамилию Имя Отчество -> ");
            String name = scanner.nextLine();
            myPhoneBook.put(number, name);
            System.out.println("Продолжить ввод да/нет? -> ");
            String tmp = scanner.nextLine();
            if (tmp.toLowerCase().contains("нет")) break;
        }
        System.out.println(myPhoneBook);

        ArrayList<String> names = new ArrayList<>(myPhoneBook.values());

        myPhoneBook.entrySet().stream().sorted(Entry.comparingByValue()).forEach(System.out::println);
        HashMap<String, Integer> noDupNames = new HashMap<>();

        for (int i = 0; i < names.size(); i++) {
            noDupNames.put(names.get(i), 0);
        }
        ArrayList<String> noDupName = new ArrayList<>(noDupNames.keySet());


        for (int i = 0; i < noDupName.size(); i++){
            for (int j = 0; j < names.size(); j++){
                if (Objects.equals(noDupName.get(i), names.get(j))){
                    noDupNames.put(noDupName.get(i), noDupNames.get(noDupName.get(i))+1);
                }
            }
        }

        noDupNames.entrySet()
                .stream()
                .sorted(Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);

        Object[] Ich = new Object[noDupNames.size()][noDupNames.size()];
        Ich = (Object[]) Arrays.stream(noDupNames.keySet().toArray()).sorted().toArray();
        for (int i = 0; i < noDupNames.size(); i++){

            System.out.println(Ich[i] + " " + getKeys(myPhoneBook, Ich[i]));

        }





    }
    public static <T, E> Set <T> getKeys(HashMap<Long, String> map, Object value){
        Set<T> keys = new HashSet<>();
        for (Entry<Long, String> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                T key = (T) entry.getKey();
                keys.add(key);
            }
        }
        return keys;
    }
}
