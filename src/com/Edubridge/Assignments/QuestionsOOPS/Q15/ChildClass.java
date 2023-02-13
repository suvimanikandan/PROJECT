package com.Edubridge.Assignments.QuestionsOOPS.Q15;

public class ChildClass extends ParentClass{
    void accessdata(){
        System.out.println("Inside child class");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    // private member can't be aaccessed    System.out.println("c = "+c);
        System.out.println("d = "+d);
    }
}
