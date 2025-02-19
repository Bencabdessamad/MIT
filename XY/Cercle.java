package XY;

public class Cercle extends Forme{

    private double r;

    public Cercle(double x, double y, double r){
        super(x, y);
        this.r = r;
    }

    double surface(){
        return Math.PI*r*r;
    }

    @Override
    double perimeter() {
        return 2*Math.PI*r;
    }
}
