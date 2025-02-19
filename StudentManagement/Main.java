package StudentManagement;

public class Main {
    public static void main(String[] args) {
        GestionEtudiants gestion = new GestionEtudiants();
        gestion.ajouterEtudiant(new Etudiant("Abdessamad Bencheraik", 20.0));
        gestion.ajouterEtudiant(new Etudiant("Mohammed Alam", 18.0));
        gestion.afficherEtudiants();
        System.out.println("Meilleur étudiant : " + gestion.meilleurEtudiant().getNom());
    }
}
