package Practice_4_1;

public class Square extends Shape
{
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(){}
    public Square(double side){this.side = side;}
    @Override public String getType(){return "Square";}
    @Override public double getArea(){return side * side;}
    @Override public double getPerimeter(){return side *4;}

}
