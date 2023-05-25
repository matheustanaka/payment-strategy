import strategy.CreditCardStrategy;
import strategy.PaypalStrategy;
import strategy.PixStrategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(new PaypalStrategy());
        shoppingCart.add(100);
        shoppingCart.checkout();

        shoppingCart.setPaymentStrategy(new CreditCardStrategy());
        shoppingCart.add(200);
        shoppingCart.checkout();

        shoppingCart.setPaymentStrategy(new PixStrategy());
        shoppingCart.add(300);
        shoppingCart.checkout();
    }
}
