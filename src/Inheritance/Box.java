package Inheritance;

public class Box {
    double l;
    double h;
    double w;

     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box () {
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    //create a cube
    Box (double side){
        this.w=side;
        this.l=side;
        this.h=side;
     }

     Box(Box old){
         this.h=old.h;
         this.w=old.w;
         this.l=old.w;
     }

     public void information(){
         System.out.println("Running the Box");

    }


}
