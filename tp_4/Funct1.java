package tp_4;

public abstract class Funct1 implements Function {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 27 nov. 2024
	 */
	 protected Function child;

	    public Funct1(Function child) {
	        this.child = child;
	    }
	}
