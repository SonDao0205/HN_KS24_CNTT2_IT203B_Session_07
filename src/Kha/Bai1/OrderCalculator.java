package Kha.Bai1;

public class OrderCalculator {
    public static double calculatedTotalAmount(Order order) {
        return order.products.stream()
                .mapToDouble(product -> product.price)
                .sum();
    }
}
