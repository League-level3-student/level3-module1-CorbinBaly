package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener {
	Song songRunner = new Song("Ladies and Gentlmen sound.mp3");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton surpriseMe = new JButton();
	Random rand = new Random();
	ArrayList<Song> songs = new ArrayList<>();
	Song gotHim = new Song("ladies and Gentlmen sound.mp3");
	Song togetherNow;
	Song begoneThots;
	Song Deutschland;

	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		;/**
			 * 2. Congratulations on completing the sound check! * Now we want to make an
			 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
			 * "Surprise Me!" button that will play a random song when it is clicked. * If
			 * you're really cool, you can stop all the songs, before playing a new one on
			 * subsequent button clicks.
			 */
		Deutschland = new Song("https://www.youtube.com/watch?v=bAORrEZJsaI");
		begoneThots = new Song("https://www.youtube.com/watch?v=W6VpbMm-n5Q");
		togetherNow = new Song("https://www.youtube.com/watch?v=73lj5qJbrms");
		gotHim = new Song("ladies and Gentlmen sound.mp3");
	}

	private void run() {
		surpriseMe.addActionListener(this);
		addSongs();
		randomSong();
		frame.add(panel);
		panel.add(surpriseMe);
		frame.setTitle("IPod Shuffle");
		frame.pack();
	}

	private void randomSong() {
		int random = rand.nextInt(songs.size());
		songs.get(random).play();
	}

	private void addSongs() {
		songs.add(gotHim);
		songs.add(togetherNow);
		songs.add(begoneThots);
		songs.add(Deutschland);

	}

	public static void main(String[] args) {
		new _06_IPodShuffle().run();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == surpriseMe) {
			randomSong();
		}
	}
}