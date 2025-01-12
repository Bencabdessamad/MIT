package tp_2;

public class Voiture {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 10 nov. 2024
	 */
    
    public void demarrer() {
        System.out.println("Le moteur est démarré.");
    }

    public void mettreCarburant(double volume) {
        System.out.println("Ajout de " + volume + " litres de carburant.");
    }

    public void choisirRapport(int rapport) {
        System.out.println("Passage au rapport " + rapport + ".");
    }

    public void mettreClignotant(boolean sens) {
        if (sens) {
            System.out.println("Clignotant gauche activé.");
        } else {
            System.out.println("Clignotant droit activé.");
        }
    }

    public void freiner() {
        System.out.println("La voiture est freinée.");
    }

    public double getVolumeCarburant() {
        double volumeCarburant = 52.5; 
        return volumeCarburant;
    }

    
    public static void main(String[] args) {
        
        Voiture maVoiture = new Voiture();

        
        maVoiture.demarrer();
        maVoiture.choisirRapport(1);
        maVoiture.choisirRapport(2);
        maVoiture.mettreClignotant(true);

        double niveauCarburant = maVoiture.getVolumeCarburant();
        System.out.println("Le volume de carburant est : " + niveauCarburant + " litres.");

        maVoiture.freiner();
        maVoiture.mettreClignotant(false);

        maVoiture.mettreCarburant(52.5);
    }
}

