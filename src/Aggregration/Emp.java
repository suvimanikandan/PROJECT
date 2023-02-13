package Aggregration;

//Understanding meaningful example of Aggregation
//In this example, Employee has an object of Address, address object contains its own informations
// such as city, state, country etc. In such case relationship is Employee HAS-A address.
public class Emp {
   int id;
   String name;
   Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println(id + " " +name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1= new Address("TN","Ind","KMu");
        Address address2=new Address("TN" ,"IND","KMK");

        Emp e1=new Emp(111,"suvi",address1);
        Emp e2=new Emp(112,"swetha",address2);
    }
}
