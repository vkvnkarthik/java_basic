package com.training.capgemini;

public class AccountType implements Account {

    double INITIALBALANCE;
	double totalBalance;
    int rateOfIntrest=5;
	
	

	@Override
	public void deposit(double amount) {
		 totalBalance=totalBalance+amount;
	}

	@Override
	public void withdraw(double amount) {
		if(amount>totalBalance) {
			System.out.println("Insufficient balance");
		}
		else {
			totalBalance=totalBalance-amount;
		}
		
		
	}

	@Override
	public double checkBalance() {
		
		return totalBalance;
	}
	@Override
	public double getInfo(double rateofIntrest, double years) {
		double SimpleInterest=((totalBalance*rateofIntrest*years))/100;
		       return SimpleInterest;
	}
	

	
	

}
