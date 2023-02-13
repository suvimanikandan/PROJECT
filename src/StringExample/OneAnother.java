package StringExample;

public class OneAnother {
    public static void main(String[] args) {
        //construct string from one another
        char c[] ={ 'd','a','e'};
        String s1=new String(c);
        String s2= new String(s1);

        System.out.println(s1);
        System.out.println(s2);

    }
}
