package tp_5;

public class Application {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 27 nov. 2024
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Personne p = new Personne("Abdessamad", "Bencheraik", 20);
		p.afficher();
		p.grandir(-21);
		p = new Personne("Abdessamad", "Bencheraik", -20);
		p.afficher();
		}catch(ErrConst e) {
			System.out.println("Erreur de construction");
			System.exit(1);
		}catch(ErrAge e) {
			System.out.println("Erreur d'agrandissement");
			System.exit(1);
		}
	}
	
}
