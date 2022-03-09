package com.training.capgemini;

public class AccountDemo {

	public static void main(String[] args) {
		
		SavingAccount s1= new SavingAccount(5000);
		s1.deposit(6000);
		System.out.println(s1.checkBalance());
		s1.withdraw(2000);
		System.out.println(s1.checkBalance());
		
		CurrentAccount c1=new CurrentAccount(8000);
		c1.deposit(9000);
		System.out.println(c1.checkBalance());
		c1.withdraw(2000);
		System.out.println(c1.checkBalance());
		

	}

}
