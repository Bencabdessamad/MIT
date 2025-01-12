package tp_4;

public abstract class Funct2 implements Function {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 27 nov. 2024
	 */
	 	protected Function leftChild;
	    protected Function rightChild;

	    public Funct2(Function leftChild, Function rightChild) {
	        this.leftChild = leftChild;
	        this.rightChild = rightChild;
	    }
	}
