package observer;

public class Main {
    public static void main(String[] args) {
        Notification notification = new Notification();
        AffichageCount affichageCount = new AffichageCount();
        AffichageContenu affichageContenu = new AffichageContenu();

        notification.addObserver(affichageCount);
        notification.addObserver(affichageContenu);

        notification.setContent("Nouvelle notification !");
    }
}