package com.ibm.bank;

public final class AccountsFactory {
	
	private AccountsFactory() {
	}

	public static Bank openAccount(String holder, String acType) {
		Bank acnt = null;
		
		if(acType.equals("Savings"))
			acnt = new Savings(holder);
		else
			acnt = new Current(holder);
		
		return acnt;
	}
}
