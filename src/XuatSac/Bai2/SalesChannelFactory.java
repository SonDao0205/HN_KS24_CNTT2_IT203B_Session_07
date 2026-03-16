package XuatSac.Bai2;
import XuatSac.Bai1.NotificationService;
import XuatSac.Bai1.PaymentMethod;

public interface SalesChannelFactory {
    int createDiscount();
    PaymentMethod createPayment();
    NotificationService createNotification();
}
