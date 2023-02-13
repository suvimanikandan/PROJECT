package StringExample;

public class Ascii {
    public static void main(String[] args) {
        byte asci[]={71,70,71};
        String s1=new String(asci);
        System.out.println(s1);
        String s2= new String(asci, 1,2 );
        System.out.println(s2);


    }
}
