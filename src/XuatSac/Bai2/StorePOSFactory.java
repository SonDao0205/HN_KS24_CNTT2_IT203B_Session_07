package XuatSac.Bai2;

import XuatSac.Bai1.*;

public class StorePOSFactory implements SalesChannelFactory {
    public int createDiscount() {
        return 20000;
    }

    public PaymentMethod createPayment() {
        return new CreditCardPayment();
    }

    public NotificationService createNotification() {
        return (msg, to) -> System.out.println("In hóa đơn giấy tại quầy...");
    }
}
