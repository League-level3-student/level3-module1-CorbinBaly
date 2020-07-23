package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {

		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class
		Stack<Double> thestack = new Stack<>();
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i <= 100; i++) {
			Random rand = new Random();
			int firstrandomnumber = rand.nextInt(101);
			double secondrandomnumber = Double.valueOf(firstrandomnumber);
			thestack.push(secondrandomnumber);
		}
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String first = JOptionPane.showInputDialog("Enter a number between 0 and 100");
		String second = JOptionPane.showInputDialog("Enter a number between 0 and 100");
		double realfirst = Double.valueOf(first);
		double readlsecond = Double.valueOf(second);
		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is
		// between the two numbers entered by the user, print it to the screen.

		for (int i = 0; i <= 100; i++) {
			if (thestack.get(0) > realfirst && thestack.get(0) < readlsecond) {
				System.out.println(thestack.get(0));
			}

			else if (thestack.get(0) < realfirst && thestack.get(0) > readlsecond) {
				System.out.println(thestack.get(0));
			}
			thestack.pop();
		}

		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
