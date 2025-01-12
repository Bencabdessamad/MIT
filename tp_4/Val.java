package tp_4;

public class Val extends Funct0{
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 27 nov. 2024
	 */
	private double value;

    public Val(double value) {
        this.value = value;
    }

    
    public double getValue() {
        return this.value;
    }

   
    public String toString() {
        return String.valueOf(this.value);
    }
}
