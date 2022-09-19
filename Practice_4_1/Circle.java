package Practice_4_1;

class Circle extends Shape
{
    private double r;


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public String getType(){return "Circle";}
    public double getArea(){return Math.PI*r*r;}
    public double getPerimetr(){return }


}
