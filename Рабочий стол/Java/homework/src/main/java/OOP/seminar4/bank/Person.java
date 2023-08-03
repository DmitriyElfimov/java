package OOP.seminar4.bank;

/**
 * Физическое лицо
 */
public class Person extends BasePerson implements PersonalData{

    private final String fio;
    private final String inn;

    public String getFio() {
        return fio;
    }

    public String getInn() {
        return inn;
    }

    public Person(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }

    @Override
    public String toString() {
        return String.format("%s [%s]", fio, inn);
    }

    @Override
    public String getINN() {
        return inn;
    }
}

abstract class  BasePerson {
}