package tp_2;

public class Compteur2 {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 10 nov. 2024
	 */
    private int value;    
    public Compteur2() {
        this.value = 0; 
    }
    public void raz() {
        this.value = 0;
    }
    public void up() {
        this.value++;
    }
    public int getValue() {
        return this.value;
    }
    public static void main(String[] args) {
        Compteur2 monCompteur = new Compteur2();
        monCompteur.raz();
        System.out.println("Valeur après remise à zéro : " + monCompteur.getValue());
        monCompteur.up();
        monCompteur.up();
        monCompteur.up();
        System.out.println("Valeur après trois incréments : " + monCompteur.getValue());
        System.out.println("Valeur actuelle : " + monCompteur.getValue());
        monCompteur.up();
        System.out.println("Valeur après un autre incrément : " + monCompteur.getValue());
        System.out.println("Valeur actuelle : " + monCompteur.getValue());
        monCompteur.raz();
        System.out.println("Valeur après une nouvelle remise à zéro : " + monCompteur.getValue()); 
        System.out.println("Valeur actuelle : " + monCompteur.getValue());
    }
}