import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JLabel username;
	private JTextField usernameField;
	private JLabel password;
	private JPasswordField passwordField;
	private JButton login;
	private JButton reset;
	private JLabel alert;
	private JLabel attempt;

	public login() {
		frame = new JFrame("Log-in ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(250, 300);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		frame.add(panel);

		username = new JLabel("Username: ");
		username.setForeground(Color.WHITE);
		panel.add(username);

		usernameField = new JTextField(16);
		panel.add(usernameField);

		password = new JLabel("Password: ");
		password.setForeground(Color.WHITE);
		panel.add(password);

		passwordField = new JPasswordField(16);
		panel.add(passwordField);

		login = new JButton("Log-In");
		login.addActionListener(this);
		login.setBackground(Color.WHITE);
		login.setBorderPainted(false);
		panel.add(login);

		reset = new JButton("Reset");
		reset.addActionListener(this);
		reset.setBackground(Color.WHITE);
		reset.setBorderPainted(false);
		panel.add(reset);


		alert = new JLabel();
		alert.setForeground(Color.CYAN);
		panel.add(alert);
		frame.setVisible(true);
		attempt=new JLabel();
		attempt.setForeground(Color.CYAN);
		panel.add(attempt);

	}
	public static void main(String args[]) {
		new login();
	}
	int  tries= 3;

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==login) {
			String username = usernameField.getText();
			String password = passwordField.getText();

			if (tries!=0){

				if (username.equals("admin") && password.equals("123")) {
					alert.setText("Welcome to your Profile!");
					return;
				}
				else if (username.isEmpty() && password.isEmpty()) {
					alert.setText("Please Input Fields");
					return;

				} else if (username.isEmpty()) {
					alert.setText("Please Input Username");
					return;


				} else if (password.isEmpty()) {
					alert.setText("Please Input Password");
					return;

				}
				else {
					tries--;
					alert.setText("Wrong Username or Password ");
					attempt.setText("You have " + tries+ " attempt(s) left");
				}
			}
			if (tries== 0){
				usernameField.setText("");
				passwordField.setText("");
				usernameField.setEnabled(false);
				passwordField.setEnabled(false);
				reset.setEnabled(false);
				alert.setText("Please Contact the Administrator");

				JOptionPane.showMessageDialog(null, "Account is Locked ", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		 }

		if(e.getSource()==reset){
			usernameField.setText("");
			passwordField.setText("");
			alert.setText("");
			attempt.setText("");
		}
	}
}
