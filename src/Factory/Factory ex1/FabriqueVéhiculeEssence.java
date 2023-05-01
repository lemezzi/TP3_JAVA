package Factory;
import Produit.Automobile;

import Produit.AutomobileEssence;
import Produit.Scooter;

import Produit.ScooterEssence;

public class FabriqueVéhiculeEssence {
	   public Automobile creerAutomobile(String model, String color, int power, int space) {
	        return new AutomobileEssence(model, color, power, space);
	    }

	    
	    public Scooter creerScooter(String model, String color, int power) {
	        return new ScooterEssence(model, color, power);
	    }

}
