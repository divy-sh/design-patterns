package strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay by credit card
        cart.setPaymentStrategy(new CreditCardPayment("John Doe", "1234567890123456", "786", "12/25"));
        cart.checkout(100);

        // Pay by PayPal
        cart.setPaymentStrategy(new PaypalPayment("johndoe@example.com", "mypwd"));
        cart.checkout(200);
    }
}
