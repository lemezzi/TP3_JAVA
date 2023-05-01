package Factoryy;


public class ScooterElectricite extends Scooter {
	
	public ScooterElectricite(String model, String color, int power) {
        super(model, color, power);
    }

   
    public void afficherCaractéristiques() {
        System.out.println("Scooter électrique: " + model + ", couleur " + color + ", puissance " + power + " kW.");
    }
}


