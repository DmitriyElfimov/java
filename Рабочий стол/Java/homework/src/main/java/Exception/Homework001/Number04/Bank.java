package Exception.Homework001.Number04;



import java.util.Collections;

import static Exception.Homework001.Number04.BankAccount.WithdrawalAccount;
import static Exception.Homework001.Number04.BankAccount.accountList;


public class Bank {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(1, "gb", 100000, "Thread GB");
        BankAccount account2 = new BankAccount(2, "google", 1000000, "Thread Google");
        BankAccount account3 = new BankAccount(3, "yandex", 500000, "Thread Yandex");
        BankAccount.accountList.add(account1);
        BankAccount.accountList.add(account2);
        BankAccount.accountList.add(account3);
        

        BankAccount.AddingAccount(1, 20000);
        WithdrawalAccount(2, 400000);
        System.out.println(BankAccount.accountList);
        Collections.addAll(accountList);
        for (BankAccount bankAccount : accountList)
            bankAccount.getThread().start();
        for (BankAccount bankAccount : accountList){
            try {
                bankAccount.getThread().join();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }


}
