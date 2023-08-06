package OOP.Homework006.isp;

public class CustomPaymentService extends PaymentService implements CreditCardPayable, PhonePayable {

    @Override
    public void payCreditCard(int amount) {
        System.out.println("CustomPaymentService оплата через CreditCard");
    }

    @Override
    public void payPhoneNumber(int amount) {
        System.out.println("CustomPaymentService оплата через PhoneNumber");
    }
}
