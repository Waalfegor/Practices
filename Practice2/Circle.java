package Practice2;

public class Circle
{
    private double r;

    public Circle(double r) {this.r = r;}
    public double getR() {return r;}
    public double getLength() {return Math.PI*this.getR();}
    public double getPerimetr() {return Math.PI*2*this.getR();}
    public boolean isEqual(Circle other){return this.r == other.getR();}
}

