package Access;

public class sub extends A{

    public sub(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        sub obj=new sub(14,"thangamani");
        int n=obj.num;
        System.out.println(n);
    }
}
