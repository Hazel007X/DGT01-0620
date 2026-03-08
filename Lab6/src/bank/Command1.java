package bank;

import java.io.*;
import java.util.Scanner;
public class Command1 {
 public static void main(String[] args) {
 String cmd="", output="";
 double amount=0;
 BankAccount acc1 = new BankAccount();

try {
FileWriter outfile = new FileWriter("D:/java/Balance.txt");
FileReader infile = new FileReader("D:/java/AccountList.txt");
Scanner input = new Scanner(infile);
while(input.hasNext()) {

cmd = input.next();
amount = input.nextDouble();
output = String.format("%s = %.2f\t\t", cmd, amount);
outfile.write(output);

if(cmd.equals("Balance"))
acc1.setBalance(amount);
else if(cmd.equals("Withdraw"))
 acc1.withdraw(amount);
else acc1.deposit(amount);
output = String.format("Balance = %.2f", acc1.getBalance());
outfile.write(output + "\r\n");
} //end of while

infile.close();
outfile.close();
} catch (IOException error) {
error.printStackTrace();
 }
 }//end of main()
}
