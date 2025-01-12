package exp;

class TestException {

    
    public void methodeA(int p) throws MonException1 {
        if (p == 1) throw new MonException1("p==1: methodeA");
        if (p == 2) throw new MonException2("p==2: methodeA");
        System.out.println("fin de methodeA");
    }

    
    public void methodeB() throws MonException1 {
        try {
            methodeA(2);  
        } catch (MonException1 e) {
            System.out.println("Traitement partiel dans methodeB: " + e);
            throw e;  
        } finally {
            System.out.println("finally de methodeB");
        }
        System.out.println("fin de methodeB");
    }
}