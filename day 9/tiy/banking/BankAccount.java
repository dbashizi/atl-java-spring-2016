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

	public void deposit(double amountToDeposit, boolean justKidding) { 
		if (justKidding == true) { 
			System.out.println("Not depositing any money for jokesters!"); 
		} else { 
			balance = balance + amountToDeposit; 
		}
	}

	public void withdraw(double amountToWithdraw) { 
		if (amountToWithdraw > balance) { 
			System.out.println("You broke!"); 
		} else { 
			System.out.println("You about to be broke if you withdraw $" + amountToWithdraw); 
			System.out.println("But you also the boss, so here you go!"); 
			balance = balance - amountToWithdraw; 
		}
	}
}