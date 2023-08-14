package OOP.Homework007.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Company {

    private Random random = new Random();

    Publisher jobAgency;

    private String name;

    private int maxSalary;

    public Company(Publisher jobAgency, String name, int maxSalary) {
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    public String getName() {
        return name;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void needEmployee(CompanyVacancy companyVacancy){

                jobAgency.sendOffer(companyVacancy);
    }

}
