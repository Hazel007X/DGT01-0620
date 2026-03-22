package basic;
	import javax.swing.*;
public class Command1 {
	 public static void main(String[] args) {

	 String name, grade1, grade2, msg;
	 int graduateYear;
	 float GPA;
	 JFrame myWindow = new JFrame();

	 myWindow.setSize(300, 200);
	 myWindow.setTitle("My First Java Program");
	 myWindow.setVisible(true);

	 name = JOptionPane.showInputDialog(myWindow, "What is your name?");
	 grade1 = JOptionPane.showInputDialog(myWindow, "What is your grade[0-4] in Computer Programming?");
	 grade2 = JOptionPane.showInputDialog(myWindow, "What is your grade[0-4] in Software Development?");

	 GPA = (Float.parseFloat(grade1) + Float.parseFloat(grade2))/2;

	 msg = name + " is expected to get grade " + GPA + " in OOP";

	 if (GPA < 2.0)
	 graduateYear = 5;
	 else
	 graduateYear = 4;

	 msg = msg + " and graduaate in the " + graduateYear + "th year!!";
	 JOptionPane.showMessageDialog(myWindow, msg);

	 System.exit(0);
	 }
}