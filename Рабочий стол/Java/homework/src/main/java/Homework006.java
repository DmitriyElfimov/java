import java.util.*;

public class Homework006 {
    public static void main(String[] args) {
        MySet<Integer> myset = new MySet<>();
        System.out.println((myset.add(4165)));
        System.out.println((myset.add(4155565)));
        System.out.println((myset.add(null)));
        System.out.println((myset.add(4165)));
        System.out.println(myset.toString());
//        System.out.println((myset.remove(4165)));
//        System.out.println(myset.remove(null));
//        System.out.println(myset.remove(65456));
//        System.out.println(myset.toString());
        Iterator<Integer> iter = myset.iterator();
        while (iter.hasNext()){
            System.out.printf("%d ",iter.next());
        }
        System.out.println();
        System.out.println("Введите индекс объекта -> ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println(myset.gether(a));
    }

}
class MySet<T> {
    private HashMap<T, Object> map = new HashMap<>();

    private static final Object myo = new Object();

    public boolean add(T value) {
        return map.put(value, myo) == null;
    }

    public boolean remove(T value) {
        return map.remove(value) == myo;
    }

    public String toString() {
        return map.keySet().toString();
    }

    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }


    public T gether(Integer i) {
        ArrayList<T> myset = new ArrayList<T>();
        for (T item : map.keySet()) {
            myset.add(item);
        }
        if (myset.size()-1 >= i) return myset.get(i);
        return null;

    }





}
