package Biblio2;

public abstract class Document {
    protected String titre;
    protected String auteur;
    protected int anneePublication;

    public Document(String titre, String auteur, int anneePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

    public abstract void afficherDetails();
}
