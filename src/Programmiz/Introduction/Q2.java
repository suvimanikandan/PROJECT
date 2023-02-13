package Programmiz.Introduction;

import java.util.Scanner;

public class Q2 {
    //addition of two numbers
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=n1+n2;
        System.out.println("Addition of Two numbers is:  "+ n3);
    }
}
