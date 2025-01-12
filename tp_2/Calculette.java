package tp_2;

public class Calculette {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 10 nov. 2024
	 */
    private double value = 0;
    public void zero() { value = value * 10; }
    public void un() { value = value * 10 + 1; }
    public void deux() { value = value * 10 + 2; }
    public void trois() { value = value * 10 + 3; }
    public void quatre() { value = value * 10 + 4; }
    public void cinq() { value = value * 10 + 5; }
    public void six() { value = value * 10 + 6; }
    public void sept() { value = value * 10 + 7; }
    public void huit() { value = value * 10 + 8; }
    public void neuf() { value = value * 10 + 9; }
    public void mul() { System.out.print(" * "); }
    public void moins() { System.out.print(" - "); }
    public void plus() { System.out.print(" + "); }
    public void div() { System.out.print(" / "); }
    public void dot() { System.out.print("."); }
    public void egal() { System.out.print(" = "); }
    public void raz() { value = 0; }
    public double getValue() { return value; }
    public static void main(String[] args) {
        Calculette calc = new Calculette();
        calc.cinq();
        calc.six();
        calc.quatre();
        System.out.println("564");
        calc.div();
        calc.deux();
        System.out.println("2");
        calc.egal();
        System.out.println("Résultat : " + (564 / 2));
        System.out.println("Le résultat est : " + calc.getValue());
        calc.raz();
        System.out.println("La calculette est remise à zéro : " + calc.getValue());
    }
}
