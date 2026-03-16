package Gioi.Bai2;

public class EmailService implements NotificationService {
    @Override
    public void send(String message, String recipient) {
        System.out.println("Gửi email tới " + recipient + ": " + message);
    }
}
