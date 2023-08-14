package OOP.Homework007.observer;

import java.util.ArrayList;
import java.util.List;

public class Vacancy {
    public String vacancyName;
    public int maxSalary;



    public Vacancy(String vacancyName, int maxSalary) {
        this.maxSalary = maxSalary;
        this.vacancyName = vacancyName;
    }





    @Override
    public String toString() {
        return "{Name= " + vacancyName + ", Salary= " + maxSalary + "}";
    }
}
