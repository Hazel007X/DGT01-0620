package bank;

import java.io.*;
import java.util.Scanner;

public class Command1 {
    public static void main(String[] args) {
        String cmd;
        double amount;
        BankAccount acc1 = new BankAccount();

        try (
        		FileWriter outfile = new FileWriter("D:/eclipse/Lab6/java/Balance.txt");
        		FileReader infile = new FileReader("D:/eclipse/Lab6/java/AccountList.txt");

            Scanner input = new Scanner(infile)
        ) {
            outfile.write("Transaction History\n\n");

            while (input.hasNext()) {
                cmd = input.next();
                amount = input.nextDouble();

                outfile.write(String.format("%s = %.2f\t\t", cmd, amount));

                if (cmd.equalsIgnoreCase("Balance")) {
                    acc1.setBalance(amount);
                } else if (cmd.equalsIgnoreCase("Withdraw")) {
                    acc1.withdraw(amount);
                } else if (cmd.equalsIgnoreCase("Deposit")) {
                    acc1.deposit(amount);
                }

                outfile.write(String.format("Balance = %.2f%n", acc1.getBalance()));
            }
        } catch (IOException error) {
            System.out.println("เกิดข้อผิดพลาดในการอ่าน/เขียนไฟล์: " + error.getMessage());
        }
    }
}
