package Programmiz.Introduction;



public class Q12 {
    public static void main(String[] args) {
        //remove whiteaspqaces

        String Sentence="Th       is    is Swetha From   k   umbakonam";
        System.out.println("The original sentence is: " +Sentence);

        Sentence=Sentence.replaceAll("\\s" ,"");
        System.out.println("the replaced sentence is : "+Sentence);
    }
}
