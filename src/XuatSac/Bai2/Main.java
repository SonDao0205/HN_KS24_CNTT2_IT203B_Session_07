package XuatSac.Bai2;

import XuatSac.Bai1.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderRepository repo = new DatabaseOrderRepository();
        OrderService service = new OrderService(repo);
        Scanner sc = new Scanner(System.in);

        System.out.println("Chọn kênh bán hàng: 1. Website | 2. Mobile App | 3. POS");
        int choice = sc.nextInt();

        SalesChannelFactory selectedFactory;
        switch (choice) {
            case 1:
                selectedFactory = new WebsiteFactory();
                break;
            case 2:
                selectedFactory = new MobileAppFactory();
                break;
            case 3:
                selectedFactory = new StorePOSFactory();
                break;
            default:
                selectedFactory = new WebsiteFactory();
        }

        // Giả lập tạo đơn hàng
        Customer customer = new Customer("Kha IT", "kha@dev.com", "09xx");
        Order order = new Order("ORD-999", customer);
        order.addItem(new OrderItem(new Product("P1", "Laptop", 20000000, "IT"), 1));

        // Xử lý đơn hàng dựa trên kênh đã chọn
        service.processOrder(order, selectedFactory);
    }
}
