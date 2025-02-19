package JustHavingFun;

public class Voiture extends Vehicule implements Motorisable{

    private int nbPortes;

    public Voiture(String marque, int nbPortes){
        super(marque);
        this.nbPortes = nbPortes;
    }


    public void afficherDetails() {
        System.out.println("Voiture: " + marque + " | Portes: " + nbPortes);
    }


    public void demarer() {
        System.out.println(" La voiture démaree .......");
    }
}


