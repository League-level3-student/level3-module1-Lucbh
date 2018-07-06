package _04_HangMan;

import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangMan implements KeyListener{

	JFrame c;
	JPanel d;
	 Utilities u;
	 String word;
	JLabel man;
	String s = "";
	
	
	
	public static void main(String[] args) {
		
		

		System.out.println("Hello");

		HangMan Lucas = new HangMan();

		Lucas.createUI();
		Lucas.play();

	}

	public void createUI() {

		c = new JFrame();

		c.setVisible(true);
		c.setSize(500, 100);
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
			 
			s += "_";
			
		}
		 
		man = new JLabel("The word is " + word + " " + s + " Lives Left:");
		d.add(man);

	}
	
	public void update() {
		
		
		
		
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
		man.setText(s);
			
			}
		}
		// TODO Auto-generated method stub
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
