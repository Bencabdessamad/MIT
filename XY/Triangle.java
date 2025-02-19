package XY;

public class Triangle extends Forme {

    private double a,b,c;


    public Triangle(double x, double y, double a, double b, double c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double surface() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Formule de Héron
    }
    double perimeter() {
        return a + b + c;
    }
}
