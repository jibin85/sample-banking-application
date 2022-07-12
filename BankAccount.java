import java.util.Scanner;

public class BankAccount {

	private String bankAccountNo;
	private String bankAccountName;
	private static double balance = 0.0f;
	private String dateOfOpenning;
	private static double depositAmt;
	private static double withdrawAmt;
	private static double totalWithdrawAmt = 0.0f;

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getBankAccountName() {
		return bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		BankAccount.balance = balance;
	}

	public String getDateOfOpenning() {
		return dateOfOpenning;
	}

	public void setDateOfOpenning(String dateOfOpenning) {
		this.dateOfOpenning = dateOfOpenning;
	}

	public static double getDepositAmt() {
		return depositAmt;
	}

	public static void setDepositAmt(double depositAmt) {
		BankAccount.depositAmt = depositAmt;
	}

	public static double getWithdrawAmt() {
		return withdrawAmt;
	}

	public static void setWithdrawAmt(double withdrawAmt) {
		BankAccount.withdrawAmt = withdrawAmt;
	}

	public static double getTotalWithdrawAmt() {
		return totalWithdrawAmt;
	}

	public static void setTotalWithdrawAmt(double totalWithdrawAmt) {
		BankAccount.totalWithdrawAmt = totalWithdrawAmt;
	}

	public static double addBalance() {
		System.out.println("Please Enter your Deposit Amount:");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double depositValue = scanner.nextDouble();
		System.out.println("");
		setDepositAmt(depositValue);
		balance += getDepositAmt();
		System.out.println("Your Deposit Amount is: " + getDepositAmt());
		System.out.println("Your Balance after Deposit is: " + balance);
		setBalance(balance);
		System.out.println("Your Final Balance : " + getBalance());
		System.out.println("");
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [bankAccountNo=" + bankAccountNo + ", bankAccountName=" + bankAccountName
				+ ", dateOfOpenning=" + dateOfOpenning + "]";
	}
}

