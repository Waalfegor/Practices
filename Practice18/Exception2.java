package Practice18;
import java.util.Scanner;

public class Exception2
{
    public void exceptionDemo()
    {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i;
        try {
            i = Integer.parseInt(intString);
            try {
                System.out.println(2 / i);
            }
            catch (ArithmeticException e2) {
                System.out.println(e2);
            }
        }
        catch (IllegalArgumentException e1) {
            System.out.println(e1);
        }
    }
}