package strategy;

public class Cart {
    private PaymentStrategy paymentStrategy;

    public Cart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void makePayment(double amount) {
        paymentStrategy.makePayment(amount);
    }
}
