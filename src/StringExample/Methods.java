package StringExample;

import java.io.OutputStream;

//here below all the String methods are in used
public class Methods {
    public static void main(String[] args) {
        String s="swetha Manikandan";

        //return the no of character in the string length
        System.out.println("String length " +s.length());

        //returns the character at the ith index
        System.out.println("Character at 3rd position " + s.charAt(3));

        //return the substring
        System.out.println("Substring is "+ s.substring(1,3));

        //conacatenate of string
        String s1="swetha";
        String s2=s1.concat("saanvika");
        System.out.println(s2);

        //checking between two string
        boolean check="swetha".equals("Swetha");
        System.out.println(check);
        check="swetha".equals("swetha");
        System.out.println(check);

        //converting upper cases
        String str="swetha";
        System.out.println(" string in uppercase: " + str.toUpperCase());
        //converting lower cases
        String str1="sUVI";
        System.out.println("String in lowercase: "+ str1.toLowerCase());

        //trimming the word
        String s5="I love Daddy";
        System.out.println("String in trim: " +s5.trim());

        //replacing character
        String str3="swetha";
        System.out.println("original String " +str3);
        String str4="swetha".replace('t','d');
        System.out.println(" Replaced By "+str4);



    }
}
