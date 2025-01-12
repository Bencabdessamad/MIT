package tp_5;

public class AdresseIP {
    /**
     * Développé par : Abdessamad Bencheraik
     * IT - TAM
     * Date de création : 20 nov. 2024
     */
	
    private int[] octet;
    public AdresseIP(int o1, int o2, int o3, int o4) throws ExceptionAdrIP {
        if (o1 < 0 || o1 > 255)
            throw new ExceptionAdrIP("Valeur incorrecte pour le premier octet");
        if (o2 < 0 || o2 > 255)
            throw new ExceptionAdrIP("Valeur incorrecte pour le deuxième octet");
        if (o3 < 0 || o3 > 255)
            throw new ExceptionAdrIP("Valeur incorrecte pour le troisième octet");
        if (o4 < 0 || o4 > 255)
            throw new ExceptionAdrIP("Valeur incorrecte pour le quatrième octet");
        octet = new int[]{o1, o2, o3, o4};
    }

    public String toString() {
        return octet[0] + "." + octet[1] + "." + octet[2] + "." + octet[3];
    }


    public static void main(String[] args) {
        try {
            AdresseIP adr = new AdresseIP(192, 168, 21, 10);
            System.out.println("Adresse IP : " + adr);
        } catch (ExceptionAdrIP e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
