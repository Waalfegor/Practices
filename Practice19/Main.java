import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Shop Arr = new Shop();
        Client Egor = new Client("111","Egor","Fomin","Alexeevich");
        Arr.addClient(Egor);
        System.out.println(Arr.Order(input.next()));
    }
}