package Biblio2;

public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();

        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943, 96);
        Livre livre2 = new Livre("1984", "George Orwell", 1949, 328);
        Magazine magazine1 = new Magazine("National Geographic", "Various", 2023, 123);

        bibliotheque.ajouterDocument(livre1);
        bibliotheque.ajouterDocument(livre2);
        bibliotheque.ajouterDocument(magazine1);

        System.out.println("\nAffichage de tous les documents :");
        bibliotheque.afficherTousLesDocuments();

        // Test d'emprunt et de retour
        try {
            livre1.emprunter();
            livre1.emprunter(); // Tentative d'emprunter un livre déjà emprunté
        } catch (DocumentNonDisponibleException e) {
            System.out.println("Erreur : " + e.getMessage());
        }

        livre1.retourner();
        System.out.println("\nAprès retour du livre :");
        livre1.afficherDetails();
    }
}
