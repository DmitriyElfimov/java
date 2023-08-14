package OOP.Homework007.observer;

public class Master implements Observer {

    private String name;
    int salary = 80000;
    public String profession;

    public Master(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    @Override
    public void receiveOffer(String nameCompany, String vacancyName, int maxSalary) {
        if (vacancyName.equals(profession)) {
            if (this.salary <= maxSalary) {
                System.out.printf("Master %s: Мне нужна эта работа! (company: %s; vacancy: %s; salary: %d)\n", name,
                        nameCompany, vacancyName, maxSalary);

            } else {
                System.out.printf("Master %s: Я найду работу получше! (company: %s; vacancy: %s; salary: %d)\n", name,
                        nameCompany, vacancyName, maxSalary);
            }
        }
    }
}
