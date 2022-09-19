import java.util.Scanner;

public class Practices1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int sum = 0, average = 0;

        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int array[] = new int[size];

        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        average = sum / size;
        System.out.println("Сумма: ");
        System.out.println(sum);
        System.out.println("Среднее арифметическое: ");
        System.out.println(average);
    }
}
