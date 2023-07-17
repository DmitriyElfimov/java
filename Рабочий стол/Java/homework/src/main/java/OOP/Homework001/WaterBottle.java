package OOP.Homework001;

public class WaterBottle extends Products {

    public WaterBottle() {
        super(String.format("Бутылка с водой #%d", ++WaterBottle.number), WaterBottle.r.nextInt(1, 6)*100);
    }

    public String getInfo() {
        return String.format("<Товар>: %s Объемом: %d", this.name, this.volume);
    }




}
