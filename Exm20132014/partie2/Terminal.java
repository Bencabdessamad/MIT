package Exm20132014.partie2;

public class Terminal {
        public static void main(String[] args) {
            ComptesClient comptes = new ComptesClient();


            comptes.ajouterClient("00012345");
            comptes.ajouterClient("00067890");


            comptes.mettreAjourCompte("00012345", "caisse.txt");
            comptes.mettreAjourCompte("00067890", "caisse.txt");


            for (CarteClient client : comptes.clients.values()) {
                System.out.println("Client " + client.getIdentificateur() +
                        " - Montant Achats: " + client.getMontantAchats() +
                        " - Points Fidélité: " + client.getPointsFidelite());

        }
    }
}
