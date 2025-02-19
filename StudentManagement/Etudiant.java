package StudentManagement;

public class Etudiant {

    private String nom;
    private double moyenne;

    public Etudiant(String nom, double moyenne){
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public Etudiant() {

    }

    public String getNom(){
        return nom;
    }

    public double getMoyenne(){
        return moyenne;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void steMoyenne(double moyenne){
        this.moyenne = moyenne;
    }
}
