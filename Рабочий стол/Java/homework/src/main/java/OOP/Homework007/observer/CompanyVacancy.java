package OOP.Homework007.observer;

import java.util.ArrayList;
import java.util.List;

public class CompanyVacancy extends Company {

    public static List<Vacancy> vacancyList = new ArrayList<Vacancy>();

    private Company company;

    public CompanyVacancy(Company company, List<Vacancy> vacancyList) {
        super(company.jobAgency, company.getName(), company.getMaxSalary());

        this.vacancyList = vacancyList;
        this.company = company;
    }

    public List<Vacancy> getVacancyList() {
        return vacancyList;
    }

    public void setVacancyList(List<Vacancy> vacancyList) {
        this.vacancyList = vacancyList;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    @Override
    public String toString() {
        return "CompanyVacancy{" +
                "company=" + company.getName() +", vacancyList=" + vacancyList + '}';
    }

}
