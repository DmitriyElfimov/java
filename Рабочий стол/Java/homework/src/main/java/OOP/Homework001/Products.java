package OOP.Homework001;

import java.util.Random;

public class Products {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int volume;


    static {
        Products.number = 0;
        Products.r = new Random();
    }

    public Products(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    public Products(){
        this(String.format("Товар #%d", ++Products.number),
                Products.r.nextInt(1,5)*100);
    }

    public String getInfo() {
        return String.format("Name: %s  Volume: %d", this.name, this.volume);}



}