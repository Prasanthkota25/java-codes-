package Weblogin;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcomepage {
	JFrame frame = new JFrame();
	JLabel WelcomeLable = new JLabel("Hello Welcome ");

	Welcomepage(String userId) {

		WelcomeLable.setBounds(0, 0, 200, 35);
		WelcomeLable.setFont(new Font(null, Font.PLAIN, 25));
		WelcomeLable.setText("Hello..." + userId);

		frame.add(WelcomeLable);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420, 420);
		frame.setVisible(true);
	}
}
