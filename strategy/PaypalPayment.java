package strategy;

public class PaypalPayment implements PaymentStrategy {
    private String emailId;
    private String password;

    public PaypalPayment(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
        System.out.printf("Paypal payment created with username: %s, password: %s", this.emailId, this.password);
    }
    
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal");
    }
}
