package Practice_4_1;

public class Rectangle extends Shape
{
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(){}
    public Rectangle(double width, double length){this.length = length; this.width = width;}
    @Override public String getType(){return "Rectangle";}
    @Override public double getArea(){return width * length;}
    @Override public double getPerimeter(){return 2*width+2*length;}


}
