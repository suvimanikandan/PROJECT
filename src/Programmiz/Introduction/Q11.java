package Programmiz.Introduction;

public class Q11 {
    public static void main(String[] args) {
        //find the frequency of the character
        String str = "Swetha venkatesan";
        char ch = 'e';
        int freq = 0;
for(int i=0;i<str.length();i++){
    if(ch==str.charAt(i)) {
        ++freq;
    }
}
        System.out.println("frequency is : "+ ch + "=" +freq);
    }
}
