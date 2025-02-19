package biblioManagement;

import java.util.ArrayList;

public class Adherent {
    private String nom;
    private String email;
    private ArrayList<Livre> livresEmpruntes;

    public Adherent(String nom, String email) {
        this.nom = nom;
        this.email = email;
        this.livresEmpruntes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public void emprunterLivre(Livre livre) throws Exception {
        livre.emprunter();
        livresEmpruntes.add(livre);
        System.out.println(nom + " a emprunté le livre: " + livre.getTitre());
    }

    public void retournerLivre(Livre livre) throws Exception {
        livre.retourner();
        livresEmpruntes.remove(livre);
        System.out.println(nom + " a retourné le livre: " + livre.getTitre());
    }

    public void afficherLivresEmpruntes() {
        System.out.println("Livres empruntés par " + nom + ":");
        for (Livre livre : livresEmpruntes) {
            System.out.println("- " + livre.getTitre());
        }
    }
}
