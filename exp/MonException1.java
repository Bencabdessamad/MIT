package exp;

class MonException1 extends Exception {
    public MonException1(String msg) {
        super(msg);
        System.out.println("cons MonException1");
    }
}
