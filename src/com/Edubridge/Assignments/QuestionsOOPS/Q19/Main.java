package com.Edubridge.Assignments.QuestionsOOPS.Q19;
//method overloading
public class Main {
    void sum(int a,long b){
        System.out.println(a+b);
    }
    void sum(int a,long b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.sum(50, 50);
        main.sum(50, 50, 50);
    }
}
