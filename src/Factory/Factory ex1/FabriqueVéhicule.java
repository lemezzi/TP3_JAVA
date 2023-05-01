package Factory;

import Produit.Automobile;
import Produit.Scooter;




public interface FabriqueVéhicule {
	 Automobile creerAutomobile(String model, String color, int power, int espace);
	 Scooter creerScooter(String model, String color, int power);

}
