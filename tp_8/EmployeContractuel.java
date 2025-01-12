package tp_8;

public class EmployeContractuel extends Employe{

    private double nombreHeures;
    private double tauxHoraire;

    public EmployeContractuel(String matricule, String nom, String prenom, double nombreHeures, double tauxHoraire) {
        super(matricule, nom, prenom);
        this.nombreHeures = nombreHeures;
        this.tauxHoraire = tauxHoraire;
    }

    public double calculerSalaire() {
        return nombreHeures * tauxHoraire;
    }
}
