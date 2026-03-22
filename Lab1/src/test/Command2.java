package test;
import javax.swing.*; //comment
public class Command2 {
	public static void main(String[] args) {
		 String gpax;
		 JFrame myWindow = new JFrame();
		 myWindow.setSize(500,500);
		 myWindow.setTitle("What is your GPAX?");
		 myWindow.setVisible(true);
		 
		 gpax = JOptionPane.showInputDialog(myWindow, "What is your GPAX?");
		 JOptionPane.showMessageDialog(null, "Your GPAX is" + gpax);
		 JOptionPane.showMessageDialog(null, "You are excellent!!");
	}

}