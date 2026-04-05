/* Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A savings account with an interest rate and unique account number
 * Due: 04/14/2026
 * Platform/compiler: Eclipse, Java 21, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */
public class SavingsAccount extends BankAccount {
    private double rate = 0.025;
    private int savingsNumber = 0;
    private String accountNumber;

    /**
     * Standard constructor.
     *
     * @param name the owner of the account
     * @param amount the beginning balance
     */
    public SavingsAccount(String name, double amount) {
        super(name, amount);
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    /**
     * Copy constructor creates another account for the same owner.
     *
     * @param oldAccount the account with information to copy
     * @param the beginning balance of the new account
     */
    public SavingsAccount(SavingsAccount oldAccount, double amount) {
        super(oldAccount, amount);
        savingsNumber = oldAccount.savingsNumber + 1;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    /** Deposits interest into user account */
    public void postInterest() {
        deposit(getBalance() * rate);
    }

    /**
     * Accessor method to account number with the savings number.
     *
     * @return the account number with the savings number
     */
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }
}
