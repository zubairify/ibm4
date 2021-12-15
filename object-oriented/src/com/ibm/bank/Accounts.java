package com.ibm.bank;

/**
 * This class represents generalised bank account.
 * @author Zubair Shaikh
 * @version 1.0
 */
public abstract class Accounts implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;
	
	private static int counter;
	
	// Executes at the time of class loading..
	static {	// Static initialiser block, consider as constructor for static members
		counter = INIT_ACCOUNT_NO;
	}
	
	/** Default constructor */
	public Accounts() {
	}

	/**
	 * Parameterised constructor for creating account.
	 * @param holder
	 * @param balance
	 */
	public Accounts(String holder, double balance) {
		this.acntNo = counter ++;
		this.holder = holder;
		this.balance = balance;
	}
	
	/** Method to print account summary */
	public void summary() {
		System.out.println("A/C No: " + acntNo);
		System.out.println("Holder: " + holder);
		System.out.println("Balance: " + balance);
	}
	
	// BL(Business Logic) Methods
	/** For depositing funds inthe bank account. */
	public void deposit(double amount) {
		balance += amount;
	}
	
//	public abstract void withdraw(double amount);
}
