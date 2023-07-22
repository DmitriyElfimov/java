package OOP.Homework002;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{
    static List<Actor> actors = new ArrayList<>();
    public static void takeInQueue(Actor actor){
        actors.add(actor);
    }



    public List<Actor> getActors() {
        return actors;
    }

    public static void takeOrders(int number) {
        Iterator<Actor> iterator = actors.iterator();
        Actor actor = null;
        while (iterator.hasNext()) {
            actor = iterator.next();
            if (actor.number == number) {
                actor.isMakeOrder = true;
                actor.isTakeOrder = false;

            }

        }

    }

    public static void giveOrders(int number) {
        Iterator<Actor> iterator = actors.iterator();
        Actor actor = null;
        while (iterator.hasNext()) {
            actor = iterator.next();
            if (actor.number == number) {
                actor.isTakeOrder = true;

            }

        }

    }

    public static void releaseFromQueue(int number) {
        Iterator<Actor> iterator = actors.iterator();
        Actor actor = null;
        while (iterator.hasNext()) {
            actor = iterator.next();
            if (actor.number == number)
                if (actor.isMakeOrder == false) {
                iterator.remove();}
                else System.out.println("Покупатель сделал заказ");

        }

    }

    public static void acceptToMarket(Actor actor) {
         takeInQueue(actor);


        }


    public static void releaseFromMarket(List<Actor> actors) {
        Iterator<Actor> iterator = actors.iterator();
        Actor actor = null;
        while (iterator.hasNext()) {
            actor = iterator.next();
            if (actor.isMakeOrder == true && actor.isTakeOrder == true) {
                iterator.remove();
            }
        }

    }

    public void update() {

    }
}
