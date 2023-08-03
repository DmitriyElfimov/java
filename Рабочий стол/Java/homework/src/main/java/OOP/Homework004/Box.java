package OOP.Homework004;

import java.util.List;

public class Box <T extends Fruit> {
    private List<Fruit> fruits;

    public Box(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        return "Box{" + fruits +
                '}';
    }



}
