package com.Edubridge.Assignments.QuestionsOOPS.Q17;

public class Main {
    int i;
    Main(){
        i=10;
        System.out.println("Calling the no argument constructor");
        System.out.println("i =" +i);
    }

    public static void main(String[] args) {
        Main main=new Main();
    }
}
