package XuatSac.Bai1;

public class CreditCardPayment implements PaymentMethod {
    public void process(double amt) { System.out.println("Đã thanh toán " + amt + " qua Credit Card."); }
    public String getName() { return "Thẻ tín dụng"; }
}
