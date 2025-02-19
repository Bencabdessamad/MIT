package Biblio2;

public class Magazine extends Document {
    private int numeroEdition;

    public Magazine(String titre, String auteur, int anneePublication, int numeroEdition) {
        super(titre, auteur, anneePublication);
        this.numeroEdition = numeroEdition;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Magazine : " + titre + " par " + auteur + " (" + anneePublication + ")");
        System.out.println("Numéro d'édition : " + numeroEdition);
    }
}
