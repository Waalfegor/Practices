package Lists_Task_2;

import java.util.Scanner;

public class Test
{
    public static void main(String [] args)
    {
        ListForVarTwo Arr = new ListForVarTwo();
        Scanner myScanner = new Scanner(System.in);
        int input;
        int temp;
        System.out.println("Введите количество элементов ");
        input = myScanner.nextInt();
        System.out.println("Введите элементы");
        for(int i = 0; i < input; i++){
            temp = myScanner.nextInt();
            Node newObj = new Node(temp);
            Arr.addNode(newObj);
        }
        Arr.Sort();
        for(int i = 0; i < input + 1; i++){
            Arr.GetNode(i);
        }
    }
}
