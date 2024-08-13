public class AdapterPatternTest {
    public static void main(String[] args) {
        
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);

        
        payPalProcessor.processPayment(100.00);
        stripeProcessor.processPayment(200.00);
    }
}
