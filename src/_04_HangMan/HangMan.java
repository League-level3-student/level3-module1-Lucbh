package _04_HangMan;

import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{

	JFrame c;
	JPanel d;
	Utilities u;
	 String word;
	JLabel man;
	JLabel life;
	JLabel start;
	String s = "";
	String numbs;
	
	int lives = 10;
	
	
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
		
	

		
		
		
		 word =  u.readRandomLineFromFile("src/dictionary.txt");
		 
		 
		
		
		System.out.println(word);
		
		
		
		for (int i = 0; i < word.length(); i++) {
			 
			s += "_" ;
			
			//need to space them out but don't know how
			
		}
		 
		man = new JLabel( " " + s + "      Lives Left:" );
		life = new JLabel("" + lives);
		d.add(man);
		d.add(life);
		
		
		if (word.contains("_") == false && lives > 0) {
			
			System.out.println("You win!!");
			
		}

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
		
		for (int i = 0; i < word.length();i++) {
			
			if (word.charAt(i) == ohlala) {
				
		System.out.println("yay");
			
		s = s.substring(0,i) + e.getKeyChar() + s.substring(i+1, s.length());
		man.setText( " " + s + "      Lives Left:" );
			
			}
			
		}
		
	
		life.setText("" + lives--);
		
		

	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	
		
		
	}
	

	 
	

}
