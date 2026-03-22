package test;
import javax.swing.*;
public class Command1 {
	public static void main(String[] args) {
		String name;
		JFrame myWindow = new JFrame();
		 myWindow.setSize(300, 200);
		 myWindow.setTitle("My First Java Program");
		 myWindow.setVisible(true);
		 name = JOptionPane.showInputDialog(myWindow, "What is your name?");		 
		 JOptionPane.showMessageDialog(null, "Hello, " + name);
	}
}