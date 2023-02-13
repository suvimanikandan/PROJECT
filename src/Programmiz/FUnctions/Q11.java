package Programmiz.FUnctions;

public class Q11 {
    public static void main(String[] args) {
        //checck the year is leap year or lot
        int year=2023;
        if(year%4==0 || year %100==0 ||year %400==0){
            System.out.println("this is leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
