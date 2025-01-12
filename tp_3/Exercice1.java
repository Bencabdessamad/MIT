package tp_3;

public class Exercice1 {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 10 nov. 2024
	 */
	public static void main(String[] args) {
		int[] tableau = new int[100];
        int somme = 0;

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = i;
            somme += i;
        }

        System.out.println("La somme des valeurs du tableau est : " + somme);
    }
}
