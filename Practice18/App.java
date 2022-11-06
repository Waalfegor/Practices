package Practice18;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Exception1 obj1 = new Exception1();
        Exception2 obj2 = new Exception2();
        Scanner myScanner = new Scanner( System.in);
        MyThrowsDemo obj3 = new MyThrowsDemo();
        obj1.exceptionDemo();
        obj2.exceptionDemo();
        String key;
        /*
        System.out.print( "Enter key ");
        key = myScanner.next();
        */
        key = null;
        obj3.printMessage(key);
    }
}
