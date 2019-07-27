import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MP3Player implements ActionListener {
	JFrame playerFrame = new JFrame();
	JPanel playerPanel = new JPanel();

	JComboBox musicBox = new JComboBox();

	JButton playButton = new JButton();
	JButton pauseButton = new JButton();

	final String playButtonText = "►";
	final String pauseButtonText = "❚❚";

	public Files files = new Files();
	public Reader reader = new Reader();
	public MP3s currentSong; 

	public int songPos = 0;

	public void startPlayer() {
		playerFrame.add(playerPanel);

		makeJComboBox();
		playerPanel.add(playButton);
		playerPanel.add(pauseButton);

		playButton.setText(playButtonText);
		pauseButton.setText(pauseButtonText);

		playButton.addActionListener(this);
		pauseButton.addActionListener(this);

		playerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		playerFrame.setVisible(true);
		playerFrame.pack();

		files.firstTimeSetup();
		reader.readFiles(files.getF());

	}

	private void makeJComboBox() {
		musicBox = new JComboBox(reader.getCompliedSongsForArray());
		playerPanel.add(musicBox);
		musicBox.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (playButton == buttonPressed) {
			// for (int i = 0; i < reader.getCompliedSongsForArray().length; i++) {
//				if (reader.getCompliedSongsForMP3s().contains(reader.getCompliedSongsForArray()[musicBox.getSelectedIndex()])) {
//
//					reader.getCompliedSongsForMP3s().get(songPos).play();
//					songPos++;
//				} else {
//					songPos++;
//				}
			// musicBox.setSelectedIndex(songPos);

			currentSong = reader.getCompliedSongsForMP3s().get(0);
			currentSong.play();
			//songPos++;
			// }

		}

		if (pauseButton == buttonPressed) {
			currentSong.stop();
		}

	}

}
