package Exm20122013.Constru;

public class Voiture {
    String model;
    String marque;

    public Voiture(){
        model = "Undefined";
        marque = "Undefined";
    }

    public Voiture(String model, String marque){
        this.model = model;
        this.marque = marque;
    }

        public static void main(String[] args) {
            Voiture voiture = new Voiture();
            Voiture voiture2 = new Voiture("2003","golf");
            System.out.println(voiture.marque + " " + voiture.model);
            System.out.println(voiture2.marque + " " + voiture2.model);

    }
}
