package Kha.Bai2;

public class PercentageDiscount implements DiscountStrategy{
    double percentDiscount;

    public PercentageDiscount(double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * percentDiscount;
    }
}
