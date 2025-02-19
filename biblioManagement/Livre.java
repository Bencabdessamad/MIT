package biblioManagement;

public class Livre {

    private String titre;
    private String auteur;
    private boolean estDisponible;

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.estDisponible = true;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public boolean estDisponible() {
        return estDisponible;
    }

    public void emprunter() throws Exception {
        if(!estDisponible){
            throw new Exception("Le livre \"" + titre + "\" est déjà emprunté.");
        }else {
            estDisponible = false;
        }
    }

    public void retourner() throws Exception {
        if(estDisponible){
            throw new Exception("Le livre \"" + titre + "\" a déjà été retourné.");
        }else{
            estDisponible = true;
        }
    }
    public void afficherDetails() {
        System.out.println("Titre: " + titre + ", Auteur: " + auteur + ", Disponible: " + estDisponible);
    }
}
