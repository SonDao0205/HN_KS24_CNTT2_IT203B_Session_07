package XuatSac.Bai1;

public class InvoiceGenerator {
    public static void print(Order o, double total, double finalAmt, String payName) {
        System.out.println("\n=== HÓA ĐƠN ===");
        System.out.println("Khách hàng: " + o.customer.name);
        for(OrderItem item : o.items) {
            System.out.println(item.product.name + " x " + item.quantity + ": " + item.getSubtotal());
        }
        System.out.println("Tổng tiền: " + total + " | Giảm giá: " + (total - finalAmt));
        System.out.println("Cần thanh toán: " + finalAmt + " (" + payName + ")");
    }
}
