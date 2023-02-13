package PaternsProblems;

public class Main {
    public static void main(String[] args) {
       // patter2(4);
        //pattern1(5);
        pattern3(5);
    }

    static void patter2(int n) {
        for( int row=1;row<=n; row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /*
     *****
     *****
     *****
     *****
     *****
     */
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1; col<=n;col++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
    /*
     *****
     ****
     ***
     **
     *
     */
    static void pattern3(int n){
        for(int row=1;row<=n;row--){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
