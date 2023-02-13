package OOPS.Example.ClassObjext;

class Bank{
    int accno;
    String name;
    float amount;

    //Method to intialize an object

    void insert(int a,String n, float amt){
        accno=a;
        name=n;
        amount=amt;
    }
    //deposit method
    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amt + " Amount deposited");
    }
    //withdraw method
    void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("Insufficient balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " amount Withdrawn");
        }
    }
   //check balance
    void CheckBal(){
        System.out.println("Balance is " +amount);
    }
    //display the amount value
    void displayamt(){
        System.out.println(accno+ " " + name + " " + amount);
    }
}


public class Account {
    public static void main(String[] args) {
        Bank bank=new Bank();
        bank.insert(1,"swetha",10000);
        bank.displayamt();
        bank.CheckBal();
        bank.deposit(89000);
        bank.displayamt();
        bank.withdraw(10000);
        bank.displayamt();
    }

}
