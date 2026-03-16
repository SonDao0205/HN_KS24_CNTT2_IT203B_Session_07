package Gioi.Bai1;

public class EWalletPayment implements EWalletPayable {
    @Override
    public void paymentProcess(int amount) {
        System.out.println("EWalletPayment paymentProcess : " + amount);
    }
}
