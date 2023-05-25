import strategy.IPaymentStrategy;

public class ShoppingCart {
    private IPaymentStrategy paymentStrategy;
    private double total;

    public ShoppingCart(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void add(double amount) {
        total += amount;
    }

    public void checkout() {
        paymentStrategy.pay(total);
    }
}
