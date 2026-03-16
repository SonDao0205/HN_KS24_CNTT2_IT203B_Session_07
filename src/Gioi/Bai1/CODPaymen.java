package Gioi.Bai1;

public class CODPaymen implements CODPayable {
    @Override
    public void paymentProcess(int amount) {
        System.out.println("CODPaymen paymentProcess : " + amount);
    }
}
