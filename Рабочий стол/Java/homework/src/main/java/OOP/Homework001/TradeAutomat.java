package OOP.Homework001;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TradeAutomat {

    public static List<Products> initProducts() {
        int teamCount = 10;
        Random rand = new Random();

        List<Products> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            int val = rand.nextInt(4);
            switch (val) {
                case 0:
                    teams.add(new WaterBottle());
                    break;
                case 1:
                    teams.add(new Chocolate());
                    break;
                default:
                    teams.add(new HotDrink());
                    break;
            }

            System.out.println(teams.get(i).getInfo());
        }

        return teams;
    }

    public static void getProducts() {
    }
}
