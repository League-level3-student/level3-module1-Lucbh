package _03_IntroToStacks;

import java.util.Random;

import java.util.Stack;

import javax.swing.JOptionPane;
import java.util.Stack;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> oof = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		
		Random ran = new Random();
		
		for (int x = 0; x < 100; x++) {
				double r =  ran.nextDouble();
				oof.push(r);	
		}
	
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		
		String s =JOptionPane.showInputDialog("Enter in a number between 1 and 100");
		double d = Double.parseDouble(s);
		String f =JOptionPane.showInputDialog("Enter in a number between 1 and 100");
		double g = Double.parseDouble(f);
		
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		for (int i = 0; i < 100; i++) {
			
			double ball = oof.pop();
			if (ball > d && ball < g || ball > d && ball < g) {
				System.out.println(ball);
			}
		}
		
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
