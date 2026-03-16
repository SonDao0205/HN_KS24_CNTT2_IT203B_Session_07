package XuatSac.Bai2;


import XuatSac.Bai1.*;

class OrderService {
    private final OrderRepository repo;

    public OrderService(OrderRepository repo) { this.repo = repo; }

    public void processOrder(Order order, SalesChannelFactory factory) {
        // Lấy bộ công cụ từ Factory của kênh tương ứng
        int discount = factory.createDiscount();
        PaymentMethod payment = factory.createPayment();
        NotificationService notify = factory.createNotification();

        double total = order.getTotal();
        double finalAmt = discount;

        payment.process(finalAmt);
        repo.save(order);
        notify.send("Đơn hàng " + order.id + " đã xong", order.customer.email);

        InvoiceGenerator.print(order, total, finalAmt, payment.getName());
    }
}