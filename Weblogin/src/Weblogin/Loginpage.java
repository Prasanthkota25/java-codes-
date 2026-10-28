package Weblogin;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Loginpage implements ActionListener {

	JFrame frame = new JFrame("Login Page");

	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");

	JTextField userIdField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();

	JLabel userIdLabel = new JLabel("User ID:");
	JLabel userPasswordLabel = new JLabel("Password:");
	JLabel messageLabel = new JLabel();

	HashMap<String, String> logininfo;

	private Object password;

	Loginpage(HashMap<String, String> logininfoOriginal) {

		logininfo = logininfoOriginal;

		userIdLabel.setBounds(50, 100, 75, 25);
		userPasswordLabel.setBounds(50, 150, 75, 25);

		userIdField.setBounds(125, 100, 200, 25);
		userPasswordField.setBounds(125, 150, 200, 25);

		loginButton.setBounds(125, 200, 100, 25);
		resetButton.setBounds(225, 200, 100, 25);

		loginButton.addActionListener(this);
		resetButton.addActionListener(this);

		messageLabel.setBounds(125, 250, 250, 35);
		messageLabel.setFont(new Font(null, Font.BOLD, 18));

		frame.add(userIdLabel);
		frame.add(userPasswordLabel);
		frame.add(userIdField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(messageLabel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == resetButton) {
			userIdField.setText("");
			userPasswordField.setText("");
			messageLabel.setText("");
		}

		if (e.getSource() == loginButton) {

			String userId = userIdField.getText();
			String password = String.valueOf(userPasswordField.getPassword());

			if (logininfo.containsKey(userId)) {

				if (logininfo.get(userId).equals(password)) {
					messageLabel.setForeground(Color.GREEN);
					messageLabel.setText("Login Successful...");
					frame.dispose();
					Welcomepage Welcomepage = new Welcomepage(userId);
				} else {
					messageLabel.setForeground(Color.RED);
					messageLabel.setText("Wrong Password!");
				}

			} else {
				messageLabel.setForeground(Color.RED);
				messageLabel.setText("User not found!");
			}
		}
	}
}