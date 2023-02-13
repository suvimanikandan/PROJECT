package com.Edubridge.Assignments.QuestionsOOPS.Q21;

//swapping argument datatype
public class Main {
        void sum(int a,double b)
        {
            System.out.println(a+b);
        }
        void sum(double b,int a)
        {
            System.out.println(a+b);
        }

        public static void main(String[] args) {
            Main obj=new Main();
            obj.sum(50,50.0);
            obj.sum(50.0,50);
        }
}
