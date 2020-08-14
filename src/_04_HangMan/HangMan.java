package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
	public void run(){
		something();
		framestuff();
	}
	
	
	private void framestuff() {
		// Setting up frame

		frame.add(panel);
		frame.addKeyListener(this);
		panel.add(label);
		frame.setVisible(true);
		frame.setSize(500, 800);
		frame.pack();
		labelUpdating();
		
	}
	
	private void labelUpdating() {
		//Label Stuff
		int charPlace = 0;
				String actualText = words.pop();
	
				String guessText = actualText.replaceAll(regex, replacement) ;
				
				label.setText(guessText);
	}d3
	
	public void something() {
		// Getting and pushing the words
				int userinput = Integer.parseInt(JOptionPane.showInputDialog("Give me a number (Up to 266)"));
				for (int i = 0; i < userinput; i++) {
					if (words.contains(tool.readRandomLineFromFile("dictionary.txt"))) {
						// nothing happens if string is already in stack
					} else {
						// if it's not in stack then it's pushed
						words.push(tool.readRandomLineFromFile("dictionary.txt"));
						System.out.println(i);
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
