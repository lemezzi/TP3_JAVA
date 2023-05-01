package Factoryy;


public class AutomobileElectricite extends Automobile {
		
		 public AutomobileElectricite(String model, String color, int power, int espace) {
		        super(model, color, power, espace);
		    }
		 
		 public void afficherCaractéristiques() {
		        System.out.println("Automobile électrique: " + model + ", couleur " + color + ", puissance " + power + " kW, espace " + espace + " litres.");
		    }
		}
		



