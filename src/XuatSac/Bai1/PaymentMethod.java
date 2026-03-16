package XuatSac.Bai1;

public interface PaymentMethod {
    void process(double amount);

    String getName();
}
