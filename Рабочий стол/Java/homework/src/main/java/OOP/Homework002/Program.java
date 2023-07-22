package OOP.Homework002;

import java.util.Iterator;

import static OOP.Homework002.Market.actors;


public class Program {
    public static void main(String[] args) {


        Actor actor1 = new Actor(1,"Anton", false, false) {
            @Override
            String getName() {
                return null;
            }
        };
        Actor actor2 = new Actor(2,"Vlad", false, false) {
            @Override
            String getName() {
                return null;
            }
        };
        Actor actor3 = new Actor(3,"Anna", false, false) {
            @Override
            String getName() {
                return null;
            }
        };
        Actor actor4 = new Actor(4,"Vera", false, false){
            String getName(){
                return null;
            }
        };

        Market.takeInQueue(actor1);
        Market.takeInQueue(actor2);
        Market.takeInQueue(actor3);

        Iterator<Actor> iterator = actors.iterator();
        while (iterator.hasNext()){
            Actor actor = iterator.next();
            System.out.println(actor.getInfo());
        }
        Market.takeOrders(1);
        Market.takeOrders(3);

        Market.giveOrders(1);

        Market.releaseFromQueue(2);
        Market.releaseFromQueue(3);

        Market.acceptToMarket(actor4);

        Market.releaseFromMarket(actors);


        iterator = actors.iterator();
        while (iterator.hasNext()){
            Actor actor = iterator.next();
            System.out.println(actor.getInfo());
        }

    }
}
