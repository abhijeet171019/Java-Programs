package com.training;

class student

{
    String ss;
    String name;
    public student(String ss)

    {
        name = ss;
    }
    public student()
    {
        name = "unknown";
    }
}
public class TaskSixThree
{
    public static void main(String[] args)
    {
        student obj = new student();

        obj.ss = "Abhijeet";
        System.out.println(obj.ss);
        System.out.println(obj.name);

    }

}

