package Produit;
public class ScooterEssence extends Scooter {
    public ScooterEssence(String model, String color, int power) {
        super(model, color, power);
    }

   
    public void afficherCaractéristiques() {
        System.out.println("Scooter à essence: " + model + ", couleur " + color + ", puissance " + power + " kW.");
    }

}