package tp_4;

public class Main {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 27 nov. 2024
	 */
	public static void main(String[] args) {
       
        Var x = new Var("x");

        Function f = new Plus(new Sin(x), new Mul(new Val(2), x));

        System.out.println(f); 
        System.out.println(f.getValue()); 

        
        x.setValue(1.57);

        System.out.println(f); 
        System.out.println(f.getValue());
    }
}