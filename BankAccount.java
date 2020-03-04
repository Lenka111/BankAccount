//Elena Voinu
public class BankAccount {
    //class fields
    private int accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    // constructor
    public BankAccount(int accountNumber, String customerName, String phoneNumber){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }
    //getters and setters for the fields
    public int getAccountNumber(){ return this.accountNumber; }
    public void setAccountNumber(){this.accountNumber= accountNumber;}

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getEmailAddress() { return emailAddress; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    //method that allows customer to deposit funds
    public void depositFunds(int depositFunds){

        balance +=depositFunds;
        System.out.println("You deposited $" + depositFunds);
        System.out.println("Balance = $" + balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "Account Number=" + accountNumber +
                ", Balance= $" + balance +
                ", Customer Name='" + customerName + '\'' +
                ", Email Address='" + emailAddress + '\'' +
                ", Phone Number='" + phoneNumber + '\'' +
                '}';
    }

    //method that allows the customer to withdraw funds
    public void withdrawFunds(int withdrawFunds){

        // if present balance is less than the withdraw amount 
        if(balance < withdrawFunds){
            System.out.println("Withdraw $" + withdrawFunds);
            System.out.println("Can not complete transaction. Insufficient funds in the account");
            System.out.println("Balance = $" + balance);
        }
        else{
            balance -=withdrawFunds;
            System.out.println("Withdraw $" + withdrawFunds);
            System.out.println("You withdrew $" + withdrawFunds);
            System.out.println("Remaining balance = $" + balance);
        }
    }
}
