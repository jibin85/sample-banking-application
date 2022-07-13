import java.util.Scanner;

/**
 * @author JibinThomas
 * This Class is used for the Savings Bank Account Holders
 */
public class SavingsBankAccount extends BankAccount {

	private static double minBal = 500.00;
	private static double transLimit = 50000.00;

	/**
	 * This Method is used for Deposit Function
	 * @return
	 */
	public static double deposit() {
		return BankAccount.addBalance();
	}

	/**
	 * This Method is used for Withdrawal Function
	 */
	public static void withdrawl() {
		if (BankAccount.getBalance() == 0.00) {
			System.out.println("Total Withdawl value : " + getTotalWithdrawAmt());
			System.out.println("Your Account Balance is : " + BankAccount.getBalance()
					+ ", Please Deposit some amount and Try Later :-(\n");
			Main.savingsBankAccount();
		} else {
			System.out.println("Please Enter your Withdrawl Amount: ");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			double withdrawlValue = scanner.nextDouble();
			System.out.println("");
			if (getTotalWithdrawAmt() > transLimit) {
				setTotalWithdrawAmt(getTotalWithdrawAmt() + withdrawlValue);
				System.out.println("Your Transaction Limit is exceeded today!");
				Main.savingsBankAccount();
			} else if (withdrawlValue > transLimit) {
				System.out.println("Your Daily Transaction Limit is " + transLimit
						+ ", Please try amount lower than your Daily Transaction Limit");
				Main.savingsBankAccount();

			} else if (BankAccount.getBalance() - withdrawlValue <= minBal) {
				System.out.println("Your Account balance is : " + BankAccount.getBalance()
						+ ", you are draining off of Minimum Balance, please try someother amount!");
				Main.savingsBankAccount();
			} else {
				setWithdrawAmt(withdrawlValue);
				setBalance(getBalance() - getWithdrawAmt());
				setTotalWithdrawAmt(getTotalWithdrawAmt() + withdrawlValue);
				System.out.println("Withdrawl Amount for this transaction is: " + getWithdrawAmt());
				System.out.println("Total Withdrawl Amount is : " + getTotalWithdrawAmt());
				System.out.println("Balance after Withdrawl is: " + getBalance());
				setBalance(getBalance());
				System.out.println("Final Balance : " + getBalance());
				System.out.println("");
			}

		}
	}

}
