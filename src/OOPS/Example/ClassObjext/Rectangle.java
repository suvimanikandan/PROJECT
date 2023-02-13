package OOPS.Example.ClassObjext;

//A=wl

class RectangleExample{
    int width;
    int length;

    void insertValue(int w,int l){
        width=w;
        length=l;
    }
    void showAnswer(){
        System.out.println(length*width);
    }
}


public class Rectangle {
    public static void main(String[] args) {
        RectangleExample r1=new RectangleExample();
        RectangleExample r2= new RectangleExample();

     r1.insertValue(1,2);
     r2.insertValue(3,4);

        r1.showAnswer();
        r2.showAnswer();

    }
}
