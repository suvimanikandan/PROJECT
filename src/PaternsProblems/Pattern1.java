package PaternsProblems;

/*
   *
  * *
 * * *
* * * *
 */
public class Pattern1 {
    public static void main(String[] args) {
        pattern1(4);
    }

    public static void pattern1(int n){
        int row,col=0;
        for( row =0;row<n;row++) {
            System.out.print(" ");
        }
            for(col=0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
