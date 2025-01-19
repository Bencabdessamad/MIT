package Exm20122013.partie2.cnam.util;

public class Cercle {

    private double x,y,rayon;

    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public double calculerPerimetro() {
        return 2* Math.PI*rayon;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRayon() {
        return rayon;
    }
}
