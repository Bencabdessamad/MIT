package StudentManagement;

import java.util.ArrayList;

public class GestionEtudiants extends Etudiant{

    private ArrayList<Etudiant> etudiants = new ArrayList<>();

    public GestionEtudiants(String nom, double moyenne) {
        super(nom, moyenne);
    }

    public GestionEtudiants() {
        super();
    }


    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    public void afficherEtudiants() {
        for (Etudiant e : etudiants) {
            System.out.println(e.getNom() + " || " + e.getMoyenne());
        }
    }


    public Etudiant meilleurEtudiant() {

        Etudiant e1 = etudiants.get(0);
        for (Etudiant e : etudiants) {
            if (e.getMoyenne() > e1.getMoyenne()) {
                e1 = e;
            }
        }
        return e1;
    }

}
