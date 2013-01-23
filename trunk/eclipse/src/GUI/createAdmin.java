package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JProgressBar;

import UI.EmployeeMenu;
import UI.ManagerMenu;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.KeyEvent;

public class createAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JSeparator separator;
	private JSeparator separator_1;
	private JPasswordField passwordField_1;
	private JPanel panel;

	ManagerMenu managerMenu;
	EmployeeMenu employeeMenu;

	boolean newAcc;
	ArrayList<ArrayList<String>> userpass = new ArrayList<ArrayList<String>>();
	int login = 0;
	String error = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createAdmin frame = new createAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public createAdmin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBounds(10, 11, 674, 170);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblCreateAdmin = new JLabel("CREATE ADMIN");
		lblCreateAdmin.setBounds(281, 11, 89, 14);
		panel.add(lblCreateAdmin);
		lblCreateAdmin.setHorizontalAlignment(SwingConstants.CENTER);

		separator = new JSeparator();
		separator.setBounds(0, 36, 674, 4);
		panel.add(separator);

		JLabel lblUserName = new JLabel("USER NAME:");
		lblUserName.setBounds(177, 48, 131, 14);
		panel.add(lblUserName);
		lblUserName.setHorizontalAlignment(SwingConstants.RIGHT);

		textField = new JTextField();
		textField.setBounds(315, 45, 137, 20);
		panel.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(315, 70, 137, 20);
		panel.add(passwordField);

		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setBounds(177, 73, 131, 14);
		panel.add(lblPassword);
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);

		JLabel lblRepeatPassword = new JLabel("REPEAT PASSWORD:");
		lblRepeatPassword.setBounds(177, 98, 131, 14);
		panel.add(lblRepeatPassword);
		lblRepeatPassword.setHorizontalAlignment(SwingConstants.RIGHT);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(315, 95, 137, 20);
		panel.add(passwordField_1);

		JButton btnLogin = new JButton("CREATE");
		
		btnLogin.setMnemonic(KeyEvent.VK_ENTER);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (textField.getText().equals("")
						|| passwordField.getPassword().length == 0
						|| passwordField_1.getPassword().length == 0) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {

					int size = userpass.size();
					ArrayList<String> userandpass = new ArrayList<String>();
					char[] pass = passwordField.getPassword();
					String password = "";
					for (char c : pass) {
						password = password + c;
					}
					pass = passwordField_1.getPassword();
					String password_1 = "";
					for (char c : pass) {
						password_1 = password_1 + c;
					}
					if (!password.equals(password_1)) {
						JOptionPane.showMessageDialog(null,
								"Passwords do not match!", "Input error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						userandpass.add(textField.getText());
						userandpass.add(password);
						userpass.add(size, userandpass);
					}
					System.out.println(password);
					System.out.println(password_1);

				}
			}
		});
		btnLogin.setBounds(246, 125, 89, 23);
		panel.add(btnLogin);

		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(363, 125, 89, 23);
		panel.add(btnClear);

		separator_1 = new JSeparator();
		separator_1.setBounds(0, 157, 674, 4);
		panel.add(separator_1);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				textField.setText("");
				passwordField.setText("");
				passwordField_1.setText("");
			}
		});
	}
}
