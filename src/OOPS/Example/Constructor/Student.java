package OOPS.Example.Constructor;

public class Student {
    int id;
    String name;
    int salary;

    void display(){
        System.out.println(id + "  " + name + " " + salary);
    }

    public static void main(String[] args) {
        Student stu=new Student();
        Student stu2=new Student();
        stu.id=12;

        //displaying the objects
        stu.display();
        stu2.display();


    }
}
