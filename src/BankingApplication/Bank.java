package BankingApplication;


import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("how many numbers of customers do you want: ");
        int n=in.nextInt();
        Account_details acc[]=new Account_details[n];
        for(int i=0;i<acc.length;i++){
            acc[i]= new Account_details();
            acc[i].openAccount();

        }
        //loops run until number 5 is not pressed to exit
        int ch;
        do{
            System.out.println("\n **** Banking Sytstem Application ***");
            System.out.println("1. Display All Account Details \n 2.Search the Account no \n 3.Deposit the Amount  \n 4. WithDraw the Amount \n 5.Exit");
            System.out.println("Enter your choice");
            ch=in.nextInt();

            switch (ch) {
                case 1:
                    for (int i = 0; i < acc.length; i++) {
                        acc[i].showAccount();
                    }
                    break;
                case 2:
                    System.out.println("Enter account no you want to search: ");

                    String ac_no = in.next();
                    boolean found=false;
                    for (int i = 0; i < acc.length; i++) {
                        found = acc[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed account doesnt exist");

                    }
                    break;
                case 3:
                    System.out.println("Enter Account No:");
                    ac_no = in.next();
                    found = false;
                    for (int i = 0; i < acc.length; i++) {
                        found = acc[i].search(ac_no);
                        if (found) {
                            acc[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Seaarch Failed !! Account doesnt exists");
                    }
                    break;
                case 4:
                    System.out.println("Enter Account No:");
                    ac_no = in.next();
                    found = false;
                    for (int i = 0; i < acc.length; i++) {
                        found = acc[i].search(ac_no);
                        if (found) {
                            acc[i].withDraw();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Seaarch Failed !! Account doesnt exists");
                    }
                    break;
                case 5:
                    System.out.println("See you soon");
                    break;


            }

        }
        while(ch!=5);
    }
}

