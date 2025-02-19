package BankAccountManagment;

public class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " DH. Nouveau solde: " + solde + " DH");
        } else {
            System.out.println("Montant invalide.");
        }
    }

    public void retirer(double montant) throws Exception {
        if (montant > solde) {
            throw new Exception("Solde insuffisant !");
        } else {
            solde -= montant;
            System.out.println("Retrait de " + montant + " DH. Nouveau solde: " + solde + " DH");
        }
    }
}
