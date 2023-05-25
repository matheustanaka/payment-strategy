package strategy;

public class PixStrategy implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagando R$ " + amount + " com Pix");
    }
}