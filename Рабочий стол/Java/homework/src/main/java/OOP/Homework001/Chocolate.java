package OOP.Homework001;

public class Chocolate extends Products {
    public Chocolate() {
        super(String.format("Шоколадка #%d", ++WaterBottle.number), WaterBottle.r.nextInt(1, 3)*100);
    }

    public String getInfo() {
        return String.format("<Товар>: %s Массой: %d", this.name, this.volume);
    }

}
