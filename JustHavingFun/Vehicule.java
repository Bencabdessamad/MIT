package JustHavingFun;

public abstract class Vehicule {

    public String marque;

    public Vehicule(String marque) {
        this.marque = marque;
    }

    public abstract void afficherDetails();
}
