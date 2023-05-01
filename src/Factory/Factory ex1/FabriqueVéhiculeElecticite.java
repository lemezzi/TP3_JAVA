package Factory;

import Produit.Automobile;
import Produit.AutomobileElectricite;
import Produit.Scooter;
import Produit.ScooterElectricite;

public class FabriqueVéhiculeElecticite implements FabriqueVéhicule {
 
    public Automobile creerAutomobile(String model, String color, int power, int space) {
        return new AutomobileElectricite(model, color, power, space);
    }

    public Scooter creerScooter(String model, String color, int power) {
        return new ScooterElectricite(model, color, power);
    }
}
