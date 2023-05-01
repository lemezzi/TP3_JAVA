package Strategie;


public class CreditCard implements PaymentStrategy {
    private String nom;
    private String numeroCarte;
    private String dateExpiration;
    private String codeSecurite;

    public CreditCard(String nom, String numeroCarte, String dateExpiration, String codeSecurite) {
        this.nom = nom;
        this.numeroCarte = numeroCarte;
        this.dateExpiration = dateExpiration;
        this.codeSecurite = codeSecurite;
    }

    public void payer(int montant) {
        System.out.println("Paiement de " + montant + " euros par carte bancaire.");
        // Code pour effectuer le paiement par carte bancaire
    }
}