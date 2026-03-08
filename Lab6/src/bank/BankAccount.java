package bank;

public class BankAccount {
double balance=0;
public void setBalance(double amount) {
balance = amount;
}
public double getBalance() {
return balance;
}
public void withdraw(double amount) {
balance = balance-amount;
}
public void deposit(double amount) {
balance = balance+amount;
}
}