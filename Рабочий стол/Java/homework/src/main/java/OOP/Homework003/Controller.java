package OOP.Homework003;
import java.util.List;
public class Controller extends Potok {
    private PotokService potokService;

    public Controller() {
        potokService = new PotokService();
    }

    public void sortPotoks(List<Potok> groups) {
        potokService.sortPotoks(groups);
    }
}
