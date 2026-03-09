package bank;

public class ThreeCDAccount extends BankAccount { 
	  
	 private double interest = 0; 
	  
	 public double getInterest() { 
	  interest = balance * 0.01; //Interest = 1% 
	  return interest; 
	 }  
	} 