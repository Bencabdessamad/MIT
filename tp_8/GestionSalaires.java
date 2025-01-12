package tp_8;

import java.util.ArrayList;

public class GestionSalaires {

    private ArrayList<Employe> employees;
    public GestionSalaires() {
        employees = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        employees.add(employe);
    }

    public void afficherTousLesEmployes() {
        for (Employe employe : employees) {
            employe.afficherInformation();
        }
    }
}
