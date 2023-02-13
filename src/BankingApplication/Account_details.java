package BankingApplication;

import java.util.Scanner;

public class Account_details {
    private String accno;
    private String name;
    private String acc_type;
    private long balance;

    //method to open new Account

    Scanner sc=new Scanner(System.in);
    public void openAccount() {
        System.out.println("Enter the Account no: ");
        accno= sc.next();
        System.out.println("Enter the Name: ");
        name=sc.next();
        System.out.println("Enter the Account type:  ");
        acc_type=sc.next();
        System.out.println("Enter balance: ");
        balance=sc.nextLong();
    }

    //method to display account details
    public void showAccount() {
        System.out.println("Name of the Account Holder: " +name);
        System.out.println("AccountNo: " +accno);
        System.out.println("AccountType: " + acc_type);
        System.out.println("Balance: "+balance);
    }

    //method to deposit money
    public void deposit()  {
        long amt;
        System.out.println("Enter the ammount you want to deposit: ");
        amt=sc.nextLong();
        balance=balance+amt;
    }

    //Method to withdraw money
    public void withDraw() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt=sc.nextLong();
        if(balance<=amt){
            System.out.println(" oopss!!! Insufficient balance");
        }
        else{
            balance=balance-amt;
            System.out.println("balance After Withdraw " +amt);
        }

    }

    //method to search an account number
    public boolean search(String accno){
        if(accno.equals(accno)){
            showAccount();
            return (true);

        }
        return (false);
    }
}
