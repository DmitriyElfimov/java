package OOP.Homework007.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Агенство занимается поиском сотрудников
 */
public class JobAgency implements Publisher {


    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(CompanyVacancy companyVacancy) {
        for (Observer observer : observers) {
            for (int i = 0; i< companyVacancy.getVacancyList().size(); i++) {
                observer.receiveOffer(companyVacancy.getName(), companyVacancy.getVacancyList().listIterator(i).next().vacancyName, companyVacancy.getVacancyList().listIterator(i).next().maxSalary);
            }
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
