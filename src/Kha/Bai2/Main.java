package Kha.Bai2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double amount = 1000000;

        OrderCalculator calc1 = new OrderCalculator(new PercentageDiscount(10));
        System.out.println("PercentageDiscount: " + calc1.calculateAmount(amount));

        calc1.setDiscountStrategy(new FixedDiscount(50000));
        System.out.println("FixedDiscount: " + calc1.calculateAmount(amount));

        calc1.setDiscountStrategy(new NoDiscount());
        System.out.println("NoDiscount: " + calc1.calculateAmount(amount));
    }
}
