package tp_6;

import java.util.HashMap;

public class Employe {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 30 nov. 2024
	 */
	
	private Integer id;
	private String nom;
	private String prenom;
	
	public Employe(Integer id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
}
