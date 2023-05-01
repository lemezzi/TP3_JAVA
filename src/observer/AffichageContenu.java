package observer;



public class AffichageContenu implements Observer {
    @Override
    public void update(Observable o) {
        Notification n = (Notification) o;
        System.out.println("Contenu de la notification : " + n.getContent());
    }
}