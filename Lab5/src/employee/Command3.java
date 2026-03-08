package employee;

import java.util.*;

public class Command3 {
    public static void main(String [] args) {
        int id;
        double income;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your id: ");
        id = input.nextInt();
        System.out.print("Enter your income: ");
        income = input.nextDouble();

        if (id >= 10) {
            Worker emp = new Worker();
            emp.setID(id);
            emp.setIncome(income);
            emp.calBonus();
            System.out.printf("You are Worker, ID %d.\n", emp.getID());
            System.out.printf("If your income is %.2f, ", emp.getIncome());
            System.out.printf("you'll get %.2f Baht for Bonus!!\n", emp.getBonus());
        } else if (id > 0) {
            Manager mgr = new Manager();
            mgr.setID(id);
            mgr.setIncome(income);
            mgr.calTax();
            System.out.printf("You are Manager, ID %d.\n", mgr.getID());
            System.out.printf("If your income is %.2f, ", mgr.getIncome());
            System.out.printf("you need to pay %.2f Baht for Tax!!\n", mgr.getTax());
        } else {
            System.out.printf("Invalid ID %d!!\n", id);
        }
    } // End of main()
} // End of class
