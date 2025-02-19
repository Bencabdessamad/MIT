package BankAccountManagment;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(double solde, double tauxInteret) {
        super(solde);
        this.tauxInteret = tauxInteret;
    }

    public void appliquerInteret() {
        double nouveauSolde = getSolde() + (getSolde() * tauxInteret / 100);
        setSolde(nouveauSolde);
        System.out.println("Intérêt appliqué. Nouveau solde: " + getSolde() + " DH");
    }
}
