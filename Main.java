public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(121212, "Elena Voinu", "999-888-777");

        bankAccount.setBalance(0);
        bankAccount.depositFunds(10);
        bankAccount.setEmailAddress("student@college");

        System.out.println(bankAccount.getCustomerName() + " "
                +bankAccount.getAccountNumber()+ " $"+ bankAccount.getBalance()+
                " " + bankAccount.getPhoneNumber());

        bankAccount.withdrawFunds(9);
        System.out.println(bankAccount.toString());
        bankAccount.withdrawFunds(10);
        bankAccount.depositFunds(139);
        System.out.println(bankAccount.toString());


    }
}
