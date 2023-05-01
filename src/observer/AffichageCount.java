package observer;



public class AffichageCount implements Observer {
    private int count;

    @Override
    public void update(Observable o) {
        count++;
        System.out.println("Nombre de notifications reçues : " + count);
    }
}


