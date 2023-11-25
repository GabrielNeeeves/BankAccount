package contaBancaria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Username: ");
		String username = scanner.nextLine();
		
		System.out.println("Current Value: R$ ");
		double currentValue = scanner.nextDouble();
		
		UserAccount account1 = new UserAccount(username, currentValue);
		
		System.out.println("Type the number of your action: ");
		
		boolean exit = false;
		while(!exit) {
			System.out.println("1-) Deposit");
			System.out.println("2-) Drift");
			System.out.println("3-) Display account information");
			System.out.println("4-) Exit");
			int option = scanner.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Value to deposit: ");
				double depVal = scanner.nextDouble();
				
				account1.deposit(depVal);
				break;
			case 2:
				System.out.println("Amount to drift: ");
				double driftVal = scanner.nextDouble();
				
				account1.draft(driftVal);
				break;
			case 3:
				account1.displayCurrentValue();
				break;
			case 4:
				exit = true;
				break;
			default:
				System.out.println("This action does not exist. Try again.");
			}
		}
		System.out.println("Thanks for using");

		scanner.close();
	}
}
