package XY;

public abstract class Forme {
    protected double x,y;

    public Forme(double x, double y){
        this.x=x;
        this.y=y;
    }

    public void deplace(double x,double y){
        this.x=x;
        this.y=y;
    }

    abstract double surface();
    abstract double perimeter();
}
