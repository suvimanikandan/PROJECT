package Programmiz.Introduction;

public class Q6 {
    //swap two numbers
    public static void main(String[] args) {
        int a=10,b=20;
       int temp=a;
        a=b;
        b=temp;
        System.out.println("Swapping of two numbers is: "+ a + " " +b);

        //using without a third variable
        int c=30,d=40;
        c=c-d;
        d=c+d;
        c=d-c;

        System.out.println("Swapping variable is: "+ c +  " " +d);

    }
}
