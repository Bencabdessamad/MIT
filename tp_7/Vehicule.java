package tp_7;

public class Vehicule {

    private String modele;
    private String immatriculation;
    private double kilometrage;
    private double poidsVide;
    private double longueur;
    private double reserveCarburant;
    private Conducteur conducteur;

    public Vehicule(String modele, String immatriculation, double kilometrage, double poidsVide, double longueur,
                    double reserveCarburant, Conducteur conducteur) {
        this.modele = modele;
        this.immatriculation = immatriculation;
        this.kilometrage = kilometrage;
        this.poidsVide = poidsVide;
        this.longueur = longueur;
        this.reserveCarburant = reserveCarburant;
        this.conducteur = conducteur;
    }

    public void changeConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }

    @Override
    public String toString() {
        return "Vehicule [modele=" + modele + ", immatriculation=" + immatriculation + ", kilometrage=" + kilometrage
                + ", poidsVide=" + poidsVide + ", longueur=" + longueur + ", reserveCarburant=" + reserveCarburant
                + ", conducteur=" + (conducteur != null ? conducteur.getNom() : "Aucun conducteur") + "]";
    }

    public double getPoids() {
        return poidsVide + reserveCarburant + (conducteur != null ? 75 : 0);
    }

    public double allerAlaPompe(double quantite) {
        this.reserveCarburant += quantite;
        return reserveCarburant;
    }

    public double rouler(double distance, double taux_consommation) throws Exception {
        if (conducteur == null) {
            throw new Exception("Le véhicule n'a pas de conducteur");
        }

        double carburantNeed = distance * taux_consommation;
        if (carburantNeed > reserveCarburant) {
            throw new Exception("Le carburant disponible n’est pas suffisant pour cette opération");
        }

        kilometrage += distance;
        reserveCarburant -= carburantNeed;
        return kilometrage;
    }
}
