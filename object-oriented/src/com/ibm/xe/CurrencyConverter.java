package com.ibm.xe;

public class CurrencyConverter {

	public double convert(double amount, Currency source, Currency target) {
		double rate = target.dollarValue() / source.dollarValue();
		return rate * amount;
	}
}
