package Lists_1;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("1) To create an empty list, enter 1");
        System.out.println("2) To add a student to the list, enter 2");
        System.out.println("3) To display student information, enter 3");
        System.out.println("4) To clear the list, enter 4");
        System.out.println("5) To check if the list is empty, enter 5");
        System.out.println("6) To end session, enter 6 ");
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
                    Arr.cleaningUp();
                    break;
                case 5:
                    if (Arr.isEmpty()) System.out.println("Empty");
                    else System.out.println("Not empty");
                    break;
                case 6:
                    session = false;
                    break;
                default:
                    break;
            }
        }
        /*for(int i = 0;i < 5; i++){
            Student obj = new Student();
            Arr.addFront(obj);
            obj.setAll(Integer.toString(i),Integer.toString(i),Integer.toString(i),Integer.toString(i),i,i);
        }
        for(int i = 0;i < 5; i++){
            Arr.GetRecord(i);
        }
        if(!Arr.isEmpty()){
            Arr.recordDeletion(1);
        }
        System.out.println("After removal second student: ");
        for(int i = 0;i < 5; i++){
            Arr.GetRecord(i);
        }
        Arr.cleaningUp();
        if(Arr.isEmpty()) System.out.println("Empty list");*/
    }
}
