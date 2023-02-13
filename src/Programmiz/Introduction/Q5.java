package Programmiz.Introduction;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        //calculate the quotient and remainder
        int divident,divisor;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        divident=in.nextInt();
        divisor=in.nextInt();;
        int rem=divident% divisor;
        int quo= divident/divisor;
        System.out.println("Remainder is: "+rem);
        System.out.println("Quotient is: "+quo);

    }
}
