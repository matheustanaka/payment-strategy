package strategy;

public class PaypalStrategy implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagando R$ " + amount + " com Paypal");
    }
}