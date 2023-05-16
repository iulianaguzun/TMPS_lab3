package strategy;

public class CreditCard implements PaymentStrategy{

    private String cardNumber;
    private String cvv;
    private String expirationDate;

    public CreditCard(String cardNumber, String cvv, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
