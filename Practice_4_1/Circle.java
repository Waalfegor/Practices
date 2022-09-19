package Practice_4_1;

public class Circle extends Shape
{
    private double r;


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(){}
    public Circle(double r){this.r = r;}
    @Override public String getType(){return "Circle";}
    @Override public double getArea(){return Math.PI*r*r;}
    @Override public double getPerimeter(){return Math.PI*2*r;}


}
