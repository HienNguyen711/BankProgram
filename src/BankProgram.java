// ************************************************************************
// BankProgram.java	15.9.2016
// - The program class for the BankApplication exercise
// ************************************************************************
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BankProgram {

	private static List<Account> accountList = new ArrayList<Account>();

	// *** DO NOT change anything in the main method ***
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = -1;

		while (choice != 0) {

			switch (choice) {
			case 1:
				listAccounts();
				break;
			case 2:
				addAccount();
				break;
			case 3:
				depositMoney();
				break;
			case 4:
				withdrawMoney();
				break;
			case 5:
				deleteAccount();
				break;
			}

			displayMenu();
			choice = input.nextInt();
		}

		System.out.println("\nThe program ends now. Bye!");
	}

	private static void displayMenu() {
		String line = "-----------------------------------------------------" +
				"---------------------------------------------------------------";
		System.out.println(line);
		System.out.print(" 0 = Quit | 1 = List accounts | 2 = Add an account | " +
				"3 = Deposit money | 4 = Withdraw money | 5 = Delete an account \n");
		System.out.println(line);
		System.out.print("Enter your choice: ");
	}

	// *** NB! Edit only the methods below. DO NOT add any other methods! ***

	private static void listAccounts() {
		System.out.print("\n*** Account list ***\n");

		for(int i = 0;i<accountList.size();i++)
		{
			System.out.println(accountList.get(i).getAccountNumber());
			System.out.println(accountList.get(i).getBalance());
		}

	}

	private static void addAccount() {

		System.out.print("\n*** Add an account ***\n");
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter account number: ");
		String accountNumber = sc1.nextLine();
		boolean check = false;

		if(accountList.size()>0)
		{
			for(int i = 0;i<accountList.size();i++)
			{
				if(accountList.get(i).getAccountNumber().equals(accountNumber))
				{
					check = true;

					break;

				}


			}


		}


		if(check == true)
		{
			System.out.println("Account not created. Account "+accountNumber+" exists already!");

		}
		else
		{
			Account	account = new Account(accountNumber);

			accountList.add(account);
			System.out.println("Account created successfully");

		}


		if(accountList.size()==0)
		{
			Account	account1 = new Account(accountNumber);

			accountList.add(account1);
			System.out.println("Account created successfully");


		}
	}





	// Finds an account in accountList by given account number
	// Returns either the index of the account object in the account list
	// OR -1 if the account is not found.
	//private static Account findAccount(String accountNumber) {
	//Account myAccount = null;


	//return myAccount;
	//}	

	private static Account findAccount(String acc, List<Account> a)
	{
		for(Account ac : a)
		{
			if(ac.getAccountNumber().equals(acc))
			{
				return ac;
			}



		}
		return null;
	}

	private static void depositMoney() {
		System.out.print("\n*** Deposit money to an account ***\n");

		System.out.println("Enter account number");

		Scanner sc4 = new Scanner(System.in);
		String accountDeposit = sc4.nextLine();



		boolean check = false;

		if(accountList.size()>0)
		{
			for(int i = 0;i<accountList.size();i++)
			{
				if(accountList.get(i).getAccountNumber().equals(accountDeposit))
				{
					check = true;

					break;

				}


			}


		}


		if(check == false)
		{
			System.out.println("Account "+accountDeposit+" does not exist!");

		}
		else
		{
			System.out.println("Enter the amount to be deposited");
			double amount = sc4.nextDouble();
			if(amount < 0)
			{
				System.out.println("Cannot deposit a negative amount");
			}
			else
			{

				accountList.get(accountList.indexOf(findAccount(accountDeposit,accountList))).setBalance(amount);
				System.out.println("Deposit completed successfully!");
			}

		}


		if(accountList.size()==0)
		{
			System.out.println("Enter the amount to be deposited");
			double amount = sc4.nextDouble();
			if(amount < 0)
			{
				System.out.println("Cannot deposit a negative amount");
			}
			else
			{

				accountList.get(accountList.indexOf(findAccount(accountDeposit,accountList))).setBalance(amount);
				System.out.println("Deposit completed successfully!");
			}


		}}
















	private static void withdrawMoney() {
		System.out.print("\n*** Withdraw money from an account ***\n");
		System.out.println("Enter account number");

		Scanner sc5 = new Scanner(System.in);
		String accountWithdraw = sc5.nextLine();


		boolean check = false;

		if(accountList.size()>0)
		{
			for(int i = 0;i<accountList.size();i++)
			{
				if(accountList.get(i).getAccountNumber().equals(accountWithdraw))
				{
					check = true;

					break;

				}


			}


		}


		if(check == false)
		{
			System.out.println("Account "+accountWithdraw+" does not exist!");

		}
		else
		{
			System.out.println("Enter the amount to be withdrawn");
			double amount = sc5.nextDouble();
			if(amount < 0)
			{
				System.out.println("Cannot withdraw a negative amount");
			}
			else
			{
				if(amount < 0)
				{
					System.out.println("Cannot deposit a negative amount");
				}
				else{
					if(	accountList.get(accountList.indexOf(findAccount(accountWithdraw,accountList))).withdraw(amount))
					{
						System.out.println("Withdrawn completed successfully!");
					}
					else
					{
						System.out.println("Withdrawn is not completed. Available balance is too low");
					}



				}}}

	}






















	private static void deleteAccount() {
		System.out.print("\n*** Delete an account ***\n");
		
		System.out.println("Enter account number:");
		Scanner sc2 = new Scanner(System.in);
		 

		 String	accountDel = sc2.nextLine();




		boolean check = false;

		if(accountList.size()>0)
		{
			for(int i = 0;i<accountList.size();i++)
			{
				if(accountList.get(i).getAccountNumber().equals(accountDel))
				{
					check = true;

					break;

				}


			}


		}


		if(check == false)
		{
			System.out.println("Account "+accountDel+" does not exist!");

		}
		else
		{


			accountList.remove(accountList.get(accountList.indexOf(findAccount(accountDel,accountList))));
			System.out.println("Account deleted successfully");





		}






	}}

// End 