package _01_IntroToArrayLists;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.w3c.dom.NameList;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton add = new JButton();
	JButton view = new JButton();
	ArrayList<String> nameList = new ArrayList<String>();
	String nameadded;

	public static void main(String[] args) {
		_02_GuestBook runner = new _02_GuestBook();
		runner.createUI();

	}

	private void createUI() {

		frame.add(panel);
		panel.add(add);
		panel.add(view);
		add.setText("Add Name");
		view.setText("View Names");
		frame.setVisible(true);
		frame.pack();
		add.addActionListener(this);
		view.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == view) {
			String allStrings = "";
			for (String s : nameList) {
				allStrings = allStrings + "   " + s;
			}
			JOptionPane.showMessageDialog(null, allStrings);
		} else if (e.getSource() == add) {
			nameadded = JOptionPane.showInputDialog("Add a name");
			nameList.add(nameadded);
		}
	}

}
