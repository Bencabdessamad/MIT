package tp_5;

public class OubliStupide {

    public static void main(String[] args) {
        /**
         * Développé par : Abdessamad Bencheraik
         * IT - TAM
         * Date de création : 20 nov. 2024
         */
        int[] tab = null;

        try {
            System.out.println(tab[2]);
        } catch (NullPointerException e) {
            System.out.println("Erreur : Vous tentez d'accéder à un tableau qui n'a pas été initialisé !");
            System.out.println("Message officiel de l'exception : " + e.getMessage());
        } finally {
            System.out.println("Fin du programme, avec ou sans exception.");
        }
    }
}
