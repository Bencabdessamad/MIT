package exp;

class MonException2 extends MonException1 {
    public MonException2(String msg) {
        super(msg);
        System.out.println("cons MonException2");
    }
}
