package OOP.seminar4.bank;

public class Program {

    public static void main(String[] args) {
        Entity entity = new Entity("GeekBrains", "12222114");
        Person person = new Person("Байраковский С. А.", "1222344");
        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person, 30);
        DebetAccount<Entity> debetAccount1 = new DebetAccount<>(entity, 10000000);

        Transaction<Account> transaction = new Transaction<>(debetAccount1, creditAccount1, 120000);
        transaction.execute();
        transaction.execute();

    }

}
