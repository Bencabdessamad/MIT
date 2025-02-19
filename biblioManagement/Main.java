package biblioManagement;

public class Main {
    public static void main(String[] args) {
        try {

            Bibliotheque bibliotheque = new Bibliotheque();


            Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry");
            Livre livre2 = new Livre("1984", "George Orwell");
            Livre livre3 = new Livre("La Peste", "Albert Camus");


            bibliotheque.ajouterLivre(livre1);
            bibliotheque.ajouterLivre(livre2);
            bibliotheque.ajouterLivre(livre3);


            Adherent adherent1 = new Adherent("Alice", "alice@example.com");
            Adherent adherent2 = new Adherent("Bob", "bob@example.com");


            bibliotheque.ajouterAdherent(adherent1);
            bibliotheque.ajouterAdherent(adherent2);


            adherent1.emprunterLivre(livre1);


            bibliotheque.afficherLivres();
            bibliotheque.afficherAdherents();


            adherent1.retournerLivre(livre1);
            adherent1.afficherLivresEmpruntes();


            adherent1.retournerLivre(livre1);

        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
