package basic;
import javax.swing.*;
public class Command3 {
	public static void main(String[] args) {
		String name1, name2, name3, name4;
		JFrame myWindow = new JFrame();
		 myWindow.setSize(300, 200);
		 myWindow.setTitle("Message");
		 myWindow.setVisible(true);
		 
		 name1 = JOptionPane.showInputDialog(myWindow, "What is your name?");		 
		 name2 = JOptionPane.showInputDialog(myWindow, "How old are you?");		 
		 name3 = JOptionPane.showInputDialog(myWindow, "What is your occupation?");		 
		 name4 = JOptionPane.showInputDialog(myWindow, "What is your special skill?");	
		 
		 JOptionPane.showMessageDialog(myWindow, "Name: " + name1+" \n"+"Age: "+name2+"\n"+"occupation: "+name3+"\n"+"Special Skill: "+name4);

	}
}