package tiy.banking; 

public class BankAccount { 
	public String name; 
	public double balance; 

	public double getBalance() { 
		return balance; 
	}

	public void printInfo() { 
		System.out.println("============================="); 
		System.out.println("Account name: " + name); 
		System.out.println("Account balance: " + balance); 
		System.out.println("============================="); 
	}

	public void deposit(double amountToDeposit) { 
		balance = balance + amountToDeposit; 
	}

	public void withdraw() { 
	}
}