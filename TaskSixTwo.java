package com.training;

class Employee1 {
    String Name;
    int Year;
    String Address;
    Employee1(String nam,int years, String addr)
    {
        Name=nam;
        Year=years;
        Address=addr;
    }
    void Sam() {
        System.out.println(Name+ "        " +Year + "         "     +Address);
    }
    void Robert() {
        System.out.println(Name+ "     " +Year + "            "     +Address);
    }
    void John() {
        System.out.println(Name+ "    "+Year + "       "     +Address);
    }
}
public class TaskSixTwo
{
    public static void main(String args[]) {
        System.out.println("Name" +   "  Year of Joining     " + "Address" );
        Employee1 e=new Employee1("Sam", 2000, "68D-WallsStreet");
        e.Sam();
        Employee1 e1=new Employee1("Robert", 1994, "64C-WallsStreet");
        e1.Robert();
        Employee1 e2=new Employee1("John", 2002, "70F-WallsStreet");
        e2.Sam();
    }

}

