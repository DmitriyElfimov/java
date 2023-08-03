package OOP.Homework004;

import java.util.Iterator;
import java.util.List;

public class BoxServiceIterator implements Iterable<Fruit> {
    private int counter;
    private final List<Fruit> fruits;

    public BoxServiceIterator(List<Fruit> fruits) {
        this.fruits = fruits;
        this.counter = 0;
    }


    public boolean hasNext() {
        return counter < fruits.size() - 1;
    }


    public Fruit next() {
        if (!hasNext()) {
            return null;
        }
        return null;
    }

    @Override
    public Iterator<Fruit> iterator() {
        return null;
    }
}
