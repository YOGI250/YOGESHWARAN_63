package com.lab;

import java.security.PublicKey;
import java.util.ArrayList;

class Bank {

	ArrayList<Account> accounts = new ArrayList<Account>();

	public void addAccount(Account ac) {
		accounts.add(ac);
		System.out.println("Account added successfully");
	}

	public void removeAccount(Account ac) {
		accounts.remove(ac);
		System.out.println("Account removed");
	}

	public Account getAccount(String Accountnumber) {
		for (Account ac : accounts) {
			if(ac.getAccountnumber().equals(Accountnumber)) {
			return ac;
			}
		}
		return null;
	}

	public void depositAccount(String Accountnumber, int Amount) {
		Account ac = getAccount(Accountnumber);
		ac.Deposit(Amount);
	}

	public void WithdrawAccount(String Accountnumber, int Amount) {
		Account ac = getAccount(Accountnumber);
		ac.Withdraw(Amount);
	}

	public void printAccountdetails() {
		for (Account acc : accounts) {
			System.out.println(acc.AccountHolderName);
			System.out.println(acc.Accountnumber);
			System.out.println(acc.Balance);
		}
	}

}

class Account {
	String Accountnumber;
	String AccountHolderName;
	int Balance;

	public Account(String AccountHolderName, String Accountnumber, int Balance) {
		this.AccountHolderName = AccountHolderName;
		this.Accountnumber = Accountnumber;
		this.Balance = Balance;
	}

	public String getAccountnumber() {
		return Accountnumber;
	}

	public String getAccountHoldername() {
		return AccountHolderName;
	}

	public int getBalance() {
		return Balance;
	}

	void Deposit(int amount) {
		if (amount > 0) {
			Balance += amount;
		}
		System.out.println("Total Balance:"+Balance);
	}

	void Withdraw(int amount) {
		if (amount > 0 && amount <= Balance) {
			Balance -= amount;
		
		}
		System.out.println("Balance :"+Balance);
	}
}

public class MyBank {

	public static void main(String[] args) {
		Bank mobj = new Bank();
		Account ac1 = new Account("Bharath", "84387989", 9000);
		Account ac2 = new Account("Kavin", "88587022", 18000);
		mobj.addAccount(ac1);
		mobj.addAccount(ac2);

		mobj.depositAccount("84387989", 800);
mobj.WithdrawAccount("88587022", 15000);
	
		mobj.printAccountdetails();
	}

}
