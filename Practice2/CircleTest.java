package Practice2;

public class CircleTest
{
    public static void main(String[] args)
    {
        Circle circle1 = new Circle(9), circle2 = new Circle(2);
        System.out.println("сircle1 area is:");
        System.out.println(circle1.getSquare());
        System.out.println("сircle2 lenght is:");
        System.out.println(circle2.getLength());
        if(circle1.isEqual(circle2)) System.out.println("Equal");
        else System.out.println("Unequal");
    }
}
