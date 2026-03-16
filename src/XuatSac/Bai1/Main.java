package XuatSac.Bai1;


public class Main {
    public static void main(String[] args) {
        OrderRepository repo = new DatabaseOrderRepository();
        NotificationService notify = new EmailNotification();
        OrderService service = new OrderService(repo, notify);

        Product laptop = new Product("SP01", "Laptop", 15000000, "Điện tử");
        Customer customerA = new Customer("Nguyễn Văn A", "a@example.com", "0123456789");

        System.out.println("--- ĐANG TẠO ĐƠN HÀNG ---");
        Order myOrder = new Order("ORD001", customerA);
        myOrder.addItem(new OrderItem(laptop, 1));

        DiscountStrategy tenPercent = new PercentageDiscount(10);
        PaymentMethod card = new CreditCardPayment();

        service.checkout(myOrder, tenPercent, card);

        double revenue = repo.findAll().stream().mapToDouble(o -> o.finalAmount).sum();
        System.out.println("\nTổng doanh thu hệ thống: " + revenue);
    }
}