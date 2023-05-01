package Factoryy;





public class FabriqueVéhiculeEssence {
	   public Automobile creerAutomobile(String model, String color, int power, int space) {
	        return new AutomobileEssence(model, color, power, space);
	    }

	    
	    public Scooter creerScooter(String model, String color, int power) {
	        return new ScooterEssence(model, color, power);
	    }

}
