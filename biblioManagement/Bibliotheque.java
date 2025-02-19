package biblioManagement;

import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Livre> livres;
    private ArrayList<Adherent> adherents;

    public Bibliotheque() {
        livres = new ArrayList<>();
        adherents = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
        System.out.println("Livre ajouté: " + livre.getTitre());
    }

    public void ajouterAdherent(Adherent adherent) {
        adherents.add(adherent);
        System.out.println("Adhérent ajouté: " + adherent.getNom());
    }

    public void afficherLivres() {
        System.out.println("Liste des livres disponibles:");
        for (Livre livre : livres) {
            livre.afficherDetails();
        }
    }

    public void afficherAdherents() {
        System.out.println("Liste des adhérents:");
        for (Adherent adherent : adherents) {
            System.out.println("- " + adherent.getNom());
        }
    }
}
