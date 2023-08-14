package OOP.Homework007.observer;

public class Student implements Observer {

    private String name;
    int salary = 2000;
    public String profession;

    public Student(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    @Override
    public void receiveOffer(String nameCompany, String vacancyName, int maxSalary) {

            if (this.salary <= maxSalary) {
                System.out.printf("Student %s: Мне нужна эта работа! (company: %s; vacancy: %s; salary: %d)\n", name,
                        nameCompany, vacancyName, maxSalary);

            } else {
                System.out.printf("Student %s: Я найду работу получше! (company: %s; vacancy: %s; salary: %d)\n", name,
                        nameCompany, vacancyName, maxSalary);
            }


    }
}
