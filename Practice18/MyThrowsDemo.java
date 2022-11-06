package Practice18;

public class MyThrowsDemo
{
    public void printMessage(String key)
    {
        try {
            if(key == null) {
                throw new NullPointerException("null key" );
            }
            else System.out.println( key );
        }
        catch (NullPointerException e) {
            System.out.println( e );
        }
    }
}
