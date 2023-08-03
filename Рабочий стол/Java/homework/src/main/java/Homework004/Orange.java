package Homework004;

public class Orange extends Fruct{
    Double weight = 1.5;
    String name = "Orange";
    public Orange (){
        super();

    }

    @Override
    public String toString() {
        return String.format("Фрукт: %s, #%d, весом: %s", name, getNo(), weight);
    }
}
