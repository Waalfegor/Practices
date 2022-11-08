package Lists_1;

import java.util.Scanner;

public class Student
{
    protected Student next = null;
    protected String name;
    protected String surname;
    protected String patronymic;
    protected String group;
    protected int age;
    protected int StudentsIndex;

    public Student(){}

    public Student(String name, String surname, String patronymic, int age, String group, int StudentsIndex) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.group = group;
        this.age = age;
        this.StudentsIndex = StudentsIndex;
    }

    public void setAll(String name, String surname, String patronymic, String group, int age, int StudentsIndex)
    {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.group = group;
        this.age = age;
        this.StudentsIndex = StudentsIndex;
    }

    public void setAllFromConsole()
    {
        Scanner myScanner = new Scanner( System.in);
        System.out.println("Type with a space: name, surname, patronymic, age, group and student's personal number ");
        String input = myScanner.nextLine();
        String[] inputArr = input.split(" ");
        this.name = inputArr[0];
        this.surname = inputArr[1];
        this.patronymic = inputArr[2];
        this.age = Integer.parseInt(inputArr[3]);
        this.group = inputArr[4];
        this.StudentsIndex = Integer.parseInt(inputArr[5]);
    }
    public void SetGroup(String group)
    {
        this.group = group;
    }

    public void GetAll()
    {
        System.out.println("Student: "+this.name +" "+this.surname +" "+this.patronymic+" "+ this.age+" "+ this.group+" "+ this.StudentsIndex );
    }

}
