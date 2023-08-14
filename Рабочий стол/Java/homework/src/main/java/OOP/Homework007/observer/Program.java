package OOP.Homework007.observer;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Vacancy streetCleaner = new Vacancy("StreetCleaner", 20000);
        Vacancy cheifBooker = new Vacancy("CheifBooker", 90000);
        Vacancy developer = new Vacancy("Developer", 150000);
        Company google = new Company(jobAgency, "Google", 120000);
        Company yandex = new Company(jobAgency, "Yandex", 95000);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 90000);


        CompanyVacancy.vacancyList.add(streetCleaner);
        CompanyVacancy.vacancyList.add(cheifBooker);
        CompanyVacancy.vacancyList.add(developer);



        CompanyVacancy googles = new CompanyVacancy(google, CompanyVacancy.vacancyList);

        Student pertov = new Student("Petrov", "null");
        Master master = new Master("Ivanov", "Developer");
        Cleaner sidorov = new Cleaner("Sidorov", "StreetCleaner");
        Booker vlasov = new Booker("Vlasov", "CheifBooker");

        jobAgency.registerObserver(pertov);
        jobAgency.registerObserver(master);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(vlasov);

        for (int i = 0; i < 1; i++){
            google.needEmployee(googles);
//            yandex.needEmployee();
//            geekBrains.needEmployee();
        }

        System.out.println(googles);


    }

}
