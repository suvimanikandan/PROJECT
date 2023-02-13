package InheritExample;
//Example program of the inheritance
//It is also known as is-a relationship
//inheritance means  mechanism of which one object acquire all properties and behvaiour of the parent object
//and also it iss the important oops principle
//and alo ikts main advantage is  code resuablity and  method overriding achieved by runtime polymorphism

public class Employee {
    int sal=40000;
}
class Programmer extends Employee{
    int bonus=10000;

    public static void main(String[] args) {

        Programmer p=new Programmer();
        System.out.println("bonus is  " +p.bonus);
        System.out.println("Salary is  " +p.sal);


    }
}
