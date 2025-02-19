package JustHavingFun;

public class Moto extends Vehicule implements Motorisable{

    public int cylindree;

    public Moto(String marque,int cylindree) {
        super(marque);
        this.cylindree = cylindree;
    }


    public void afficherDetails() {
        System.out.println("Moto : " + marque + " | cylindree: " + cylindree);
    }



    public void demarer() {
        System.out.println("La Moto démarre .... ");
    }
}
