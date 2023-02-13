package StringExample;

//usingg string Buffer
public class Mutable {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("swetha");
        s.append("Manikandan");
        s.insert(1, "Java");
        System.out.println(s);
        System.out.println(s);

    }
}
