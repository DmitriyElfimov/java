package OOP.seminar4;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {


        Employee employee1 = new Employee("NAME");
        Object employee2 = new Employee("NAME");
        //String emp = (String)employee2;

        ArrayList arrayList = new ArrayList();
        arrayList.add(12);
        arrayList.add("Hello!");
        arrayList.add(false);
        arrayList.add(null);
        arrayList.add(new Employee("NAME"));

        for (Object element : arrayList){
            if (element instanceof Employee){
                System.out.println(((Employee)element).getName());
            }
        }

        MyArrayList<Employee> myArrayList = new MyArrayList<>(new Employee[100]);
        System.out.println("Кол-во элементов: " + myArrayList.size());
        myArrayList.add(new Employee("NAME"));
        myArrayList.add(new Employee("NAME"));
        System.out.println("Кол-во элементов: " + myArrayList.size());

    }

}

class MyArrayList<T>{

    private static final int INITIAL_CAPACITY = 16;
    private T[] array;
    private int lastIndex = -1;

    public MyArrayList(T[] array){
        this.array = array;
    }

    public int size(){
        return lastIndex + 1;
    }

    public void add(T e){
        array[++lastIndex] = e;
    }

    /*public MyArrayList(){
        array = new int[INITIAL_CAPACITY];
    }

    public MyArrayList(int capacity){
        array = new int[capacity];
    }*/


}
















