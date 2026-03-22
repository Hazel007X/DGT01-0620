package basic;
import javax.swing.*;
public class Command3 {
	public static void main(String[] args) {

		 String name;
		 double salary;
		 double tax = 0;
		 
		 JFrame myWindow = new JFrame();

		 myWindow.setSize(300, 200);
		 myWindow.setTitle("My First Java Program");
		 myWindow.setVisible(true);

		 name = JOptionPane.showInputDialog(myWindow, "What is your name?");
		 salary = Double.parseDouble(JOptionPane.showInputDialog(myWindow, "What is your salary?"));
		 
		 
		 if ( salary >= 50000) {
			 tax = salary * 0.04;
		 	}
		 else if (salary >= 30000) {
			 tax = salary * 0.03;
			}
		 else if (salary >= 10000) {
			 tax = salary * 0.01;
		 	}

		 JOptionPane.showMessageDialog(myWindow, name + " has to pay " + tax + " baht in income tax.");

		 System.exit(0);
		 } 
}