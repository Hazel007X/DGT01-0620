package bank;

public class TwelveCDAccount extends BankAccount { 
private double interest = 0; 
public double getInterest() { 
interest = balance * 0.0175; //Interest = 1.75% 
return interest; 
}  
} 