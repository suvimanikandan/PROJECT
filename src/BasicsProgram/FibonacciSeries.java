package BasicsProgram;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,count=10;
        System.out.print(n1 + " " + n2);
        for(int i=2;i<count;i++){    //loop starts from 2 because already printed 0 and 1
            n3=n1+n2;
            System.out.print(" " +n3);
            n1=n2;
           n2=n3;

        }

    }
}
