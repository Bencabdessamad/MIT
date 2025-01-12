package tp_2;

public class Complexe {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 18 nov. 2024
	 */
	
	private double nbrReel;
	private double nbrImaginaire;
	
	public Complexe() {
		this.nbrReel = 0;
		this.nbrImaginaire = 0;
	}

	public Complexe(double nbrReel, double nbrImaginaire) {
		this.nbrReel = nbrReel;
		this.nbrImaginaire = nbrImaginaire;
	}
	
	
	public String toString() {
		if(nbrImaginaire >= 0) {
			return nbrReel + "+" + "i" + nbrImaginaire;
		} else {
			return nbrReel + "-" + "i" + (-nbrImaginaire);
		}
	}
	
	public Complexe addition(Complexe autre) {
        Complexe resultat = new Complexe();
        resultat.nbrReel = this.nbrReel + autre.nbrReel;
        resultat.nbrImaginaire = this.nbrImaginaire + autre.nbrImaginaire;
        return resultat;
    }
	
	public Complexe multiplication(Complexe autre) {
        Complexe resultat = new Complexe();
        resultat.nbrReel = this.nbrReel * autre.nbrReel - this.nbrImaginaire * autre.nbrImaginaire;
        resultat.nbrImaginaire = this.nbrReel * autre.nbrImaginaire + this.nbrImaginaire * autre.nbrReel;
        return resultat;
    }
	
	public static void main(String[] args) {
        Complexe c1 = new Complexe(3, 2);
        Complexe c2 = new Complexe(1, 4);
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        Complexe somme = c1.addition(c2);
        System.out.println("Somme: " + somme);
        Complexe produit = c1.multiplication(c2);
        System.out.println("Produit: " + produit);
    }
}
