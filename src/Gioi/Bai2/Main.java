package Gioi.Bai2;

import Kha.Bai1.Order;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderService service1 = new OrderService(new FileOrderRepository(), new EmailService());
        Order ord = new Order("ORD001","Nguyễn Văn A", List.of());
        service1.createOrder(ord, "customer@gmail.com");

        Order ord1 = new Order("ORD002","Nguyễn Văn B", List.of());
        OrderService service2 = new OrderService(new DatabaseOrderRepository(), new SMSNotification());
        service2.createOrder(ord, "0901234567");
    }
}
