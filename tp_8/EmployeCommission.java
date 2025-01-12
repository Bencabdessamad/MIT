package tp_8;

public class EmployeCommission extends Employe{

    private double salaireBase;
    private double commission;

    public EmployeCommission(String matricule, String nom, String prenom, double salaireBase, double commission) {
        super(matricule, nom, prenom);
        this.salaireBase = salaireBase;
        this.commission = commission;
    }
    public double calculerSalaire() {
        return salaireBase + commission;
    }
}
