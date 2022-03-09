package com.training.capgemini;

public interface Account {
	
	public void deposit(double amount);
	public void withdraw(double amount);
	public double checkBalance();
	public double getInfo(double rateofIntrest, double years);
	

}
