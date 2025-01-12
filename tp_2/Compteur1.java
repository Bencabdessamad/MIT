package tp_2;

public class Compteur1 {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 10 nov. 2024
	 */
    private int value;

    
    public Compteur1() {
        value = 0; 
    }

    
    public void raz() {
        value = 0;
    }

    
    public void up() {
        value++;
    }

    
    public void consulterValeur() {
        System.out.println("Valeur actuelle : " + value);
    }

    
    public static void main(String[] args) {
        Compteur1 monCompteur = new Compteur1();
        monCompteur.raz();
        System.out.println("Valeur après remise à zéro :");
        monCompteur.consulterValeur();
        monCompteur.up();
        monCompteur.up();
        monCompteur.up();
        System.out.println("Valeur après trois incréments :");
        monCompteur.consulterValeur();
        monCompteur.consulterValeur();
        monCompteur.up();
        System.out.println("Valeur après un autre incrément :");
        monCompteur.consulterValeur();
        monCompteur.consulterValeur();
        monCompteur.raz();
        System.out.println("Valeur après une nouvelle remise à zéro :");
        monCompteur.consulterValeur();
        monCompteur.consulterValeur();
    }
}

