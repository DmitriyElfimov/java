package OOP.Homework007.observer;


public class Booker implements Observer {
    private String name;

    int salary = 50000;
    private String profession;

    public Booker(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }
    public Booker (String name){
        this.name = name;
    }




    public void receiveOffer(String nameCompany, String vacancyName, int maxSalary) {
        if (vacancyName.equals(profession)) {
            if (this.salary <= maxSalary) {
                System.out.printf("Booker %s: Мне нужна эта работа! (company: %s; vacancy: %s; salary: %d)\n", name,
                        nameCompany, vacancyName, maxSalary);

            } else {
                System.out.printf("Booker %s: Я найду работу получше! (company: %s; vacancy: %s; salary: %d)\n", name,
                        nameCompany, vacancyName, maxSalary);
            }
        }

    }
}
