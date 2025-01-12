package tp_7;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehicule {
    private List<Colis> cargaison;

    public Camion(String modele, String immatriculation, double kilometrage, double poidsVide, double longueur,
                  double reserveCarburant, Conducteur conducteur) {
        super(modele, immatriculation, kilometrage, poidsVide, longueur, reserveCarburant, conducteur);
        cargaison = new ArrayList<>();
    }

    public int ajouter(Colis c) {
        cargaison.add(c);
        return cargaison.size();
    }

    public boolean retirer(Colis c) {
        return cargaison.remove(c);
    }

    public double poidsCamion() {
        return getPoids() + cargaison.stream().mapToDouble(Colis::getPoids).sum();
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargaison: " + cargaison.size() + " colis";
    }
}
