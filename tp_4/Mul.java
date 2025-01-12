package tp_4;

public class Mul extends Funct2{
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 27 nov. 2024
	 */
	 public Mul(Function fg, Function fd) {
	        super(fg, fd); 
	    }

	    
	    public double getValue() {
	        return leftChild.getValue() * rightChild.getValue();
	    }

	   
	    public String toString() {
	        return leftChild.toString() + " * " + rightChild.toString();
	    }
	}
