package SuperExampleProgram.RealSuperExample;

 class Emp extends Person{
     float salary;

     public Emp(int id, String name ,float salary) {
         super(id, name);    //reusing the parent constructor
         this.salary=salary;
     }
     void display(){
         System.out.println(id + " " + name + " " + salary);
     }
 }
