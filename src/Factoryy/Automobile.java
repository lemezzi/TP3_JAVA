package Factoryy;



public abstract class Automobile {
	protected String model;
    protected String color;
    protected int power;
    protected int espace;
    
    public Automobile(String model, String color, int power, int espace) {
        this.model = model;
        this.color = color;
        this.power = power;
        this.espace = espace;
    }
    
    public abstract void afficherCaractéristiques();
    }



