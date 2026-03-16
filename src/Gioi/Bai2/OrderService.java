package Gioi.Bai2;

import Kha.Bai1.Order;

public class OrderService {
    private final OrderRepository repository;
    private final NotificationService notification;

    public OrderService(OrderRepository repository, NotificationService notification) {
        this.repository = repository;
        this.notification = notification;
    }

    public void createOrder(Order order, String customerContact) {
        repository.save(order);
        notification.send("Đơn hàng " + order.id + " đã được tạo", customerContact);
    }
}
