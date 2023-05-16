package strategy;

public class Main {

    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCard("123 123", "564", "10-03-2024");
        PaymentStrategy payPal = new PayPal("email", "password");

        Cart cart = new Cart(creditCard);

        cart.makePayment(2400);

        cart.setPaymentStrategy(payPal);
        cart.makePayment(500);
    }
}
