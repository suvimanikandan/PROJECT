package OOPS.Example.Constructor;
// example program of the Copy constructor
public class Person {
    int id;
    String name;
    int sal;
    int age;

    Person(int i,String n,int a,int s){
        name=n;
        id=i;
        age=a;
        sal=s;
    }
    //copy constructor
    Person(Person other){
      name=other.name;
      id= other.id;
      age= other.age;
      sal= other.sal;
    }
    void display(){
        System.out.println(id + " " + name + " " + age + " " + sal);
    }

    public static void main(String[] args) {
        Person person=new Person(1,"swetha",21,10000);
        Person person1=new Person(person);
         person1.display();
          person.display();
    }
}
