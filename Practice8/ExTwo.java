package Practice8;
import java.util.Scanner;



public class ExTwo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n");
        int n = input.nextInt();
        ExTwo(n);
        System.out.println();
        System.out.println("Enter A and B");
        n = input.nextInt();
        int sec = input.nextInt();
        ExThree(n,sec);
    }
    public static void ExTwo(int n)
    {
        if (n == 0) return;
        ExTwo(n - 1);
        System.out.print(n + " ");
        return;
    }

    public static void ProgressionAB(int fst, int sec)
    {
        if (fst < sec) return;
        ProgressionAB(fst - 1, sec);
        System.out.print(fst + " ");
        return;
    }

    public static void ProgressionBA(int fst, int sec)
    {
        if (fst > sec) return;
        ProgressionBA(fst + 1, sec);
        System.out.print(fst + " ");
        return;
    }

    public static void ExThree(int fst, int sec)
    {
        if (fst > sec)
        {
            ProgressionAB(fst,sec);
        }
        else
        {
            ProgressionBA(fst,sec);
        }
    }
}
