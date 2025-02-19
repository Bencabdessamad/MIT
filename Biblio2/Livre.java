package Biblio2;

public class Livre extends Document implements Empruntable {
    private int nombrePages;
    private boolean estEmprunte;

    public Livre(String titre, String auteur, int anneePublication, int nombrePages) {
        super(titre, auteur, anneePublication);
        this.nombrePages = nombrePages;
        this.estEmprunte = false;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Livre : " + titre + " par " + auteur + " (" + anneePublication + ")");
        System.out.println("Nombre de pages : " + nombrePages);
        System.out.println("Statut : " + (estEmprunte ? "Emprunté" : "Disponible"));
    }

    @Override
    public void emprunter() throws DocumentNonDisponibleException {
        if (estEmprunte) {
            throw new DocumentNonDisponibleException("Le livre " + titre + " est déjà emprunté.");
        }
        estEmprunte = true;
        System.out.println("Le livre " + titre + " a été emprunté.");
    }

    @Override
    public void retourner() {
        estEmprunte = false;
        System.out.println("Le livre " + titre + " a été retourné.");
    }
}
