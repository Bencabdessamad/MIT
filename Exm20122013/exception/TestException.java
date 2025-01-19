package Exm20122013.exception;

public class TestException {
    public static void main(String[] args) {
        try{
            int i = 1 / 0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        try{
            throw new Exception("Fichier non trouve");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
