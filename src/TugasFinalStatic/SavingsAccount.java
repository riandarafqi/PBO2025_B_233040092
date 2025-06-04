package TugasFinalStatic;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
    }

    // @Override
    public void displaySavingsInfo() { //Muncul Cannot Override the final method from BankAccount
        // kode khusus
        super.displayAccountInfo();
        System.out.println("This is a savings account.");
    }
}
// Tugas 2