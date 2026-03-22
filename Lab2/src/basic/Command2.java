package basic;
import javax.swing.*;
public class Command2 {
	public static void main(String[] args) {

		 String name, message, Score; 
		 
		 JFrame myWindow = new JFrame();

		 myWindow.setSize(300, 200);
		 myWindow.setTitle("My First Java Program");
		 myWindow.setVisible(true);

		 name = JOptionPane.showInputDialog(myWindow, "What is your name?");
		 Score = JOptionPane.showInputDialog(myWindow, "What is your score inSoftware Development?");
		 
		 int score = Integer.parseInt(Score);
		 if (score > 85)
			 message = name + " will get grade A!";
		 else if (score > 75)
			 message = name + " will get grade B!";
		 else if (score > 65)
			 message = name + " will get grade C!";
		 else if (score > 55)
			 message = name + " will get grade D!";
		 else
			 message = name + " will get grade F!";

		 JOptionPane.showMessageDialog(myWindow, message);

		 System.exit(0);
		 } 
}