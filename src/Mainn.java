import com.phone.Android;
import com.phone.OS;
import com.phone.OpeartingSystemFactory;
import com.phone.Windows;

public class Mainn {
    public static void main(String[] args) {
        OpeartingSystemFactory osf=new OpeartingSystemFactory();
        OS obj= osf.getInstance("open");
        obj.Spec();
    }
}
