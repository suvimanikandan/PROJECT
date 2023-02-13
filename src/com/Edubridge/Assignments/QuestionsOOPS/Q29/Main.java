package com.Edubridge.Assignments.QuestionsOOPS.Q29;

public class Main implements B,C{
    public static void main(String[] args) {
     Main d=new Main();
     d.A();
     d.c();
     d.B();
    }

    @Override
    public void A() {
        System.out.println("Cooking");
    }

    @Override
    public void B() {
        System.out.println("Dancing");
    }

    @Override
    public void c() {
        System.out.println("Singing");

    }
}
