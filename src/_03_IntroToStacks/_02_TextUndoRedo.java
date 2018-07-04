package _03_IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements ActionListener, Comparable{
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	
	JButton a;
	JButton b;
	JFrame c;
	JPanel d;
	
	ArrayList<String> y = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		
		_02_TextUndoRedo bob = new _02_TextUndoRedo();
		bob.createUI();
		
		
		
		
	}

public void createUI() {
		
		a = new JButton("Add name");
		
	
		b = new JButton("View name");
		
		
		
		c = new JFrame();
		d = new JPanel();
		
		d.add(a);
		d.add(b);
		c.add(d);
		
		c.pack();
		c.setVisible(true);
		
		a.addActionListener(this);
		
		b.addActionListener(this);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if(e.getSource().equals(a)) {
			
			String bill = JOptionPane.showInputDialog("Type a name");
			y.add(bill);
			System.out.println(bill);
		}
		
		if(e.getSource().equals(b)) {
			
			System.out.println("viewNamesClicked");
			String listName = "";
			for (int jill = 0; jill < y.size();jill++) {
				listName += y.get(jill) + "\n";
				
			}
				JOptionPane.showMessageDialog(null, listName);
		}
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	


	
}
