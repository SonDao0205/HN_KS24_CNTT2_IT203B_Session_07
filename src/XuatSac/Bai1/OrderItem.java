package XuatSac.Bai1;

public class OrderItem {
    public Product product;
    public int quantity;
    public OrderItem(Product product, int quantity) {
        this.product = product; this.quantity = quantity;
    }
    public double getSubtotal() { return product.price * quantity; }
}
