package Gioi.Bai1;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        PaymentMethod momo = new EWalletPayment();
        paymentProcessor.process(momo,100);

        PaymentMethod credit = new CardPayment();
        paymentProcessor.process(credit,200);

        PaymentMethod cod = new CODPaymen();
        paymentProcessor.process(cod,300);
    }
}
