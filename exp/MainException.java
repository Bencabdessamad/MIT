package exp;

public class MainException {
    public static void main(String[] args) throws MonException1 {
        TestException c1 = new TestException();

        
        try {
            c1.methodeB();
        } catch (MonException2 e) {
            System.out.println("Traitement dans main() : " + e);
        } finally {
            System.out.println("finally de main()");
        }

        
        c1.methodeA(1);
        System.out.println("fin de main()");
    }
}
