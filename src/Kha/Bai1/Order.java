package Kha.Bai1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public String id;
    public String receiveName;
    public List<Product> products;
    public double totalAmount;

    public Order(String id, String receiveName, List<Product> products) {
        this.id = id;
        this.receiveName = receiveName;
        this.products = products;
        this.totalAmount = 0;
    }
}
