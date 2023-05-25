package strategy;

public class CreditCardStrategy implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagando R$ " + amount + " com cartão de Crédito");
    }
}