package AbstractDemo;

public class Daughter extends Parent{
    @Override
    void carrer(String name) {
        System.out.println("Iam going to be  a " +name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + "he is " + age );

    }
}
