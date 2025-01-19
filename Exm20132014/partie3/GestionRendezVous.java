package Exm20132014.partie3;

import java.util.ArrayList;
import java.util.Arrays;

public class GestionRendezVous {

    public static void afficherRdv(String dateCourante, ArrayList<String> rdvs) {
        String[] dateCouranteSplit = dateCourante.split(" ");
        String jourSemaine = dateCouranteSplit[0];
        String dateCouranteFormat = dateCouranteSplit[1];

        for (String rdv : rdvs) {
            String[] rdvDetails = rdv.split(";");
            String rdvDate = rdvDetails[0];
            String rdvHeure = rdvDetails.length > 1 ? rdvDetails[1] : "";
            String rdvTexte = rdvDetails.length > 2 ? rdvDetails[2] : "";

            if (rdvDate.equals(dateCouranteFormat)) {
                System.out.println("Rendez-vous pour le " + rdvDate + " à " + rdvHeure + " : " + rdvTexte);
            } else if (isJourSemaine(rdvDate, jourSemaine)) {
                System.out.println("Rendez-vous hebdomadaire le " + jourSemaine + " : " + rdvTexte);
            } else if (rdvDate.equalsIgnoreCase("a faire") || rdvDate.equalsIgnoreCase("urgent")) {
                System.out.println("Rendez-vous général (" + rdvDate + ") : " + rdvTexte);
            }
        }
    }

    public static boolean isJourSemaine(String rdvDate, String jourSemaine) {
        ArrayList<String> joursSemaine = new ArrayList<>(Arrays.asList("lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche"));
        return joursSemaine.contains(rdvDate.toLowerCase()) && rdvDate.equalsIgnoreCase(jourSemaine);
    }

    public static void main(String[] args) {
        ArrayList<String> rdvs = new ArrayList<>();
        rdvs.add("19/02/2014;10:00;Réunion équipe");
        rdvs.add("lundi;14:00;Rendez-vous chez le médecin");
        rdvs.add("urgent;;Appel important");
        rdvs.add("22/02/2014;09:30;Visite du client");
        rdvs.add("mercredi;15:00;Déjeuner avec le partenaire");
        afficherRdv("Mercredi 19/02/2014", rdvs);
    }
}

