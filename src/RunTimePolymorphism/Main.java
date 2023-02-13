package RunTimePolymorphism;

public class Main {
    public static void main(String[] args) {
        Animal a;
        a=new Zebra();
        a.eat();
        a=new Lion();
        a.eat();
        a=new Tiger();
        a.eat();
        a=new cat();
        a.eat();
        a=new Animal();
        a.eat();

    }
}
