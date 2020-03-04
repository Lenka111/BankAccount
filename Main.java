//Elena Voinu
public class Main {
    public static void main(String[] args) {
        //create new object
        BankAccount bankAccount = new BankAccount(121212, "Elena Voinu", "999-888-777");
        BankAccount bk1 = new BankAccount(11111, "My Name", "111-222-3333");

        bankAccount.setBalance(0);
        bankAccount.depositFunds(10);
        //set the email address or add it to the constructor in the bank account class 
        bankAccount.setEmailAddress("student@college");

        System.out.println(bankAccount.getCustomerName() + " "
                +bankAccount.getAccountNumber()+ " $"+ bankAccount.getBalance()+
                " " + bankAccount.getPhoneNumber());

        //withdraw funds from the account
        bankAccount.withdrawFunds(9);
        System.out.println(bankAccount.toString());
        bankAccount.withdrawFunds(10);
        //deposit funds
        bankAccount.depositFunds(139);
        System.out.println(bankAccount.toString());


    }
}
