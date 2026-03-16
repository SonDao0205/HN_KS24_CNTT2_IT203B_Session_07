package XuatSac.Bai1;

public class EmailNotification implements NotificationService {
    public void send(String msg, String to) {
        System.out.println("Gửi Email đến " + to + ": " + msg);
    }
}
