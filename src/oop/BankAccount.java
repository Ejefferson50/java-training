package oop;

public class BankAccount {
    // Define variables
   String accountNumber;

    //static >> belongs to the CLASS not the object instance
    //final >> constant (often static final)
    private static final String routingNumber = "013546";

    // Instance Variables
    String name;
    String ssn;
    String accountType;
    double balance;

    //Constructor definitions: unique methods
        // 1. They are used to define / setup / initialize properties of an object
        // 2. Constructors are IMPLICITLY (implied though not plainly expressed) called upon instantiation
        // 3. The same name as the class itself
        // 4. Constructors have NO return type

    BankAccount(){
        System.out.println("NEW ACCOUNT CREATED");
    }
    //Overloading: call same method name with different arguments
    BankAccount(String accountType){
        System.out.println("NEW ACCOUNT: " + accountType);
    }

    BankAccount(String accountType, double initDeposit){
        System.out.println("NEW ACCOUNT: " + accountType);
        System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
        String msg = "";
        if (initDeposit < 1000){
            msg = "ERROR: Minimum deposit must be at least $1,000";
        } else {
            msg = "Thanks for your initial deposit of: $" + initDeposit;
        }
        System.out.println(msg);
        balance = initDeposit;
    }


    // Define methods
    public void deposit(double amount){
        balance = balance + amount;
        showActivity("DEPOSIT");
    }
    void withdraw(double amount){
        balance = balance - amount;
        showActivity("WITHDRAW");
    }

    // Private: can only be called from within the class
    private void showActivity(String activity){
        System.out.println("YOUR RECENT TRANSACTION: " + activity);
        System.out.println("YOUR NEW BALANCE IS: $" + balance);
    }

    void checkBalance(){
        System.out.println("Balance: " + balance);
    }
    void getStatus(){

    }

    @Override
    public String toString(){
        return "[ NAME:" + name + ". ACCOUNT#: " + accountNumber + ". ROUTING#: " + routingNumber + ". BALANCE: $" + balance + " ]";
    }

}
