package Strategie;



public class PaypalPaymentStrategy implements PaymentStrategy {
    private String email;
    private String motDePasse;

    public PaypalPaymentStrategy(String email, String motDePasse) {
        this.email = email;
        this.motDePasse = motDePasse;
    }

    public void payer(int montant) {
        System.out.println("Paiement de " + montant + " euros par Paypal.");
        // Code pour effectuer le paiement par Paypal
    }
}