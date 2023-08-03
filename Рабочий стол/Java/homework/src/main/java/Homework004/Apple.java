package Homework004;

public class Apple extends Fruct{
    Double weight = 1.0;
    String name = "Apple";
    public Apple (){
        super();

    }

    @Override
    public String toString() {
        return String.format("Фрукт: %s, #%d, весом: %s", name, getNo(), weight);
    }
}
