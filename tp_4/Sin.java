package tp_4;

public class Sin extends Funct1{
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 27 nov. 2024
	 */
	
	public Sin(Function child) {
        super(child);
    }

    
    public double getValue() {
        return Math.sin(child.getValue());
    }

    
    public String toString() {
        return "sin(" + child.toString() + ")";
    }
}