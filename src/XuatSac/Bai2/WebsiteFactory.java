package XuatSac.Bai2;

import XuatSac.Bai1.*;

public class WebsiteFactory implements SalesChannelFactory {
    public int createDiscount() {
        return 10;
    }

    public PaymentMethod createPayment() {
        return new CreditCardPayment();
    }

    public NotificationService createNotification() {
        return new EmailNotification();
    }
}
