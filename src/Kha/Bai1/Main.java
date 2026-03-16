package Kha.Bai1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product prd = new Product("SP01","Laptop",15000000);
        Product prd1 = new Product("SP02","Chuột",300000);
        Customer cus = new Customer("Nguyễn Văn A", "a@example.com","Hà nội");
        List<Product> products = new ArrayList<Product>(List.of(prd,prd1,prd1));
        Order ord = new Order("ORD001",cus.name,products);
        System.out.println("Total Amount : " + OrderCalculator.calculatedTotalAmount(ord));
        OrderRepository.orders.add(ord);
        EmailService.sendEmail(cus.email,ord.id);
    }
}
