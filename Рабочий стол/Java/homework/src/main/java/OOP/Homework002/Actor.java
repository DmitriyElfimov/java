package OOP.Homework002;

public abstract class Actor {

    protected int number;

    protected String name;
    protected Boolean isMakeOrder;
    protected Boolean isTakeOrder;
    abstract String getName();





    public Actor(Integer number, String name, Boolean isMakeOrder, Boolean isTakeOrder) {
        this.number = number;
        this.name = name;
        this.isMakeOrder = isMakeOrder;
        this.isTakeOrder = isTakeOrder;

    }


    public String getInfo() {
        return String.format("Покупатель #%d; Имя: %s; сделал заказ: %b; получил заказ: %b", this.number, this.name, this.isMakeOrder, this.isTakeOrder);}



}