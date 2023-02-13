package Programmiz.Introduction;

public class Q9 {
    //find the all among the three numbers
    public static void main(String[] args) {
        int a=10, b=20, c=3;
        if (a>=b && a>=c) {
            System.out.println("The  largest number is A");
        } else if ( b>=c &&b>=a){
            System.out.println("The largest number is B");
        }
        else {
            System.out.println("the Largest Number is C");
        }
    }
}
