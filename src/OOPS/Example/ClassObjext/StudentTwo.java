package OOPS.Example.ClassObjext;


class student{
    int id;
    String name;
    int salary;

}
public class StudentTwo {
    public static void main(String[] args) {
        student stu=new student();
        student stu1=new student();   //creating multiple objects
        stu.id=12;                //inntialising objects
        stu.name="thangamani";
        stu.salary=100000;


        stu1.id=13;
        stu1.name="suvi";
        stu1.salary=120000;
        System.out.println("object one value is " + stu.id + " " + stu.name + " " + stu.salary);
        System.out.println("object one value is " + stu1.id + " " + stu1.name + " " + stu1.salary);
    }
}
