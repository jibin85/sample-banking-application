import java.util.Scanner;

/**
 * @author JibinThomas
 * This is the Main class to execute the project
 */
public class Main {

	public static boolean QUIT = false;
	public static boolean QUIT1 = false;
	
	/**
	 * @param args
	 * This is the main method for project execution
	 */
	public static void main(String[] args) {
		mainMenu();
		System.out.println("Happy Banking Thanks!");
	}

	/**
	 * To Create a Menu system for overall banking
	 */
	private static void mainMenu() {
		System.out.println(
				"****************************************** Welcome ***************************************** \n");
		System.out.println("1. Savings Bank Account \t 2. Current Bank Account \t 3. Exit \n");
		System.out.println("Please Enter your choice : ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int selectAccount = scanner.nextInt();
		System.out.println("");
		do {
			switch (selectAccount) {
			case 1:
				savingsBankAccount();
				break;
			case 2:
				currentBankAccount();
				break;
			case 3:
				QUIT = true;
				break;
			default:
				System.out.println("Enter a valid choice!\n");
				QUIT = true;
				mainMenu();
				break;
			}
		} while (!QUIT);
	}

	/**
	 * To create a Menu for Savings Account Holders
	 */
	public static void savingsBankAccount() {
		System.out.println("************************ Welcome to your SAVINGS ACCOUNT ************************ \n");
		System.out.println("1. Deposit \t 2. Withdraw \t 3. Enquire \t 4. Previous Menu \t 5. Exit \n");
		System.out.println("Please Enter your choice : ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		System.out.println("");
		do {
			switch (choice) {
			case 1:
				BankAccount.addBalance();
				savingsBankAccount();
				break;
			case 2:
				SavingsBankAccount.withdrawl();
				savingsBankAccount();
				break;
			case 3:
				bankAccountDetails();
				savingsBankAccount();
				break;
			case 4:
				QUIT = true;
				mainMenu();
				break;
			case 5:
				QUIT = true;
				QUIT1 = true;
				break;
			default:
				System.out.println("Please Enter Valid Choice!\n");
				QUIT = true;
				savingsBankAccount();
				break;
			}
		} while (!QUIT || !QUIT1);

	}

	/**
	 * To create a Menu for Current Account Holders
	 */
	public static void currentBankAccount() {
		System.out.println("************************ Welcome to your CURRENT ACCOUNT ************************ \n");
		System.out.println("1. Deposit \t 2. Withdraw \t 3. Enquire \t 4. Previous Menu \t 5. Exit \n");
		System.out.println("Please Enter your choice : ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		System.out.println("");
		do {
			switch (choice) {
			case 1:
				BankAccount.addBalance();
				currentBankAccount();
				break;
			case 2:
				CurrentBankAccount.withdrawl();
				currentBankAccount();
				break;
			case 3:
				bankAccountDetails();
				currentBankAccount();
				break;
			case 4:
				QUIT = true;
				mainMenu();
				break;
			case 5:
				QUIT = true;
				QUIT1 = true;
				break;
			default:
				System.out.println("Please Enter Valid Choice!\n");
				QUIT = true;
				currentBankAccount();
				break;
			}
		} while (!QUIT || !QUIT1);
	}

	/**
	 * To View the Bank Account Details
	 */
	private static void bankAccountDetails() {
		System.out.println("############# Your Bank Account Details #############");
		BankAccount bankAccount = new BankAccount();
		bankAccount.setBankAccountNo("0075053000020411");
		System.out.println("Your Bank A/C no : " + bankAccount.getBankAccountNo());
		bankAccount.setBankAccountName("Jibin Thomas");
		System.out.println("Your Bank A/C Name : " + bankAccount.getBankAccountName());
		System.out.println("Your Balance is : " + BankAccount.getBalance());
		bankAccount.setDateOfOpenning("21-02-2014");
		System.out.println("Date of Opening : " + bankAccount.getDateOfOpenning());
		System.out.println("#####################################################");
		System.out.println("");
	}

}
