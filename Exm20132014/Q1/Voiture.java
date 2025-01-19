package Exm20132014.Q1;

public class Voiture {

    private int id;
    private String marque;
    private String model;
    private String couleur;

    public Voiture(int id, String marque, String model, String couleur) {
        this.id = id;
        this.marque = marque;
        this.model = model;
        this.couleur = couleur;
    }

    public void demarrer() {
        System.out.println("La voiture démarre !");
    }
}
