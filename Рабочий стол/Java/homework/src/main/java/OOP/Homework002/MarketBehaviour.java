package OOP.Homework002;

import java.util.List;

public interface MarketBehaviour {
    static void acceptToMarket(Actor actor) {return ;};
    static void releaseFromMarket(List<Actor> actors) {return;};
    void update();
}
