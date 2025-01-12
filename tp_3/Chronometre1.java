package tp_3;

public class Chronometre1 {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 10 nov. 2024
	 */

	    private long startTime;
	    private long endTime;
	    private boolean running;

	    public Chronometre1() {
	        this.startTime = 0;
	        this.endTime = 0;
	        this.running = false; 
	    }

	    public void start() {
	        if (!running) {
	            startTime = System.currentTimeMillis();
	            running = true;
	            System.out.println("Chronomètre démarré.");
	        } else {
	            System.out.println("Le chronomètre est déjà en cours d'exécution.");
	        }
	    }

	    public void stop() {
	        if (running) {
	            endTime = System.currentTimeMillis();
	            running = false;
	            System.out.println("Chronomètre arrêté.");
	        } else {
	            System.out.println("Le chronomètre est déjà arrêté.");
	        }
	    }

	    public void raz() {
	        startTime = 0;
	        endTime = 0;
	        running = false;
	        System.out.println("Chronomètre remis à zéro.");
	    }

	    public long getDuree() {
	        if (running) {
	            return System.currentTimeMillis() - startTime;
	        } else {
	            return endTime - startTime;
	        }
	    }

	    public static void main(String[] args) {
	        Chronometre1 chrono = new Chronometre1();
	        

	        chrono.start();
	        try {
	            Thread.sleep(1000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        chrono.stop();
	        System.out.println("Durée mesurée : " + chrono.getDuree() + " ms");

	        chrono.raz();
	        System.out.println("Durée après remise à zéro : " + chrono.getDuree() + " ms");
	    }
	}

