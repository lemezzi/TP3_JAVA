package Strategie;



public class TestStrategyPattern {
    public static void main(String[] args) {
        Article article1 = new Article("Livre", 15);
        Article article2 = new Article("Chaussures", 70);

        PaymentStrategy paymentStrategyCarte = new CreditCard("Dupont", "1234 5678 9012 3456", "05/25", "123");
        PaymentStrategy paymentStrategyPaypal = new PaypalPaymentStrategy("jdupont@gmail.com", "mdp123");

        article1.payer(paymentStrategyCarte);
        article2.payer(paymentStrategyPaypal);
    }
}