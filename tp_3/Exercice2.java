package tp_3;

public class Exercice2 {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 10 nov. 2024
	 */
	public static void main(String[] args) {
        int[][] compteurs = new int[100][100];

        
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                compteurs[i][j] = j;
            }
        }

        
        int sommeTotale = 0;
        for (int i = 0; i < 100; i++) {
            int somme = 0;
            for (int j = 0; j < 100; j++) {
                somme += compteurs[i][j];
            }
            sommeTotale += somme;
        }

        
        System.out.println("La somme totale des valeurs des compteurs est : " + sommeTotale);
    }
}

