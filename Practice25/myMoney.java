package Practice25;

import java.util.Scanner;
import java.util.regex.*;

public class myMoney
{
    final static Pattern pattern = Pattern.compile("^\\d+(\\.\\d{2})? (USD|EU|RUB)$");

    public static void main(String[] args)
    {
        String input;
        Scanner in = new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter num or print End to end session:");
            input = in.nextLine();
            if(input.equals("End")) return;
            System.out.println(isPrice(input));
        }
    }
    public static boolean isPrice(String string)
    {
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}