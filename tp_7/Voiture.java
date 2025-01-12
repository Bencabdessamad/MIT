package tp_7;

import java.util.HashSet;
import java.util.Set;

public class Voiture extends Vehicule {
    private int nbPassagersMax;
    private Set<Voyageur> passagers;

    public Voiture(String modele, String immatriculation, double kilometrage, double poidsVide, double longueur,
                   double reserveCarburant, Conducteur conducteur, int nbPassagersMax) {
        super(modele, immatriculation, kilometrage, poidsVide, longueur, reserveCarburant, conducteur);
        this.nbPassagersMax = nbPassagersMax;
        this.passagers = new HashSet<>();
    }

    public int monter(Voyageur p) throws Exception {
        if (passagers.size() >= nbPassagersMax) {
            throw new Exception("Pas de place disponible");
        }
        passagers.add(p);
        return passagers.size();
    }

    public boolean descendre(Voyageur p) {
        return passagers.remove(p);
    }

    public double poidsVoiture() {
        return getPoids() + passagers.size() * 75; // 75 kg par passager
    }

    @Override
    public String toString() {
        return super.toString() + ", Passagers: " + passagers.size();
    }
}
