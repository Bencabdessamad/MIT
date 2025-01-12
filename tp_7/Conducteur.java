package tp_7;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Conducteur extends Voyageur {
    
    private String numeroPermis;

    public Conducteur(String nom, String prenom, Date dateNaissance, String adresse, Date dateVoyage, String numeroPermis) {
        super(nom, prenom, dateNaissance, adresse, dateVoyage);
        this.numeroPermis = numeroPermis;
    }
    
    public void obtenirPermis() throws Exception {
        int age = getAge();
        if (age < 18) {
            throw new Exception("L'âge minimum pour obtenir un permis est de 18 ans");
        }
    }

    public String getNumeroPermis() {
		return numeroPermis;
	}

	public void setNumeroPermis(String numeroPermis) {
		this.numeroPermis = numeroPermis;
	}

	public int getAge() {
	    LocalDate dateNaissanceLocal = getDateNaissance()
	        .toInstant()
	        .atZone(java.time.ZoneId.systemDefault())
	        .toLocalDate();
	    return Period.between(dateNaissanceLocal, LocalDate.now()).getYears();
	}


    
    public void voyager() {
        System.out.println("Conducteur voyage avec un véhicule");
    }
}
