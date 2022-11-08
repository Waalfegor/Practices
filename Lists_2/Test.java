package Lists_2;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("1) To create an empty list, enter 1");
        System.out.println("2) To add a student to the list, enter 2");
        System.out.println("3) To display student information, enter 3");
        System.out.println("4) To remove a student from the list, enter 4");
        System.out.println("5) To clear the list, enter 5");
        System.out.println("6) To check if the list is empty, enter 6");
        System.out.println("7) To end session, enter 7");
        ListOfDropouts Arr = new ListOfDropouts();
        boolean session = true;
        while (session) {
            System.out.print("Enter your choice: ");
            int input = myScanner.nextInt();
            switch (input) {
                case 1:
                    if (!Arr.isEmpty()) Arr.cleaningUp();
                    break;
                case 2:
                    Student newobj = new Student();
                    newobj.setAllFromConsole();
                    Arr.addFront(newobj);
                    break;
                case 3:
                    System.out.println("enter the student's personal number");
                    input = myScanner.nextInt();
                    Arr.GetRecord(input);
                    break;
                case 4:
                    System.out.println("enter the student's personal number");
                    input = myScanner.nextInt();
                    Arr.recordDeletion(input);
                case 5:
                    Arr.cleaningUp();
                    break;
                case 6:
                    if (Arr.isEmpty()) System.out.println("Empty");
                    else System.out.println("Not empty");
                    break;
                case 7:
                    session = false;
                    break;
                default:
                    break;
            }
        }
    }
}
