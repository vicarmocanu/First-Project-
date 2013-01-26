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
	private JButton managerMenuBtn;
	private JButton employeeMenuBtn;
	private JLabel lblMainMenu;
	private JButton createManagerBtn;
	private JButton quitSystemBtn;
	private JButton quitSystemBtn__1;
	private JPanel contractorControlMenuPanel;
	private JLabel lblContractorControlMenu;
	private JButton btnCreate;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JButton btnListAll;
	private JButton btnFindContractor;
	private JButton btnBackToManager;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JPanel employeeControlMenuPanel;
	private JTextField usernameLogin;
	private JPasswordField passwordLogin;
	private JPanel discountControlMenuPanel;
	private JLabel lblDiscountControlMenu;
	private JSeparator separator_16;
	private JButton btnAddNewCategory;
	private JButton btnUpdateExistingCategory;
	private JButton btnDeleteCategory;
	private JSeparator separator_17;
	private JButton btnListAll_2;
	private JButton btnSetUpCategory;
	private JSeparator separator_18;
	private JButton btnBackToEmployee;
	private JButton btnCancel;
	private JSeparator separator_13;
	private JSeparator separator_14;

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
		contentPane.add(createAdminPanel, "card_createAdminPanel");
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

						usernameField.setText("");
						passwordField.setText("");
						repeatPasswordField.setText("");
						btnCancel.setEnabled(true);
						CardLayout cl = (CardLayout) contentPane.getLayout();
						cl.show(contentPane, "card_mainMenuPanel");
					}

				}
			}
		});
		createButton.setMnemonic(KeyEvent.VK_ENTER);
		createAdminPanel.add(createButton, "cell 1 6,growx,aligny top");
		JRootPane rootPane = createAdminPanel.getRootPane();

		clearButton = new JButton("CLEAR");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				usernameField.setText("");
				passwordField.setText("");
				repeatPasswordField.setText("");
			}
		});
		createAdminPanel.add(clearButton, "cell 4 6,growx,aligny top");

		quitSystemBtn__1 = new JButton("QUIT SYSTEM");
		quitSystemBtn__1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int reply = JOptionPane.showConfirmDialog(null,
						"Are you sure you want to close?", "Close?",
						JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		createAdminPanel.add(quitSystemBtn__1, "cell 1 7,growx");

		btnCancel = new JButton("CANCEL");
		btnCancel.setEnabled(false);

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_mainMenuPanel");
			}
		});
		createAdminPanel.add(btnCancel, "cell 4 7,growx");

		separator_1 = new JSeparator();
		createAdminPanel.add(separator_1, "cell 0 8 7 1,grow");

		mainMenuPanel = new JPanel();
		mainMenuPanel.setVisible(false);
		contentPane.add(mainMenuPanel, "card_mainMenuPanel");
		mainMenuPanel.setLayout(new MigLayout("", "[1000px][][1000px]",
				"[][][][20px][][20px][]"));

		lblMainMenu = new JLabel("MAIN MENU");
		mainMenuPanel.add(lblMainMenu, "cell 1 0,alignx center,aligny center");

		managerMenuBtn = new JButton("Manager Menu");
		managerMenuBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_managerMenuPanel");
			}
		});

		mainMenuPanel.add(managerMenuBtn, "cell 1 1,growx,aligny top");

		employeeMenuBtn = new JButton("Employee Menu");
		employeeMenuBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		mainMenuPanel.add(employeeMenuBtn, "cell 1 2,growx,aligny top");

		createManagerBtn = new JButton("Create Manager");
		createManagerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_createAdminPanel");
			}
		});
		mainMenuPanel.add(createManagerBtn, "cell 1 4,growx");

		quitSystemBtn = new JButton("Quit System");
		quitSystemBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int reply = JOptionPane.showConfirmDialog(null,
						"Are you sure you want to close?", "Close?",
						JOptionPane.YES_NO_OPTION);
				if (reply == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		mainMenuPanel.add(quitSystemBtn, "cell 1 6,growx,aligny center");

		JPanel managerMenuPanel = new JPanel();
		contentPane.add(managerMenuPanel, "card_managerMenuPanel");
		managerMenuPanel.setLayout(new BoxLayout(managerMenuPanel,
				BoxLayout.Y_AXIS));

		final JPanel loginPanel = new JPanel();
		managerMenuPanel.add(loginPanel);
		loginPanel.setLayout(new MigLayout("", "[1000px][][][1000px]", "[][][][][][]"));

		JLabel lblLogin = new JLabel("LOGIN");
		loginPanel.add(lblLogin, "cell 1 0 2 1,alignx center");
		
		separator_13 = new JSeparator();
		loginPanel.add(separator_13, "cell 0 1 4 1,growx");

		JLabel lblUserName = new JLabel("USER NAME:");
		loginPanel.add(lblUserName, "cell 1 2,alignx trailing");

		usernameLogin = new JTextField();
		loginPanel.add(usernameLogin, "cell 2 2,growx");
		usernameLogin.setColumns(10);

		JLabel lblPassword = new JLabel("PASSWORD:");
		loginPanel.add(lblPassword, "cell 1 3,alignx trailing");

		passwordLogin = new JPasswordField();
		loginPanel.add(passwordLogin, "cell 2 3,growx");

		JButton btnCalcel = new JButton("CANCEL");
		loginPanel.add(btnCalcel, "cell 2 4");

		final JPanel managerPanel = new JPanel();
		managerPanel.setVisible(false);
		managerMenuPanel.add(managerPanel);
		managerPanel.setLayout(new MigLayout("", "[1000px][][1000px]",
				"[][][][][][][][][]"));
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginPanel.setVisible(false);
				managerPanel.setVisible(true);
			}
		});
		loginPanel.add(btnLogin, "cell 1 4");
		
		separator_14 = new JSeparator();
		loginPanel.add(separator_14, "cell 0 5 4 1,growx");
		JLabel lblManagerMenu = new JLabel("MANAGER MENU");
		managerPanel.add(lblManagerMenu, "cell 1 0,alignx center");

		JSeparator separator_8 = new JSeparator();
		managerPanel.add(separator_8, "cell 0 1 3 1,growx");

		JButton btnContractorControlMenu = new JButton(
				"CONTRACTOR CONTROL MENU");
		btnContractorControlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_conctactorControlMenuPanel");
			}
		});
		managerPanel.add(btnContractorControlMenu, "cell 1 2,growx");

		JButton btnNewButton_3 = new JButton("EMPLOYEE CONTROL MENU");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_employeeControlMenuPanel");
			}
		});
		managerPanel.add(btnNewButton_3, "cell 1 3,growx");

		JButton btnDiscouuntControlMenu = new JButton("DISCOUNT CONTROL MENU");
		btnDiscouuntControlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_discountControlMenuPanel");
			}
		});
		managerPanel.add(btnDiscouuntControlMenu, "cell 1 4,growx");

		JButton btnSetPriceFor = new JButton("SET PRICE FOR PRODUCTS");
		managerPanel.add(btnSetPriceFor, "cell 1 5,growx");

		JSeparator separator_9 = new JSeparator();
		managerPanel.add(separator_9, "cell 0 6 3 1,growx");

		JButton btnBackToMain = new JButton("BACK TO MAIN MENU");
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_mainMenuPanel");
			}
		});
		managerPanel.add(btnBackToMain, "cell 1 8,growx");

		discountControlMenuPanel = new JPanel();
		contentPane.add(discountControlMenuPanel,
				"card_discountControlMenuPanel");
		discountControlMenuPanel.setLayout(new MigLayout("",
				"[1000px][][1000px]", "[][][][][][][][][][]"));

		lblDiscountControlMenu = new JLabel("DISCOUNT CONTROL MENU");
		discountControlMenuPanel.add(lblDiscountControlMenu,
				"cell 1 0,alignx center");

		separator_16 = new JSeparator();
		discountControlMenuPanel.add(separator_16, "cell 0 1 3 1,growx");

		btnAddNewCategory = new JButton("ADD NEW CATEGORY");
		discountControlMenuPanel.add(btnAddNewCategory, "cell 1 2,growx");

		btnUpdateExistingCategory = new JButton("UPDATE EXISTING CATEGORY");
		discountControlMenuPanel.add(btnUpdateExistingCategory,
				"cell 1 3,growx");

		btnDeleteCategory = new JButton("DELETE CATEGORY");
		discountControlMenuPanel.add(btnDeleteCategory, "cell 1 4,growx");

		separator_17 = new JSeparator();
		discountControlMenuPanel.add(separator_17, "cell 0 5 3 1,growx");

		btnListAll_2 = new JButton("LIST ALL");
		discountControlMenuPanel.add(btnListAll_2, "cell 1 6,growx");

		btnSetUpCategory = new JButton("SET UP CATEGORY FOR CUSTOMER");
		discountControlMenuPanel.add(btnSetUpCategory, "cell 1 7,growx");

		separator_18 = new JSeparator();
		discountControlMenuPanel.add(separator_18, "cell 0 8 3 1,growx");

		btnBackToEmployee = new JButton("BACK TO MANAGER MENU");
		btnBackToEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_managerMenuPanel");
			}
		});
		discountControlMenuPanel.add(btnBackToEmployee, "cell 1 9,growx");

		contractorControlMenuPanel = new JPanel();
		contentPane.add(contractorControlMenuPanel,
				"card_conctactorControlMenuPanel");
		contractorControlMenuPanel.setLayout(new MigLayout("", "[1000px][][1000px]", "[][][][][][][][][][][][][][][]"));

		lblContractorControlMenu = new JLabel("CONTRACTOR CONTROL MENU");
		contractorControlMenuPanel.add(lblContractorControlMenu,
				"cell 1 0,alignx center");

		separator_2 = new JSeparator();
		contractorControlMenuPanel.add(separator_2, "cell 0 1 3 1,growx");
		
				btnCreate = new JButton("CREATE");
				contractorControlMenuPanel.add(btnCreate, "cell 1 2,grow");
		
				btnUpdate = new JButton("UPDATE");
				contractorControlMenuPanel.add(btnUpdate, "cell 1 3,grow");
		
				btnDelete = new JButton("DELETE");
				contractorControlMenuPanel.add(btnDelete, "cell 1 4,grow");
		
				separator_3 = new JSeparator();
				contractorControlMenuPanel.add(separator_3, "cell 0 5 3 1,grow");
		
				btnListAll = new JButton("LIST ALL");
				contractorControlMenuPanel.add(btnListAll, "cell 1 6,growx");
		
				btnFindContractor = new JButton("FIND CONTRACTOR");
				contractorControlMenuPanel.add(btnFindContractor, "cell 1 7,growx");
		
				separator_4 = new JSeparator();
				contractorControlMenuPanel.add(separator_4, "cell 0 8 3 1,grow");
		
				btnBackToManager = new JButton("BACK TO MANAGER MENU");
				btnBackToManager.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						CardLayout cl = (CardLayout) contentPane.getLayout();
						cl.show(contentPane, "card_managerMenuPanel");
					}
				});
				contractorControlMenuPanel.add(btnBackToManager, "cell 1 9,growx");

		employeeControlMenuPanel = new JPanel();
		contentPane.add(employeeControlMenuPanel,
				"card_employeeControlMenuPanel");
		employeeControlMenuPanel.setLayout(new MigLayout("",
				"[1000px][][1000px]",
				"[14px][][23px][23px][23px][][23px][23px][][23px]"));

		JLabel label_4 = new JLabel("EMPLOYEE CONTROL MENU");
		employeeControlMenuPanel.add(label_4,
				"cell 1 0,alignx center,aligny top");

		JSeparator separator_5 = new JSeparator();
		employeeControlMenuPanel.add(separator_5, "cell 0 1 3 1,growx");

		JButton button = new JButton("CREATE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateEmployeeGUI frame2 = new CreateEmployeeGUI();
				frame2.setVisible(true);
			}
		});
		employeeControlMenuPanel.add(button, "cell 1 2,growx,aligny top");

		JButton button_1 = new JButton("UPDATE");
		employeeControlMenuPanel.add(button_1, "cell 1 3,growx,aligny top");

		JButton button_2 = new JButton("DELETE");
		employeeControlMenuPanel.add(button_2, "cell 1 4,growx,aligny top");

		JSeparator separator_6 = new JSeparator();
		employeeControlMenuPanel.add(separator_6, "cell 0 5 3 1,growx");

		JButton button_3 = new JButton("LIST ALL");
		employeeControlMenuPanel.add(button_3, "cell 1 6,growx,aligny top");

		JButton button_4 = new JButton("FIND EMPLOYEE");
		employeeControlMenuPanel.add(button_4, "cell 1 7,growx,aligny top");

		JSeparator separator_7 = new JSeparator();
		employeeControlMenuPanel.add(separator_7, "cell 0 8 3 1,growx");

		JButton button_5 = new JButton("BACK TO MANAGER MENU");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_managerMenuPanel");
			}
		});
		employeeControlMenuPanel.add(button_5,
				"cell 1 9,alignx left,aligny top");
	}
}
