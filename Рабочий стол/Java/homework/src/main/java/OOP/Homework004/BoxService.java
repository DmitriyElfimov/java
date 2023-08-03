package OOP.Homework004;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BoxService {
    private static List<Fruit> fruits;
    private static int size;

    private double weightBox;
    private String getName (BoxService fruits){
        return BoxService.getFruits().get(0).getName();
    }


    public double getWeightBox() {
        weightBox = fruits.size()*getFruits().get(0).getWeight();
        return weightBox;
    }

    public BoxService (List<Fruit> fruits){
        BoxService.fruits = fruits;
    }
    public BoxService (){
        fruits = new ArrayList<>();
    }
    public static List<Fruit> getFruits(){
        return fruits;
    }
    public Fruit create (Fruit fruit) {
        if (fruits.size()>0){
            if (getFruits().get(0).getName().equalsIgnoreCase(fruit.getName())) {
                fruits.add(fruit);
            } else System.out.println("Такие фрукты нельзя смешивать!");

        }
        else {
            fruits.add(fruit);
        }
        return fruit;
    }
    public Fruit delete (Fruit fruit) {
        if(!fruits.isEmpty()){
            for (int i = 0; i<=fruits.size(); i++){
                fruits.remove(i);
            }
        }
        else System.out.println("Коробка пуста!");
        return fruit;
    }

    @Override
    public String toString() {
        if(!fruits.isEmpty()) {
            return "Коробка {" +
                    fruits + "/ Вес коробки: " + getWeightBox() +
                    '}';
        }
        else System.out.println("Коробка пустая");
        return null;
    }

//    public static BoxService overflow(BoxService fruits1, BoxService fruits2){
//        if (fruits1.getName(fruits1).equalsIgnoreCase(fruits2.getName(fruits2))){
//            Iterator<Fruit> iterator = fruits2.iterator(fruits2);
//            while (iterator.hasNext()){
//                Fruit fruit = iterator.next();
//                fruits1.create(fruit);
//
//            }
//        }
//        else System.out.println("фрукты нельзя смешивать");
//        return fruits1;
//    }

    private Iterator<Fruit> iterator(BoxService fruits) {
        return getFruits().iterator();
    }

    public static int getSize(BoxService fruits) {
        return getFruits().size();
    }

    public static void compare(BoxService fruits1, BoxService fruits2){
        System.out.println(fruits1.weightBox == fruits2.weightBox);
    }


}
