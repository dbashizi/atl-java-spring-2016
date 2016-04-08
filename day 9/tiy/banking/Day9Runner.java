package tiy.banking; 

public class Day9Runner { 

	public static void test() { 
		BankAccount testBankAccount = new BankAccount(); 
		testBankAccount.printInfo(); 
		testBankAccount.deposit(10.00); 
		
		System.out.println(testBankAccount.getBalance()); 

		Bank testBank = new Bank(); 
		testBank.printInfo(); 

		testBank.addBankAccount(testBankAccount, 0);
		testBank.printInfo(); 

		BankAccount anotherTestAccount = new BankAccount();
		anotherTestAccount.deposit(100.00);  
		testBank.addBankAccount(anotherTestAccount, 1); 
		testBank.printInfo(); 
	}

	public static void main(String[] cmdLineArgs) { 
		System.out.println("Banking system about to start ..."); 

		test(); 
	}
}