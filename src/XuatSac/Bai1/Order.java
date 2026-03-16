package XuatSac.Bai1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public String id;
    public Customer customer;
    public List<OrderItem> items = new ArrayList<>();
    public double finalAmount;

    public Order(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double getTotal() {
        return items.stream().mapToDouble(OrderItem::getSubtotal).sum();
    }
}
