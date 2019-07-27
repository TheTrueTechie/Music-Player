import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu implements ActionListener {

	MP3Player player = new MP3Player();

	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();

	JButton startButton = new JButton();
	JButton helpButton = new JButton();
	JButton exitButton = new JButton();

	final String startButtonText = "Start";
	final String helpButtonText = "Help";
	final String exitButtonText = "Exit";

	public void startMenu() {
		mainFrame.add(mainPanel);

		mainPanel.add(startButton);
		mainPanel.add(helpButton);
		mainPanel.add(exitButton);

		startButton.setText(startButtonText);
		helpButton.setText(helpButtonText);
		exitButton.setText(exitButtonText);

		startButton.addActionListener(this);
		helpButton.addActionListener(this);
		exitButton.addActionListener(this);

		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
		mainFrame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		if (startButton == buttonPressed) {
			player.startPlayer();
			mainFrame.setVisible(false);
		}

		if (helpButton == buttonPressed) {
			//JOptionPane.showMessageDialog(null, "This is a simple Java Music Player, you can add songs to the music folder.");
		}

		if (exitButton == buttonPressed) {
			System.exit(0);
		}

	}
}
