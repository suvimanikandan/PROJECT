package OOPS.Example.Constructor;

public class StuExample {


//Example  program of the constructor overloading

        int rollno;

        int age;
        String name;
        int sal;
    StuExample(int r,int a){
        rollno=r;
        age=a;
    }
    StuExample(int r,int a,String n){
        rollno=r;
        age=a;
        name=n;

    }
        StuExample(int r,int a,String n,int s){
            rollno=r;
            age=a;
            name=n;
            sal=s;
        }

        void display(){
            System.out.println(rollno + " " + age + " " + name + " " + sal);
        }

        //construtor overloading  ->same method name but different parameter contructor

        public static void main(String[] args) {
           StuExample s1=new StuExample(1,20,"swetha"); //here parameter passed in two parameter
           StuExample s2=new StuExample(2,21,"thangamani" ,40000); //here paraameter passed four
           StuExample s3=new StuExample(1,23);  // her3e two parameter are passed
            s1.display();
            s2.display();
            s3.display();
        }
    }

