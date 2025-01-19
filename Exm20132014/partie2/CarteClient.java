package Exm20132014.partie2;

public class CarteClient {
    private String identificateur;
    private double montantAchats;
    private int pointsFidelite;

    // Constructeur
    public CarteClient(String identificateur) {
        this.identificateur = identificateur;
        this.montantAchats = 0.0;
        this.pointsFidelite = 0;
    }

    // Getter pour identificateur
    public String getIdentificateur() {
        return identificateur;
    }

    // Getter pour montantAchats
    public double getMontantAchats() {
        return montantAchats;
    }

    // Setter pour montantAchats
    public void setMontantAchats(double montantAchats) {
        this.montantAchats = montantAchats;
    }

    // Getter pour pointsFidelite
    public int getPointsFidelite() {
        return pointsFidelite;
    }

    // Setter pour pointsFidelite
    public void setPointsFidelite(int pointsFidelite) {
        this.pointsFidelite = pointsFidelite;
    }
}
