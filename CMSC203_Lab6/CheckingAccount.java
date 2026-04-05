/* Class: CMSC203
 * Instructor: Professor Tanveer
 * Description: A checking account with a fee for withdrawals
 * Due: 04/14/2026
 * Platform/compiler: Eclipse, Java 21, Linux
 * I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Kyle Dinardi
 */
public class CheckingAccount extends BankAccount {
    private static final double FEE = 0.15;

    /**
     * Standard constructor.
     *
     * @param name the owner of the account
     * @param amount the beginning balance
     */
    public CheckingAccount(String name, double amount) {
        super(name, amount);
        setAccountNumber(getAccountNumber() + "-10");
    }

    /**
     * allows you to remove money from the account for a fee if enough money is available,returns
     * true if the transaction was completed, returns false if the there was not enough money.
     *
     * @param amount the amount to withdraw from the account
     * @return true if there was sufficient funds to complete the transaction, false otherwise
     */
    @Override
    public boolean withdraw(double amount) {
        return super.withdraw(amount + FEE);
    }
}
