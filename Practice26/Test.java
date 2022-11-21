package Practice26;
import java.util.Collections;
import java.util.Stack;


public class Test
{
    public static void main(String[] args)
    {
        Stack<Integer> Arr = new Stack<>();
        for (int i = 0; i < 10; i++) Arr.push(i + 10);
        System.out.println(Arr);
        Invert(Arr);
        System.out.println(Arr);

    }
    public static void Invert(Stack<Integer> Arr)
    {
        Collections.reverse(Arr);
    }
}

