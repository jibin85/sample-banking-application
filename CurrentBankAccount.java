import java.util.Scanner;

/**
 * @author JibinThomas
 * This Class is used for manipulating Current Bank Account Holder details
 */
public class CurrentBankAccount extends BankAccount {

	/**
	 * This Method is used for Deposit Function
	 */
	public static double deposit() {
		return BankAccount.addBalance();
	}

	/**
	 * This Method is used for Withdrawal Function
	 */
	public static void withdrawl() {
		if (BankAccount.getBalance() == 0.00) {
			System.out.println("Your Account Balance is : " + BankAccount.getBalance()
					+ ", Please Deposit some amount and Try Later :-(");
			Main.currentBankAccount();
		} else {
			System.out.println("Please Enter your Withdrawl Amount: ");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			double withdrawlValue = scanner.nextDouble();
			System.out.println("");
			setWithdrawAmt(withdrawlValue);
			setBalance(getBalance() - getWithdrawAmt());
			setTotalWithdrawAmt(getTotalWithdrawAmt() + getWithdrawAmt());
			System.out.println("Withdrawl Amount for this transaction is: " + getWithdrawAmt());
			System.out.println("Total Withdrawl Amount is : " + getTotalWithdrawAmt());
			System.out.println("Balance after Withdrawl is: " + getBalance());
			setBalance(getBalance());
			System.out.println("Final Balance : " + getBalance());
			System.out.println("");
		}
	}
}
