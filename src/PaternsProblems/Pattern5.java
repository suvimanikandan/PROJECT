package PaternsProblems;

/*
       1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15
 */
public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    public static void pattern5(int n) {
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

}
