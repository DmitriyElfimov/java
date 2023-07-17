package OOP.Homework001;

public class HotDrink extends Products {
    private int temperaturs;
    public HotDrink() {
        super(String.format("Горячий напиток #%d", ++HotDrink.number), HotDrink.r.nextInt(1, 5)*100);
        this.temperaturs = HotDrink.r.nextInt(60, 100);
    }

    public String getInfo() {
        return String.format("<Товар>: %s Объемом: %d Температура: %d", this.name, this.volume, this.temperaturs);
    }

}
