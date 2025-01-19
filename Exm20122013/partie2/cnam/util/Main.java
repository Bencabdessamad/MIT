package Exm20122013.partie2.cnam.util;

public class Main {
    public static void main(String[] args) {


        int n = Terminal.saisirInt("Combien de cercles voulez-vous saisir ?");


        Cercle[] cercles = new Cercle[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Cercle " + (i + 1) + ":");


            double x = Terminal.saisirDouble("Ajouter x :");
            double y = Terminal.saisirDouble("Ajouter y :");
            double rayon = Terminal.saisirDouble("Ajouter rayon :");


            cercles[i] = new Cercle(x, y, rayon);
        }


        for (int i = 0; i < cercles.length; i++) {
            double perimetre = cercles[i].calculerPerimetro();
            System.out.println("Périmètre du cercle " + (i + 1) + " : " + perimetre);
        }
    }
}
