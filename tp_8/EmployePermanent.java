package tp_8;

public class EmployePermanent extends Employe{
    private double salaireFixe;

    public EmployePermanent(String matricule, String nom, String prenom, double salaireFixe) {
        super(matricule, nom, prenom);
        this.salaireFixe = salaireFixe;
    }

    public double calculerSalaire() {
        return salaireFixe;
    }
}
