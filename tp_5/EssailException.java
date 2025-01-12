package tp_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EssailException {
    /**
     * Développé par : Abdessamad Bencheraik
     * IT - TAM
     * Date de création : 20 nov. 2024
     */
    public static void main(String[] args) {
        int a = 0, b = 0, res;
        Scanner clavier = new Scanner(System.in);
        try {
            System.out.print("Donnez la valeur de a : ");
            a = clavier.nextInt();
            System.out.print("Donnez la valeur de b : ");
            b = clavier.nextInt();
            
            res = a / b;
            System.out.println("Le résultat de " + a + " / " + b + " = " + res);
        } catch (ArithmeticException e) {
            System.out.println("Wak-Wak! Un problème dans la division");
            System.out.println("Le message officiel est : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erreur : Vous devez saisir un nombre entier !");
        } finally {
            System.out.println("Le bloc finally sera toujours exécuté");
            System.out.println("Et c'est là que l'on fermera par exemple les fichiers");
        }
        System.out.println("Fin de programme");
    }
}
