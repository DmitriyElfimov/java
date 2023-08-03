package Homework004;

import java.awt.*;


public class Box <T extends Fruct>{
    private List fructs;
    public Box (List fructs){
        this.fructs = fructs;
    }

    public List getFructs() {
        return fructs;
    }

    public void setFructs(List fructs) {
        this.fructs = fructs;
    }

    @Override
    public String toString() {
        return "Коробка{" +
                "fructs=" + fructs +
                '}';
    }

    protected double size() {
        return size();
    }
}
