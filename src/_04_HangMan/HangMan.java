package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	// Inital setup
	Stack<String> words = new Stack<>();
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Utilities tool = new Utilities();
	ArrayList<String> userAnswer = new ArrayList<String>();
	ArrayList<String> realAnswer = new ArrayList<String>();
	String guessText = "";
	String currentWord = "";
	

	public void run() {
		something();
		framestuff();
	}

	private void framestuff() {
		// Setting up frame
		labelCreating();
		frame.add(panel);
		frame.addKeyListener(this);
		panel.add(label);
		frame.setVisible(true);
		frame.setSize(500, 800);
		frame.pack();
	}

	private void labelUpdating() {
		for (int i = 0; i < currentWord.length(); i++) {
			guessText = guessText + userAnswer.get(i);
		}
	}

	private void labelCreating() {
		// Label Stuff
		currentWord = words.pop();
		
		for (int i = 0; i < currentWord.length(); i++) {
			//Making userAnswer
			userAnswer.add("_");
			guessText = guessText + userAnswer.get(i);
			System.out.println();
			//Making realAnswer
			realAnswer.add(currentWord.charAt(i)+"");
			System.out.println(realAnswer.get(i));
		}		
		label.setText(guessText);

		// label.setText(guessText);
	}

	public void something() {
		// Getting and pushing the words
		int userinput = Integer.parseInt(JOptionPane.showInputDialog("Give me a number (Up to 266)"));
		for (int i = 0; i < userinput; i++) {
			if (words.contains(tool.readRandomLineFromFile("dictionary.txt"))) {
				// nothing happens if string is already in stack
			} else {
				// if it's not in stack then it's pushed
				words.push(tool.readRandomLineFromFile("dictionary.txt"));
			}

		}
		
	}

	public static void main(String[] args) {
		new HangMan().run();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyCode());
		for (int i = 0; i <currentWord.length(); i++) {
			if(arg0.getKeyChar()+""==realAnswer.get(i)) {
		//	System.out.println(realAnswer.get(i));
			}
		}
		//System.out.println(arg0.getKeyChar());
		labelUpdating();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
