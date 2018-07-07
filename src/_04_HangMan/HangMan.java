package _04_HangMan;

import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {

	JFrame c;
	JPanel d;
	Utilities u;
	String word;
	JLabel man;
	JLabel life;
	JLabel start;
	String s = "";
	String numbs;

 int lives;

	public static void main(String[] args) {

		System.out.println("Hello");

		HangMan Lucas = new HangMan();

		Lucas.start();
		Lucas.createUI();
		
		
			
		Lucas.play();
		
		

	}

	public void createUI() {

		c = new JFrame();

		c.setVisible(true);
		c.setSize(300, 100);
		c.addKeyListener(this);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		d = new JPanel();

		c.add(d);

	}

	public void play() {
		
		u = new Utilities();
		lives = 10;

		word = u.readRandomLineFromFile("src/dictionary.txt");

		System.out.println(word);
		
		s = "";
		
		for (int i = 0; i < word.length(); i++) {

			s += "_ ";

			// need to space them out but don't know how

		}

		man = new JLabel(" " + s + "      Lives Left:");
		life = new JLabel("" + lives);
		d.add(man);
		d.add(life);
		
	
	

	}

	public void start() {

		//numbs = JOptionPane.showInputDialog("Enter a number");

	}
	
	
		
		
		
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {

		char ohlala = e.getKeyChar();

		System.out.println(e.getKeyChar());

		for (int i = 0; i < word.length()*2; i+=2) {

			if (word.charAt(i/2) == ohlala) {

			
				s = s.substring(0, i) + e.getKeyChar() + s.substring(i + 1, s.length());
				man.setText(" " + s + "      Lives Left:");
				
				
			}

		}
		
		
		if (!s.contains("_") && lives > 0) {
			
			System.out.println("WIN");
			int choose = JOptionPane.showOptionDialog(null, "Do you want to play again?", "YOU WIN!", JOptionPane.YES_NO_OPTION,  JOptionPane.QUESTION_MESSAGE, null, new String[] {"Yes","No"}, null);
			
			
			if (choose == 1) {
				
				System.exit(0);
				
				
			}
			
			if (choose == 0) {
				
				d.removeAll();
				d.updateUI();
				
				
				
					play();
					
				
			
				
				
			
				
			}
			
			
		}
		
		if (lives == 0) {
			
			int i = JOptionPane.showConfirmDialog(null, "You lose! The word was " + word + ".\n Do you want to play again?");
			
			if (i == 1) {
				
	
				System.exit(0);
				
				
			}
			
			if (i == 0) {
				
				
				d.removeAll();
				d.updateUI();
				
				
				
					play();
					
				
			
				
				
			}
			
			
			
		}
	

		life.setText("" + lives--);


	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
