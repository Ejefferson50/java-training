package labs;



public class BankAccountApp {

    public static void main(String[] args) {
        BankAccount checking = new BankAccount("111223456", 3500);
        BankAccount savings = new BankAccount("111223456", 7500);

        checking.setName("Marc");
        System.out.println(checking.getName());
        checking.makeDeposit(700);
        checking.makeDeposit(1300);
        checking.withdraw(1500);
        checking.accrue();
        System.out.println(checking.toString());
    }
}


class BankAccount implements Interest {
    //Properties of bank account
    private static int iD = 1000;           //Internal Company ID
    private String accountNumber;           //ID + random 2-Digit number + first 2 of SSN
    private static final String routingNumber = "052000075";
    private String name;
    private String SSN;
    private double balance;

    //Constructor
    public BankAccount(String SSN, double initDeposit){
        balance = initDeposit;
        this.SSN = SSN;
        iD++;
        setAccountNumber();
    }

    private void setAccountNumber(){
        int random = (int) (Math.random() * 100);
        accountNumber = iD + "" + random + SSN.substring(0,2);
        System.out.println("Your Account Number: " + accountNumber);
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void withdraw(double amount){
        System.out.println("Making a withdraw of $" + amount);
        balance -= amount;
        showBalance();
    }

    public void makeDeposit(double amount){
        System.out.println("Making a deposit of $" + amount);
        balance += amount;
        showBalance();
    }

    public void showBalance(){ System.out.println("Your Current Balance is: $" + balance); }


    @Override
    public void accrue() {
        balance *= (1 + rate/100);
        showBalance();
    }

    @Override
    public String toString(){
       return "[Name: " + name + " ]\n[Account Number: "
               + accountNumber + "]\n" + "[Routing Number: "
               + routingNumber + "]\n" + "[Balance: $" + balance + "]";
    }
}
