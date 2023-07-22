package OOP.Homework002;

public abstract class Human extends Actor implements ActorBehaviour {
    public Human(Integer number, String name, Boolean isMakeOrder, Boolean isTakeOrder) {
        super(number, name, isMakeOrder, isTakeOrder);
    }

    @Override
    public void setMakeOrder(){

    }
    @Override
    public void setTakeOrder() {

    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }
}
