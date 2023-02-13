package SuperExampleProgram;

public class Dog extends Animal{
    String color="white";

    void printcolor(){
        System.out.println(color);   //print color of dog class
        System.out.println(super.color);   //print color off animal class using the supeer keyword
    }
}
