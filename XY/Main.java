package XY;

public class Main {
    public static void main(String[] args) {
        Forme cercle = new Cercle(0, 0, 5);
        Forme rectangle = new Rectangle(0, 0, 4, 6);
        Forme triangle = new Triangle(0, 0, 3, 4, 5);
        Forme carre = new Carre(0, 0, 4); // Création d'un carré avec un côté de 4

        System.out.println("Cercle -> Surface : " + cercle.surface() + ", Périmètre : " + cercle.perimeter());
        System.out.println("Rectangle -> Surface : " + rectangle.surface() + ", Périmètre : " + rectangle.perimeter());
        System.out.println("Triangle -> Surface : " + triangle.surface() + ", Périmètre : " + triangle.perimeter());
        System.out.println("Carré -> Surface : " + carre.surface() + ", Périmètre : " + carre.perimeter());
    }
}
