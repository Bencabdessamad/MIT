package tp_8;

public abstract class Employe {

    private String matricule;
    private String nom;
    private String prenom;

    public Employe(String matricule, String nom, String prenom) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract double calculerSalaire();

    public void afficherInformation() {
        System.out.println("Matricule : " + matricule);
        System.out.println("nom : " + nom);
        System.out.println("prenom : " + prenom);
        System.out.println("Salaire : " + calculerSalaire() + " MAD");
    }
}
