package OOPS.Example.ClassObjext;

 class Stu{
     int rollno;
     String name;
     int sal;
     void insertRecord(int r, String n, int s) {
         rollno = r;
         name = n;
         sal = s;

     }

     void displayinformation() {
         System.out.println(rollno + " " + name + " " + sal);
     }

 }

     public class StudentThree {
         public static void main(String[] args) {
             Stu stu = new Stu();
             Stu stu1=new Stu();
             stu.insertRecord(1,"suvi",10000);
             stu1.insertRecord(2,"thangamani",100200);
             stu.displayinformation();
             stu1.displayinformation();
         }
     }


