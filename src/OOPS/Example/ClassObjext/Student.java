package OOPS.Example.ClassObjext;

public class Student {
    int id=1;
    String name="suvi";
    int salary=100000;

    public static void main(String[] args) {
        Student student=new Student();  //creating object of that of student class
             System.out.println(student.id);
        System.out.println(student.name);  //accessing member through reference variable
        System.out.println(student.salary);
    }
}
