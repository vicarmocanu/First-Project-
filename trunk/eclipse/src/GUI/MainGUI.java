package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
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
import javax.swing.BoxLayout;
import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;

public class MainGUI extends JFrame {

	private JPanel contentPane;

	ManagerMenu managerMenu;
	EmployeeMenu employeeMenu;

	boolean newAcc;
	ArrayList<ArrayList<String>> userpass = new ArrayList<ArrayList<String>>();
	int login = 0;
	String error = "";
	private JPanel createAdminPanel;
	private JLabel label;
	private JSeparator separator;
	private JLabel label_1;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JLabel label_2;
	private JLabel label_3;
	private JPasswordField repeatPasswordField;
	private JButton createButton;
	private JButton clearButton;
	private JSeparator separator_1;
	private JPanel mainMenuPanel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblMainMenu;
	private JButton btnCreateManager;
	private JButton btnQuitSystem;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
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
	public MainGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		createAdminPanel = new JPanel();
		contentPane.add(createAdminPanel, "card_createAdmin");
		createAdminPanel.setLayout(new MigLayout("",
				"[308px][][7px][20px][][28px][311px]",
				"[14px][4px][20px][][][20px][20px][23px][4px]"));

		label = new JLabel("CREATE ADMIN");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		createAdminPanel.add(label, "cell 1 0 4 1,alignx center,aligny top");

		separator = new JSeparator();
		createAdminPanel.add(separator, "cell 0 1 7 1,grow");

		label_1 = new JLabel("USER NAME:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		createAdminPanel.add(label_1, "cell 1 2,alignx right,aligny center");

		usernameField = new JTextField();
		usernameField.setColumns(20);
		createAdminPanel.add(usernameField, "cell 4 2,alignx left,aligny top");

		label_2 = new JLabel("PASSWORD:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		createAdminPanel.add(label_2, "cell 1 3,alignx right,aligny center");

		passwordField = new JPasswordField();
		passwordField.setColumns(20);
		createAdminPanel.add(passwordField, "cell 4 3,alignx left,aligny top");

		label_3 = new JLabel("REPEAT PASSWORD:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		createAdminPanel.add(label_3, "cell 1 4,alignx right,aligny center");

		repeatPasswordField = new JPasswordField();
		repeatPasswordField.setColumns(20);
		createAdminPanel.add(repeatPasswordField,
				"cell 4 4,alignx left,aligny top");

		createButton = new JButton("CREATE");
		createButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (usernameField.getText().equals("")
						|| passwordField.getPassword().length == 0
						|| repeatPasswordField.getPassword().length == 0) {
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
					pass = repeatPasswordField.getPassword();
					String repeatPassword = "";
					for (char c : pass) {
						repeatPassword = repeatPassword + c;
					}
					if (!password.equals(repeatPassword)) {
						JOptionPane.showMessageDialog(null,
								"Passwords do not match!", "Input error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						userandpass.add(usernameField.getText());
						userandpass.add(password);
						userpass.add(size, userandpass);
						JOptionPane.showMessageDialog(null, "Account: '"
								+ usernameField.getText()
								+ "' has been created!", "Successful",
								JOptionPane.INFORMATION_MESSAGE);

						rootPane.setDefaultButton(null);
						CardLayout cl = (CardLayout) contentPane.getLayout();
						cl.show(contentPane, "card_mainMenu");
					}

				}
			}
		});
		createButton.setMnemonic(KeyEvent.VK_ENTER);
		createAdminPanel.add(createButton, "cell 1 6,growx,aligny top");
		JRootPane rootPane = createAdminPanel.getRootPane();
		rootPane.setDefaultButton(createButton);

		clearButton = new JButton("CLEAR");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usernameField.setText("");
				passwordField.setText("");
				repeatPasswordField.setText("");
			}
		});
		createAdminPanel.add(clearButton, "cell 4 6,growx,aligny top");

		btnNewButton_2 = new JButton("QUIT SYSTEM");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int reply = JOptionPane.showConfirmDialog(null,
						"Are you sure you want to close?", "Close?",
						JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		createAdminPanel.add(btnNewButton_2, "cell 1 7 4 1,growx");

		separator_1 = new JSeparator();
		createAdminPanel.add(separator_1, "cell 0 8 7 1,grow");

		mainMenuPanel = new JPanel();
		mainMenuPanel.setVisible(false);
		contentPane.add(mainMenuPanel, "card_mainMenu");
		mainMenuPanel.setLayout(new MigLayout("", "[500px][][500px]",
				"[][][][20px][][20px][]"));

		lblMainMenu = new JLabel("MAIN MENU");
		mainMenuPanel.add(lblMainMenu, "cell 1 0,alignx center,aligny center");

		btnNewButton = new JButton("Manager Menu");

		mainMenuPanel.add(btnNewButton, "cell 1 1,growx,aligny top");

		btnNewButton_1 = new JButton("Employee Menu");

		mainMenuPanel.add(btnNewButton_1, "cell 1 2,growx,aligny top");

		btnCreateManager = new JButton("Create Manager");
		mainMenuPanel.add(btnCreateManager, "cell 1 4,growx");

		btnQuitSystem = new JButton("Quit System");
		btnQuitSystem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int reply = JOptionPane.showConfirmDialog(null,
						"Are you sure you want to close?", "Close?",
						JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		mainMenuPanel.add(btnQuitSystem, "cell 1 6,growx,aligny center");
	}
}
