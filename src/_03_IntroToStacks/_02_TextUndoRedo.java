package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

	Stack<Integer> allkeys = new Stack<>();
	String currentlist = new String();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	private void run() {
		basicallyeverything();
	}

	public static void main(String[] args) {
		_02_TextUndoRedo runner = new _02_TextUndoRedo();
		runner.run();
	}
	
	private void basicallyeverything() {
		frame.setVisible(true);
		frame.setSize(800, 500);
		frame.add(panel);
		panel.add(label);
		label.addKeyListener(this);
		label.setSize(700, 300);
		label.setText("Hi");
		frame.pack();
	}

	private void refreshtextD() {
		for (int i = 0; i <= allkeys.capacity()+1; i++) {
			label.setText(label.getText()+allkeys.search(i));
		}
		
	}

	private void refreshtextA() {

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() != 8) {
			int usertyped = arg0.getKeyCode();
			allkeys.push(usertyped);
			refreshtextA();
		} else {
			allkeys.pop();
			refreshtextD();
		}
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
