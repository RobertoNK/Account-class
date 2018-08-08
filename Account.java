
public class Account {
	private double balance;
	private String cusName;
	private String accNumber;
	
	public Account(double initialBalance, String name, String number) {
	cusName = name;
	accNumber = number;
	balance=Math.max(0,initialBalance);	
	}
	
	public Account() {
		balance=0.0;
	}
	public void deposit(double amount) {
	
		balance+=Math.max(0, amount);
	}
	public void withdraw(double amount) {
		balance-=amount;
		balance=Math.max(0,balance);
		
	}
	public double getBalance() {
		return balance;
	}
	public void close() {
		balance=0.0;
	}
	public String getCustomerName() {
		return cusName;
	}
	public String getAccountNumber() {
		return accNumber;
	}

}
