package XY;

public class Rectangle extends Forme {
    private double largeur, hauteur;

    public Rectangle(double x, double y , double largeur , double hauteur) {
        super(x, y);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    double surface() {
        return largeur * hauteur;
    }
    double perimeter() {
        return 2 * (largeur + hauteur);
    }
}
