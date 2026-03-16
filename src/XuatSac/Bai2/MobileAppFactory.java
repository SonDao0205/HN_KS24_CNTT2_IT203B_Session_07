package XuatSac.Bai2;

import XuatSac.Bai1.*;

public class MobileAppFactory implements SalesChannelFactory {
    public int createDiscount() {
        return 15;
    }

    public PaymentMethod createPayment() {
        return new CreditCardPayment();
    }

    public NotificationService createNotification() {
        return (msg, to) -> System.out.println("Push Notification: " + msg);
    }
}
