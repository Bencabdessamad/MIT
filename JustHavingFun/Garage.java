package JustHavingFun;

import java.util.ArrayList;

public class Garage {

    public ArrayList<Vehicule> vehicules = new ArrayList<>();

    public void ajouterVehicule(Vehicule v) {
        vehicules.add(v);
    }

    public void affocherVehicule() {
        for (Vehicule v : vehicules) {
            v.afficherDetails();
        }
    }
}
