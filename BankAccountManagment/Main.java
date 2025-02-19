package BankAccountManagment;

public class Main {
    public static void main(String[] args) {
        try {
            CompteBancaire compte = new CompteBancaire(100);
            compte.deposer(200);
            compte.retirer(300);
            compte.retirer(700); // Provoque une exception

            CompteEpargne compteEpargne = new CompteEpargne(1000, 5);
            compteEpargne.appliquerInteret();
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
