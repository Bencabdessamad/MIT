package tp_7;

import java.util.ArrayList;
import java.util.List;

public class CarFerry extends Vehicule {
    private double longueurCale;
    private double chargeMax;
    private List<Vehicule> pileDroite;
    private List<Vehicule> pileGauche;

    public CarFerry(String modele, String immatriculation, double kilometrage, double poidsVide, double longueur,
            double reserveCarburant, Conducteur conducteur, double longueurCale, double chargeMax) {
        super(modele, immatriculation, kilometrage, poidsVide, longueur, reserveCarburant, conducteur);
        this.longueurCale = longueurCale;
        this.chargeMax = chargeMax;
        this.pileDroite = new ArrayList<>();
        this.pileGauche = new ArrayList<>();
    }

    public double poidsCarFerry() {
        try {
            return getPoids() 
                + pileDroite.stream().mapToDouble(Vehicule::getPoids).sum()
                + pileGauche.stream().mapToDouble(Vehicule::getPoids).sum();
        } catch (Exception e) {
            System.err.println("Erreur lors du calcul du poids du CarFerry: " + e.getMessage());
            return -1; // Valeur par défaut en cas d'erreur
        }
    }

    public boolean embarquer(Vehicule v) {
        try {
            if (v == null) {
                throw new IllegalArgumentException("Le véhicule ne peut pas être null.");
            }
            if (pileDroite.size() <= pileGauche.size()) {
                pileDroite.add(v);
            } else {
                pileGauche.add(v);
            }
            return true;
        } catch (Exception e) {
            System.err.println("Erreur lors de l'embarquement du véhicule: " + e.getMessage());
            return false;
        }
    }

    public boolean debarquer(Vehicule v) {
        try {
            if (v == null) {
                throw new IllegalArgumentException("Le véhicule à débarquer ne peut pas être null.");
            }
            if (pileDroite.remove(v) || pileGauche.remove(v)) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("Erreur lors du débarquement du véhicule: " + e.getMessage());
        }
        return false;
    }

    public double propVoiture() {
        try {
            long nbVoitures = pileDroite.stream().filter(v -> v instanceof Voiture).count()
                    + pileGauche.stream().filter(v -> v instanceof Voiture).count();
            long nbVehicules = pileDroite.size() + pileGauche.size();
            return nbVehicules == 0 ? 0 : (double) nbVoitures / nbVehicules;
        } catch (Exception e) {
            System.err.println("Erreur lors du calcul de la proportion de voitures: " + e.getMessage());
            return 0.0; // Valeur par défaut
        }
    }

    public boolean chercher(Voyageur p) {
        try {
            if (p == null) {
                throw new IllegalArgumentException("Le voyageur ne peut pas être null.");
            }
            return pileDroite.stream()
                    .anyMatch(v -> {
						try {
							return v instanceof Voiture && ((Voiture) v).monter(p) > 0;
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return false;
					})
                    || pileGauche.stream()
                    .anyMatch(v -> {
						try {
							return v instanceof Voiture && ((Voiture) v).monter(p) > 0;
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return false;
					});
        } catch (Exception e) {
            System.err.println("Erreur lors de la recherche du voyageur: " + e.getMessage());
            return false;
        }
    }

    @Override
    public String toString() {
        try {
            return super.toString() + ", Nombre de véhicules dans la cale: " 
                + (pileDroite.size() + pileGauche.size());
        } catch (Exception e) {
            System.err.println("Erreur lors de la conversion en chaîne de caractères: " + e.getMessage());
            return "Erreur dans le toString() du CarFerry.";
        }
    }
}
