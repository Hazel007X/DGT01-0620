package bank;

public class BankAccount { 
	  
	 protected double balance = 0; 
	 private double interest = 0; 
	 
	 public void setBalance(double amount) { 
	  balance = amount; 
	 } 
	 
	 public double checkBalance() { 
	  return balance; 
	 } 
	  
	 public void deposit(double amount) {  
	  balance = balance+amount; 
	 }  
	 
	 public void withdraw(double amount) {   
	  if(balance > amount)  balance = balance-amount; 
	 } 
	 
	 public double getInterest() { 
	  interest = balance * 0.0075; //Interest = 0.75% 
	  return interest; 
	 } 
	} 