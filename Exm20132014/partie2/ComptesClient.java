package Exm20132014.partie2;

import java.util.HashMap;
import java.util.Map;

public class ComptesClient {
    Map<String, CarteClient> clients;

    // Constructeur
    public ComptesClient() {
        clients = new HashMap<>();
    }

    // Ajouter un nouveau client
    public void ajouterClient(String identificateur) {
        if (!clients.containsKey(identificateur)) {
            CarteClient nvClient = new CarteClient(identificateur);
            clients.put(identificateur, nvClient);
        }
    }

    // Mettre à jour le compte d'un client après passage en caisse
    public void mettreAjourCompte(String identificateur_client, String fichierCaisse) {
        if (clients.containsKey(identificateur_client)) {
            double[] resultats = traiterCaisseClient(identificateur_client, fichierCaisse);
            double montantAchats = resultats[0];      // Montant des achats
            int pointsFidelite = (int) resultats[1];  // Points de fidélité

            // Récupérer le client
            CarteClient client = clients.get(identificateur_client);
            client.setMontantAchats(client.getMontantAchats() + montantAchats);   // Ajouter au montant des achats
            client.setPointsFidelite(client.getPointsFidelite() + pointsFidelite); // Ajouter aux points de fidélité
        }
    }

    // Méthode simulée pour traiter les informations du fichier caisse
    public double[] traiterCaisseClient(String identificateur_client, String fichierCaisse) {
        // Exemple fictif, à remplacer par la logique réelle de traitement du fichier
        return new double[]{100.0, 10}; // Retour fictif : 100€ d'achats et 10 points fidélité
    }
}
