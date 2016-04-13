package tiy.banking; 

import java.util.Scanner; 

public class Day9Runner { 

	public static void getUserInputInLoop() { 
		System.out.println("Finally - getting some user input"); 

		for (int t = 0; t < 3; t++) { 
			getUserInput(); 
		}
	}

	public static void getUserInput() { 
		System.out.println("Getting user input"); 
		Scanner myScanner = new Scanner(System.in); 
		System.out.println("What is the name of your current account?"); 
		String currentAccountName = myScanner.nextLine(); 
		System.out.println("Thank you - creating " + currentAccountName + " for you"); 
	}

	public static void playWithArrays() { 
		System.out.println("Starting to play with arrays ..."); 
		String[] myTestArray = new String[7]; 

		myTestArray[3] = "something"; 
		myTestArray[0] = "waldo"; 
		myTestArray[2] = "popeye"; 
		myTestArray[4] = "whatev'"; 
		myTestArray[1] = "penny"; 

		System.out.println("Manual Array Print"); 
		System.out.println(myTestArray[0]); 
		System.out.println(myTestArray[1]); 
		System.out.println(myTestArray[2]); 
		System.out.println(myTestArray[3]); 
		System.out.println(myTestArray[4]); 

		System.out.println("Loop Array Print"); 
		for (int whaaat = 0; whaaat < myTestArray.length; whaaat++) { 
			myTestArray[whaaat] = "Anything " + whaaat; 
			System.out.println(myTestArray[whaaat]); 

			if (whaaat > 2) { 
				break; 
			}
		}
	}

	public static void main(String[] cmdLineArgs) { 
		System.out.println("Banking system about to start ..."); 

		// test(); 
		// playWithArrays(); 
		getUserInputInLoop(); 
	}

	public static void test() { 
		BankAccount testBankAccount = new BankAccount(); 
		testBankAccount.printInfo(); 
		double currentBalance = testBankAccount.getBalance(); 

		double lotsOfMoney = 2000.34; 
		testBankAccount.deposit(lotsOfMoney, false); 
		
		currentBalance = testBankAccount.getBalance(); 
		System.out.println("The variable named currentBalance has this value in it: " + currentBalance); 

		double sadFace = 3000; 
		testBankAccount.withdraw(sadFace); 

		System.out.println(testBankAccount.getBalance()); 

		Bank testBank = new Bank(); 
		testBank.printInfo(); 

		testBank.addBankAccount(testBankAccount, 0);
		testBank.printInfo(); 

		BankAccount anotherTestAccount = new BankAccount();
		anotherTestAccount.deposit(100.00, false);  
		testBank.addBankAccount(anotherTestAccount, 1); 
		testBank.printInfo(); 
	}

}