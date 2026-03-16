package XuatSac.Bai1;

public class PercentageDiscount implements DiscountStrategy {
    private double rate;
    public PercentageDiscount(double rate) { this.rate = rate; }
    @Override public double apply(double amount) { return amount * (1 - rate/100); }
}
