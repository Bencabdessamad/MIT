package tp_3;

public class Exercice3 {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 10 nov. 2024
	 */
	    public static void main(String[] args) {
	        Integer[] tableau = new Integer[100];

	        int somme = 0;
	        for (int i = 0; i < 100; i++) {
	        	tableau[i] = i;
	            somme += tableau[i];
	        }

	        System.out.println("La somme des valeurs du tableau (Integer) est : " + somme);
	    }
	}

