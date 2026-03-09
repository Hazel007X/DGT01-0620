package bank;

import java.util.Scanner; 
public class Command1 { 
    public static void main(String[] args) { 
      
     double balance = 0; 
     Scanner input = new Scanner(System.in); 
         
     System.out.print("Enter cash amount for opening an Account: "); 
     balance = input.nextDouble(); 
 
     BankAccount acc1 = new BankAccount(); 
     ThreeCDAccount acc3 = new ThreeCDAccount(); 
     TwelveCDAccount acc12 = new TwelveCDAccount(); 
      
     acc1.setBalance(balance); 
        acc1.deposit(1500.00);        
        acc1.deposit(500.00); 
        acc1.withdraw(1000.00); 
        System.out.printf("Your balance: %.2f Baht\n", acc1.checkBalance());      
        System.out.printf("Interest for Saving Account is %.2f Baht \n", acc1.getInterest()); 
         
        acc3.balance = acc1.balance; 
        System.out.printf("Interest for 3-month CD Account is %.2f Baht \n", acc3.getInterest()); 
         
     acc12.balance = acc1.balance; 
        acc12.withdraw(1000.00); 
        System.out.printf("\nYour balance: %.2f\n", acc12.checkBalance());   
        System.out.printf("Interest for 12-month CD Account is %.2f\n Baht ", acc12.getInterest());           
    } 
}