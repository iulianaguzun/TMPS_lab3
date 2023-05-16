package strategy;

public class PayPal implements PaymentStrategy{

    private String emailId;
    private String password;

    public PayPal(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }


    @Override
    public void makePayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
