package tp_5;

public class Personne {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 27 nov. 2024
	 */
	
	private String nom,prenom;
	private int age;
	
	public Personne(String nom,String prenom, int age) throws ErrConst{
		if(age < 0)
			throw new ErrConst();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void grandir(int g) throws ErrAge{
		if((age+g) < 0)
			throw new ErrAge();
		age += g;
	}
	
	public void afficher() {
		System.out.println("Je suis " + nom + " " + prenom + " " + age + " ans");
	}
}
