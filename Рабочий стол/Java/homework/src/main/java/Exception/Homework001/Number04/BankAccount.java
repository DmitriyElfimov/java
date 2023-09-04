package Exception.Homework001.Number04;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class BankAccount {
    private int number;
    private String name;
    private double summa;
    private Thread thread;


    public BankAccount(int number, String name, double summa, String threadName) {
        this.number = number;
        this.name = name;
        this.summa = summa;
        thread = new Thread(threadName);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getSumma() {
        return summa;
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", summa=" + summa +
                '}';
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSumma(double summa) {
        this.summa = summa;
    }
    static List<BankAccount> accountList = new CopyOnWriteArrayList<BankAccount>();

    public static void AddingAccount(int numb, double sum) {

        for (int i = 0; i < accountList.size(); i++) {
            if (numb == accountList.get(i).getNumber()) {
                try {

                    if (sum + accountList.get(i).getSumma() > 1000000) {
                        throw new MaxBalanceExceededException("Превышен допустимый баланс счета");
                    }
                    else accountList.get(i).setSumma(sum + accountList.get(i).getSumma());
                } catch (MaxBalanceExceededException exception) {
                    System.out.println("MaxBalanceExceededException caught: " + exception.getMessage());
                }
            }


        }
    }
    public static void WithdrawalAccount (int numb, double sum){
        for (int i = 0; i<accountList.size(); i++){
            if (numb == accountList.get(i).number){
                try {

                    if (accountList.get(i).getSumma() < sum){
                        throw new InsufficientFundsException("На счете не достаточно средств");
                    }
                    else accountList.get(i).setSumma(accountList.get(i).getSumma() - sum);
                }
                catch (InsufficientFundsException exception){
                    System.out.println("InsufficientFundsException caught: " + exception.getMessage());
                }
            }
        }

    }

}
