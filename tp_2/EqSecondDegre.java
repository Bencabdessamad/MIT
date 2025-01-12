package tp_2;

import java.util.Scanner;

public class EqSecondDegre {
    /**
     * Développé par : Abdessamad Bencheraik
     * IT - TAM
     * Date de création : 18 nov. 2024
     */
    public static void main(String[] args) {
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        Scanner sc = new Scanner(System.in);
        while (a == 0.0) {
            System.out.print("Entrez une valeur non nulle pour a : ");
            a = sc.nextDouble();
        }
        System.out.print("Entrez une valeur pour b : ");
        b = sc.nextDouble();
        System.out.print("Entrez une valeur pour c : ");
        c = sc.nextDouble();

        
        double delta = calculerDiscriminant(a, b, c);
        afficheDiscriminant(delta);

        
        afficheSolutions(a, b, delta);
    }


    public static double calculerDiscriminant(double a, double b, double c) {
        return b * b - 4.0 * a * c;
    }
    public static void afficheDiscriminant(double delta) {
        System.out.println("Le discriminant (delta) est : " + delta);
    }
    public static void afficheSolutions(double a, double b, double delta) {
        if (delta < 0.0) {
            System.out.println("Pas de solutions réelles car delta est négatif.");
        } else if (delta > 0.0) {
            double solution1 = (-b - Math.sqrt(delta)) / (2.0 * a);
            double solution2 = (-b + Math.sqrt(delta)) / (2.0 * a);
            System.out.println("Deux solutions réelles : " + solution1 + " et " + solution2);
        } else {
            double solutionUnique = -b / (2.0 * a);
            System.out.println("Une solution unique : " + solutionUnique);
        }
    }
}
