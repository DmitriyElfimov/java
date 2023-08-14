package OOP.Homework007.observer;



public class Cleaner implements Observer{
    private String name;

    int salary = 30000;
    private String profession;

    public Cleaner(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }
    public Cleaner (String name){
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, String vacancyName, int maxSalary) {
        if (vacancyName.equals(profession)) {
            if (this.salary <= maxSalary) {
                System.out.printf("Cleaner %s: Мне нужна эта работа! (company: %s; vacancy: %s; salary: %d)\n", name,
                        nameCompany, vacancyName, maxSalary);

            } else {
                System.out.printf("Cleaner %s: Я найду работу получше! (company: %s; vacancy: %s; salary: %d)\n", name,
                        nameCompany, vacancyName, maxSalary);
            }
        }

    }



}
