package oop;

public class BankAccountApp {

    public static void main(String[] args) {
        //Creating a new bank account >> think instantiate an object

        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = "01589453";
        acc1.name = "Lars";
        acc1.balance = 10000;

        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.deposit(1500);
        acc1.withdraw(2000);

        System.out.println(acc1.toString());

        /*
        BankAccount acc2 = new BankAccount("Checking Account");
        acc2.accountNumber = "01589454";

        BankAccount acc3 = new BankAccount("Savings Account", 5000);
        acc3.accountNumber = "01589455";
        acc3.checkBalance();

        // Demo for Inheritance
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        cd1.name = "Joe";
        cd1.accountType = "CD Account";
        System.out.println(cd1.toString());

         */
    }
}

