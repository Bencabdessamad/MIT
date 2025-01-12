package tp_3;

import java.util.Date;

public class Chronometre {

    
    private enum Etat { INIT, RUNNING, STOPPED }
    private Etat etat;
    private long lastStartDate; 
    private long lastSumDelta; 
    
    public Chronometre() {
        this.etat = Etat.INIT;
        this.lastStartDate = 0;
        this.lastSumDelta = 0;
    }
    
    public void start() {
        if (etat == Etat.INIT) {
            lastStartDate = new Date().getTime();
            etat = Etat.RUNNING;
            System.out.println("Chronomètre démarré depuis l'état INIT.");
        } else if (etat == Etat.STOPPED) {
            lastStartDate = new Date().getTime();
            etat = Etat.RUNNING;
            System.out.println("Chronomètre redémarré depuis l'état STOPPED.");
        } else if (etat == Etat.RUNNING) {
            System.out.println("Chronomètre déjà en cours d'exécution !");
        }
    }

    public void stop() {
        if (etat == Etat.INIT) {
            System.out.println("Erreur : Le chronomètre n'a pas encore été démarré !");
        } else if (etat == Etat.RUNNING) {
            lastSumDelta += new Date().getTime() - lastStartDate;
            etat = Etat.STOPPED;
            System.out.println("Chronomètre arrêté.");
        } else if (etat == Etat.STOPPED) {
            System.out.println("Erreur : Le chronomètre est déjà arrêté !");
        }
    }

    public void raz() {
        if (etat == Etat.INIT) {
            System.out.println("Le chronomètre est déjà réinitialisé !");
        } else {
            etat = Etat.INIT;
            lastStartDate = 0;
            lastSumDelta = 0;
            System.out.println("Chronomètre réinitialisé.");
        }
    }

    public long getTime() {
        if (etat == Etat.INIT) {
            return 0;
        } else if (etat == Etat.STOPPED) {
            return lastSumDelta;
        } else {
            return lastSumDelta + (new Date().getTime() - lastStartDate);
        }
    }

    public static void main(String[] args) {
        Chronometre chrono = new Chronometre();
        chrono.start();
        delay(100);        System.out.println("Temps mesuré après démarrage : " + chrono.getTime());
        chrono.stop();
        System.out.println("Temps après arrêt : " + chrono.getTime());
        chrono.stop();
        chrono.start();
        delay(100);
        System.out.println("Temps après redémarrage : " + chrono.getTime());
        chrono.raz();
        System.out.println("Temps après réinitialisation : " + chrono.getTime());
        chrono.stop();
    }

    private static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Erreur dans le délai : " + e.getMessage());
        }
    }
}
