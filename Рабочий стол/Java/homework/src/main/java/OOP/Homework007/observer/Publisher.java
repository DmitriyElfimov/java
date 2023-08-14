package OOP.Homework007.observer;


/**
 * Интерфейс рассылки вакансий.
 *
 */
public interface Publisher {

    void sendOffer(CompanyVacancy companyVacancy);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);


}
