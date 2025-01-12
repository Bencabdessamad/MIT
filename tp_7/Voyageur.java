package tp_7;

import java.util.Date;

public class Voyageur extends Personne {
	

	private Date dateVoyage;
	
	public Voyageur(String nom, String prenom, Date dateNaissance, String adresse, Date dateVoyage ) {
		super(nom, prenom, dateNaissance, adresse);
		this.dateVoyage = dateVoyage;
	}
	
	
    public Date getDateVoyage() {
		return dateVoyage;
	}


	public void setDateVoyage(Date dateVoyage) {
		this.dateVoyage = dateVoyage;
	}


	public void voyager() {
        System.out.println("Voyageur voyage");
    }
}
