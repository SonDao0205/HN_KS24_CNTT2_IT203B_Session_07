package XuatSac.Bai1;

public class OrderService {
    private OrderRepository repo;
    private NotificationService notify;

    public OrderService(OrderRepository repo, NotificationService notify) {
        this.repo = repo;
        this.notify = notify;
    }

    public void checkout(Order order, DiscountStrategy discount, PaymentMethod payment) {
        double total = order.getTotal();
        double finalAmt = discount.apply(total);
        order.finalAmount = finalAmt;

        payment.process(finalAmt);
        repo.save(order);
        notify.send("Đơn hàng " + order.id + " thành công!", order.customer.email);

        InvoiceGenerator.print(order, total, finalAmt, payment.getName());
    }
}
