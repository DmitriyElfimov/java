package OOP.Homework004;


public class Programm {

    public static void main(String[] args) {
        Fruit fruit1 = new Apple("apple", 1.0);
        Fruit fruit2 = new Orange("orange", 1.5);
        Fruit fruit3 = new Apple("apple", 1.0);
        Fruit fruit4 = new Orange("orange", 1.5);
        Fruit fruit5 = new Apple("apple", 1.0);
        Fruit fruit6 = new Orange("orange", 1.5);
        Fruit fruit7 = new Apple("apple", 1.0);
        Fruit fruit8 = new Orange("orange", 1.5);
        Fruit fruit9 = new Apple("apple", 1.0);
        Fruit fruit10 = new Orange("orange", 1.5);
        Fruit fruit11 = new Apple("apple", 1.0);
        Fruit fruit12 = new Orange("orange", 1.5);

        BoxService fruits1 = new BoxService();
        fruits1.create(fruit1);
        fruits1.create(fruit3);
        fruits1.create(fruit5);
        System.out.println(fruits1);
        BoxService fruits2 = new BoxService();
        fruits2.create(fruit4);
        fruits2.create(fruit6);
//        fruits2.create(fruit2);
        System.out.println(fruits2);
        BoxService.compare(fruits1, fruits2);
        BoxService fruits3 = new BoxService();
        fruits3.create(fruit7);
        fruits3.create(fruit9);
        fruits3.create(fruit11);
        System.out.println(fruits3);
//        BoxService.overflow(fruits1, fruits3);
//        System.out.println(fruits1);
//        System.out.println(fruits3);

    }
}
