package StringExample;

public class Immutable {
    /*
    Immutable String in Java
In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.
Once a string object is created its data or state can’t be changed but a new string object is created.
     */
    public static void main(String[] args) {
        String s="Thangamani";
        s.concat("Renganathan");

        System.out.println(s);
    }

}

/*
Why string objects are immutable in java?

Because java uses the concept of string literal. Suppose there are 5 reference variables,
all refers to one object “sachin”. If one reference variable changes the value of the object, it will be affected to all the reference variables.
 That is why string objects are immutable in java.
 */