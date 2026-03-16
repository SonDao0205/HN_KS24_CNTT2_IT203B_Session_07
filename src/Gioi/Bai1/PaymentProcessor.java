package Gioi.Bai1;

public class PaymentProcessor {
    public void process(PaymentMethod paymentMethod,int amount) {
        paymentMethod.paymentProcess(amount);
    }

}
