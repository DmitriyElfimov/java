package OOP.seminar4.bank;

/**
 * Юридическое лицо
 */
public class Entity extends BaseEntity implements PersonalData {

    private final String name;
    private final String inn;

    public String getName() {
        return name;
    }

    public String getInn() {
        return inn;
    }

    public Entity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    @Override
    public String getINN() {
        return null;
    }

    @Override
    public String toString() {
        return String.format("%s [%s]", name, inn);
    }
}

abstract class  BaseEntity{

}
