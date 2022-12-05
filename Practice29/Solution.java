package Practice29;

import java.util.Scanner;

import static java.lang.System.exit;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of cities: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];
        int sum = 0;

        for (int i = 0; i < size; ++i)
        {
            for (int j = 0; j < size; ++j)
            {
                matrix[i][j] = input.nextInt();
                if (!isCorrectInput(matrix[i][j]))
                {
                    System.out.println("Incorrect value. try again.");
                    exit(0);
                }
            }
        }

        for (int ind = 0; ind < size; ++ind)
        {
            for (int jnd = 0; jnd < size; ++jnd)
            {
                sum += matrix[ind][jnd];
            }
        }
        System.out.println("The answer is: " + sum / 2);
    }

    public static boolean isCorrectInput(int value)
    {
        return value == 0 || value == 1;
    }
}
