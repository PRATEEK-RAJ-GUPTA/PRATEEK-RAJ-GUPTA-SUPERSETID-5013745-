public class StrategyPatternTest {
    public static void main(String[] args) {
        
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234 5678 2345 5679");
        PaymentStrategy paypalPayment = new PayPalPayment("user@example.com");

        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        paymentContext.executePayment(100.00); // Output: Paying 100.0 using Credit Card: 1234-5678-9876-5432
        System.out.println();

        paymentContext = new PaymentContext(paypalPayment);
        paymentContext.executePayment(200.00); // Output: Paying 200.0 using PayPal: user@example.com
    }
}
