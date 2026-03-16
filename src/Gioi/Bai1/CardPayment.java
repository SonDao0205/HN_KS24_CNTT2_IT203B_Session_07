package Gioi.Bai1;

public class CardPayment implements CardPayable {
    @Override
    public void paymentProcess(int amount) {
        System.out.println("CardPayment paymentProcess : " + amount);
    }
}
