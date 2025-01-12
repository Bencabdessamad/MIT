package tp_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionSalaires gestionSalaires = new GestionSalaires();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Ajouter un employé permanent");
            System.out.println("2. Ajouter un employé contractuel");
            System.out.println("3. Ajouter un employé à commission");
            System.out.println("4. Afficher les informations des employés");
            System.out.println("5. Quitter");
            System.out.print("Choix: ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Matricule: ");
                    String matriculeP = scanner.nextLine();
                    System.out.print("Nom: ");
                    String nomP = scanner.nextLine();
                    System.out.print("Prénom: ");
                    String prenomP = scanner.nextLine();
                    System.out.print("Salaire fixe: ");
                    double salaireFixe = scanner.nextDouble();
                    gestionSalaires.ajouterEmploye(new EmployePermanent(matriculeP, nomP, prenomP, salaireFixe));
                    break;

                case 2:
                    System.out.print("Matricule: ");
                    String matriculeC = scanner.nextLine();
                    System.out.print("Nom: ");
                    String nomC = scanner.nextLine();
                    System.out.print("Prénom: ");
                    String prenomC = scanner.nextLine();
                    System.out.print("Nombre d'heures: ");
                    double nombreHeures = scanner.nextDouble();
                    System.out.print("Taux horaire: ");
                    double tauxHoraire = scanner.nextDouble();
                    gestionSalaires.ajouterEmploye(new EmployeContractuel(matriculeC, nomC, prenomC, nombreHeures, tauxHoraire));
                    break;

                case 3:
                    System.out.print("Matricule: ");
                    String matriculeCom = scanner.nextLine();
                    System.out.print("Nom: ");
                    String nomCom = scanner.nextLine();
                    System.out.print("Prénom: ");
                    String prenomCom = scanner.nextLine();
                    System.out.print("Salaire de base: ");
                    double salaireBase = scanner.nextDouble();
                    System.out.print("Commission: ");
                    double commission = scanner.nextDouble();
                    gestionSalaires.ajouterEmploye(new EmployeCommission(matriculeCom, nomCom, prenomCom, salaireBase, commission));
                    break;

                case 4:
                    gestionSalaires.afficherTousLesEmployes();
                    break;

                case 5:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }
}
