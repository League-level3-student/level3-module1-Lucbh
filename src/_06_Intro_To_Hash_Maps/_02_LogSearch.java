1package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener{

JFrame frame;
JPanel panel;
JButton button1;
JButton button2;
JButton button3;


HashMap<Integer, String> dog = new HashMap<Integer, String>();


	public static void main(String[] args) {

	
new _02_LogSearch().createUI();





	}
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. 
	 * 
	 * Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */

 void createUI() {
		// TODO Auto-generated method stub
	 
	 frame = new JFrame();
	 panel = new JPanel();
	 button1 = new JButton("Add Entry");
	 button2 = new JButton("Search by ID");
	 button3 = new JButton("View List");
	 
	 frame.add(panel);
	 panel.add(button1);
	 panel.add(button2);
	 panel.add(button3);
	 
	 button1.addActionListener(this);
	 button2.addActionListener(this);
	 button3.addActionListener(this);

	 
	 frame.setSize(500, 500);
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.pack();
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == button1) {
		
		String a = JOptionPane.showInputDialog("Enter an ID number");
		int c = Integer.parseInt(a);
		String b = JOptionPane.showInputDialog("Enter a name");

		dog.put(c,b);
		
	
		
	}
	
	if (e.getSource() == button2) {
	
	String fire = JOptionPane.showInputDialog("Enter the ID number");
	int water = Integer.parseInt(fire);
	
	System.out.println(dog.get(water));
}
	
	if (e.getSource() == button3) {
		
	
	
		

		
		for(Integer i : dog.keySet()){
				String cat = ("Id:" + i + " Name:" + dog.get(i));
				System.out.println(cat);
		}
		
		
		
		//JOptionPane.showMessageDialog(null,cat);
	}
}

}