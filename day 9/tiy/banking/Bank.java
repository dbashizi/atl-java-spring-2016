package tiy.banking; 

public class Bank { 
	public String bankName; 
	public double totalMoneyAtTheBank; 
	public BankAccount[] bankAcctList = new BankAccount[3]; 

	public void addBankAccount(BankAccount bankAcctToAdd, int bankAcctIndex) { 
		System.out.println("OMG - I'm adding a bank account"); 
		bankAcctList[bankAcctIndex] = bankAcctToAdd; 
		totalMoneyAtTheBank = totalMoneyAtTheBank + bankAcctToAdd.getBalance(); 
	}

	public void printInfo() { 
		System.out.println("==========================="); 
		System.out.println("Name: " + bankName); 
		System.out.println("Total money in this bank: " + totalMoneyAtTheBank); 
		System.out.println("==========================="); 
	}
}