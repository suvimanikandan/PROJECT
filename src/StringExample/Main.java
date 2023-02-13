package StringExample;

public class Main {
    public static void main(String[] args) {
        // creating java string by new keyword
        // this statement create two object i.e
        // first object is created in heap
        // memory area and second object is
        // create in String constant pool.
        String str=new String("swetha");
        System.out.println(str);

        //declare without using new keyword
        String str1="thangamani";
        System.out.println(str1);
        //Memory allotment of String
    }
}
