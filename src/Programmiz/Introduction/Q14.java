package Programmiz.Introduction;

public class Q14 {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "";
        String str3 = " ";

        System.out.println("str1 is : " + isNullEmpty(str1));
    }


    public static String isNullEmpty(String str) {
        //how to check the given  string is null or empty

        if(str==null){
            return null;
        }
        else if(str.isEmpty()){
            return "empty";
        }
        else {
            return  "Neither empty nor null";
        }

    }
}
