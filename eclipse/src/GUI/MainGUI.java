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
	private JPanel employeeMenuPanel;
	private JLabel lblEmployeeMenu;
	private JSeparator separator_10;
	private JButton btnCustomerControlMenu;
	private JButton btnNewButton;
	private JButton btnProductControlMenu;
	private JButton btnOrderControlMenu;
	private JButton btnLeaseControlMenu;
	private JSeparator separator_11;
	private JButton btnBackToManager_1;
	private JPanel e_customerControlMenuPanel;
	private JLabel lblCustomerControlMenu;
	private JSeparator separator_12;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JSeparator separator_15;
	private JButton btnBackToEmployee_1;
	private JPanel e_productControlMenuPanel;
	private JLabel lblProductControlMenu;
	private JSeparator separator_19;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JSeparator separator_20;
	private JButton btnBackToEmployee_2;
	private JPanel e_orderControlMenuPanel;
	private JLabel lblOrderControlMenu;
	private JSeparator separator_21;
	private JButton btnAddProductsTo;
	private JButton btnNewButton_12;
	private JButton btnSearchOrder;
	private JSeparator separator_22;
	private JButton btnBackToEmployee_3;
	private JPanel e_leaseControlMenuPanel;
	private JLabel lblLeaseControlMenu;
	private JSeparator separator_23;
	private JButton btnAdd;
	private JButton btnChangeStatus;
	private JButton btnMakeLease;
	private JButton btnReturnProduct;
	private JButton btnSearch;
	private JSeparator separator_24;
	private JButton btnBackToEmployee_4;
	private JSeparator separator_25;
	private JSeparator separator_26;
	private JSeparator separator_27;
	private JLabel label_manager;

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
				"[308px][][7px][20px][][28px][311px]", "[][][][][][][][][][]"));

		label_manager = new JLabel("CREATE MANAGER");
		label_manager.setVisible(false);
		createAdminPanel.add(label_manager,
				"cell 1 0 4 1,alignx center,aligny bottom");

		label = new JLabel("CREATE ADMIN");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		createAdminPanel.add(label,
				"flowx,cell 1 1 4 1,alignx center,aligny top");

		separator = new JSeparator();
		createAdminPanel.add(separator, "cell 0 2 7 1,grow");

		label_1 = new JLabel("USER NAME:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		createAdminPanel.add(label_1, "cell 1 3,alignx right,aligny center");

		usernameField = new JTextField();
		usernameField.setColumns(20);
		createAdminPanel.add(usernameField, "cell 4 3,alignx left,aligny top");

		label_2 = new JLabel("PASSWORD:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		createAdminPanel.add(label_2, "cell 1 4,alignx right,aligny center");

		passwordField = new JPasswordField();
		passwordField.setColumns(20);
		createAdminPanel.add(passwordField, "cell 4 4,alignx left,aligny top");

		label_3 = new JLabel("REPEAT PASSWORD:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		createAdminPanel.add(label_3, "cell 1 5,alignx right,aligny center");

		repeatPasswordField = new JPasswordField();
		repeatPasswordField.setColumns(20);
		createAdminPanel.add(repeatPasswordField,
				"cell 4 5,alignx left,aligny top");

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
		createAdminPanel.add(createButton, "cell 1 7,growx,aligny top");
		JRootPane rootPane = createAdminPanel.getRootPane();

		clearButton = new JButton("CLEAR");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				usernameField.setText("");
				passwordField.setText("");
				repeatPasswordField.setText("");
			}
		});
		createAdminPanel.add(clearButton, "cell 4 7,growx,aligny top");

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
		createAdminPanel.add(quitSystemBtn__1, "cell 1 8,growx");

		btnCancel = new JButton("CANCEL");
		btnCancel.setEnabled(false);

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_mainMenuPanel");
			}
		});
		createAdminPanel.add(btnCancel, "cell 4 8,growx");

		separator_1 = new JSeparator();
		createAdminPanel.add(separator_1, "cell 0 9 7 1,grow");

		mainMenuPanel = new JPanel();
		mainMenuPanel.setVisible(false);
		contentPane.add(mainMenuPanel, "card_mainMenuPanel");
		mainMenuPanel.setLayout(new MigLayout("", "[1000px][][1000px]",
				"[][][][][][][][]"));

		lblMainMenu = new JLabel("MAIN MENU");
		mainMenuPanel.add(lblMainMenu, "cell 1 0,alignx center,aligny center");

		managerMenuBtn = new JButton("Manager Menu");
		managerMenuBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_managerMenuPanel");
			}
		});

		separator_26 = new JSeparator();
		mainMenuPanel.add(separator_26, "cell 0 1 3 1,growx");

		mainMenuPanel.add(managerMenuBtn, "cell 1 2,growx,aligny top");

		employeeMenuBtn = new JButton("Employee Menu");
		employeeMenuBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_employeeMenuPanel");

			}
		});

		mainMenuPanel.add(employeeMenuBtn, "cell 1 3,growx,aligny top");

		createManagerBtn = new JButton("Create Manager");
		createManagerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_createAdminPanel");
				label.setVisible(false);
				label_manager.setVisible(true);
			}
		});

		separator_27 = new JSeparator();
		mainMenuPanel.add(separator_27, "cell 0 4 3 1,growx");
		mainMenuPanel.add(createManagerBtn, "cell 1 5,growx");

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

		separator_25 = new JSeparator();
		mainMenuPanel.add(separator_25, "cell 0 6 3 1,growx");
		mainMenuPanel.add(quitSystemBtn, "cell 1 7,growx,aligny center");

		JPanel managerMenuPanel = new JPanel();
		contentPane.add(managerMenuPanel, "card_managerMenuPanel");
		managerMenuPanel.setLayout(new BoxLayout(managerMenuPanel,
				BoxLayout.Y_AXIS));

		final JPanel loginPanel = new JPanel();
		managerMenuPanel.add(loginPanel);
		loginPanel.setLayout(new MigLayout("", "[1000px][][][1000px]",
				"[][][][][][]"));

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
		contractorControlMenuPanel.setLayout(new MigLayout("",
				"[1000px][][1000px]", "[][][][][][][][][][][][][][][]"));

		lblContractorControlMenu = new JLabel("CONTRACTOR CONTROL MENU");
		contractorControlMenuPanel.add(lblContractorControlMenu,
				"cell 1 0,alignx center");

		separator_2 = new JSeparator();
		contractorControlMenuPanel.add(separator_2, "cell 0 1 3 1,growx");

		btnCreate = new JButton("CREATE");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CreateContractorGUI createContractorGUI = new CreateContractorGUI();
				createContractorGUI.setVisible(true);
			}
		});
		contractorControlMenuPanel.add(btnCreate, "cell 1 2,grow");

		btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateContractorGUI updateContractorGUI = new UpdateContractorGUI();
				updateContractorGUI.setVisible(true);
			}
		});
		contractorControlMenuPanel.add(btnUpdate, "cell 1 3,grow");

		btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteContractorGUI deleteContractorGUI = new DeleteContractorGUI();
				deleteContractorGUI.setVisible(true);

			}
		});
		contractorControlMenuPanel.add(btnDelete, "cell 1 4,grow");

		separator_3 = new JSeparator();
		contractorControlMenuPanel.add(separator_3, "cell 0 5 3 1,grow");

		btnListAll = new JButton("LIST ALL");
		btnListAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListAllContractorGUI ListAllContractorGUI = new ListAllContractorGUI();
				ListAllContractorGUI.setVisible(true);
			}
		});
		contractorControlMenuPanel.add(btnListAll, "cell 1 6,growx");

		btnFindContractor = new JButton("FIND CONTRACTOR");
		btnFindContractor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FindContractorGUI findContractorGUI = new FindContractorGUI();
				findContractorGUI.setVisible(true);
			}
		});
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
				CreateEmployeeGUI createEmployeeGUI = new CreateEmployeeGUI();
				createEmployeeGUI.setVisible(true);
			}
		});
		employeeControlMenuPanel.add(button, "cell 1 2,growx,aligny top");

		JButton button_1 = new JButton("UPDATE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdateEmployeeGUI updateEmployeeGUI = new UpdateEmployeeGUI();
				updateEmployeeGUI.setVisible(true);
			}
		});
		employeeControlMenuPanel.add(button_1, "cell 1 3,growx,aligny top");

		JButton button_2 = new JButton("DELETE");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteEmployeeGUI deleteEmployeeGUI = new DeleteEmployeeGUI();
				deleteEmployeeGUI.setVisible(true);
			}
		});
		employeeControlMenuPanel.add(button_2, "cell 1 4,growx,aligny top");

		JSeparator separator_6 = new JSeparator();
		employeeControlMenuPanel.add(separator_6, "cell 0 5 3 1,growx");

		JButton button_3 = new JButton("LIST ALL");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListAllEmployeeGUI listAllEmployeeGUI = new ListAllEmployeeGUI();
				listAllEmployeeGUI.setVisible(true);
			}
		});
		employeeControlMenuPanel.add(button_3, "cell 1 6,growx,aligny top");

		JButton button_4 = new JButton("FIND EMPLOYEE");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FindEmployeeGUI findEmployeeGUI = new FindEmployeeGUI();
				findEmployeeGUI.setVisible(true);
			}
		});
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

		employeeMenuPanel = new JPanel();
		contentPane.add(employeeMenuPanel, "card_employeeMenuPanel");
		employeeMenuPanel.setLayout(new MigLayout("", "[1000px][][1000px]",
				"[][][][][][][][][]"));

		lblEmployeeMenu = new JLabel("EMPLOYEE MENU");
		employeeMenuPanel.add(lblEmployeeMenu, "cell 1 0,alignx center");

		separator_10 = new JSeparator();
		employeeMenuPanel.add(separator_10, "cell 0 1 3 1,growx");

		btnCustomerControlMenu = new JButton("CUSTOMER CONTROL MENU");
		btnCustomerControlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_e_customerControlMenuPanel");
			}
		});
		employeeMenuPanel.add(btnCustomerControlMenu, "cell 1 2,growx");

		btnNewButton = new JButton("SALE CONTROL MENU");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		employeeMenuPanel.add(btnNewButton, "cell 1 3,growx");

		btnProductControlMenu = new JButton("PRODUCT CONTROL MENU");
		btnProductControlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_e_productControlMenuPanel");
			}
		});
		employeeMenuPanel.add(btnProductControlMenu, "cell 1 4,growx");

		btnOrderControlMenu = new JButton("ORDER CONTROL MENU");
		btnOrderControlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_e_orderControlMenuPanel");
			}
		});
		employeeMenuPanel.add(btnOrderControlMenu, "cell 1 5,growx");

		btnLeaseControlMenu = new JButton("LEASE CONTROL MENU");
		btnLeaseControlMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_e_leaseControlMenuPanel");
			}
		});
		employeeMenuPanel.add(btnLeaseControlMenu, "cell 1 6,growx");

		separator_11 = new JSeparator();
		employeeMenuPanel.add(separator_11, "cell 0 7 3 1,growx");

		btnBackToManager_1 = new JButton("BACK TO MAIN MENU");
		btnBackToManager_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_mainMenuPanel");

			}
		});
		employeeMenuPanel.add(btnBackToManager_1, "cell 1 8,growx");

		e_customerControlMenuPanel = new JPanel();
		contentPane.add(e_customerControlMenuPanel,
				"card_e_customerControlMenuPanel");
		e_customerControlMenuPanel.setLayout(new MigLayout("",
				"[1000px][][1000px]", "[][][][][][][][][]"));

		lblCustomerControlMenu = new JLabel("CUSTOMER CONTROL MENU");
		e_customerControlMenuPanel.add(lblCustomerControlMenu,
				"cell 1 0,alignx center");

		separator_12 = new JSeparator();
		e_customerControlMenuPanel.add(separator_12, "cell 0 1 3 1,growx");

		btnNewButton_1 = new JButton("CREATE");
		e_customerControlMenuPanel.add(btnNewButton_1, "cell 1 2,growx");

		btnNewButton_2 = new JButton("UPDATE");
		e_customerControlMenuPanel.add(btnNewButton_2, "cell 1 3,growx");

		btnNewButton_4 = new JButton("DELETE");
		e_customerControlMenuPanel.add(btnNewButton_4, "cell 1 4,growx");

		btnNewButton_5 = new JButton("LIST ALL");
		e_customerControlMenuPanel.add(btnNewButton_5, "cell 1 5,growx");

		btnNewButton_6 = new JButton("FIND CUSTOMER");
		e_customerControlMenuPanel.add(btnNewButton_6, "cell 1 6,growx");

		separator_15 = new JSeparator();
		e_customerControlMenuPanel.add(separator_15, "cell 0 7 3 1,growx");

		btnBackToEmployee_1 = new JButton("BACK TO EMPLOYEE MENU");
		btnBackToEmployee_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_employeeMenuPanel");
			}
		});
		e_customerControlMenuPanel.add(btnBackToEmployee_1, "cell 1 8,growx");

		e_productControlMenuPanel = new JPanel();
		contentPane.add(e_productControlMenuPanel,
				"card_e_productControlMenuPanel");
		e_productControlMenuPanel.setLayout(new MigLayout("",
				"[1000px][][1000px]", "[][][][][][][][][]"));

		lblProductControlMenu = new JLabel("PRODUCT CONTROL MENU");
		e_productControlMenuPanel.add(lblProductControlMenu,
				"cell 1 0,alignx center");

		separator_19 = new JSeparator();
		e_productControlMenuPanel.add(separator_19, "cell 0 1 3 1,growx");

		btnNewButton_7 = new JButton("ADD");
		e_productControlMenuPanel.add(btnNewButton_7, "cell 1 2,growx");

		btnNewButton_8 = new JButton("UPDATE");
		e_productControlMenuPanel.add(btnNewButton_8, "cell 1 3,growx");

		btnNewButton_9 = new JButton("DELETE");
		e_productControlMenuPanel.add(btnNewButton_9, "cell 1 4,growx");

		btnNewButton_10 = new JButton("LIST ALL");
		e_productControlMenuPanel.add(btnNewButton_10, "cell 1 5,growx");

		btnNewButton_11 = new JButton("SEARCH PRODUCT");
		e_productControlMenuPanel.add(btnNewButton_11, "cell 1 6,growx");

		separator_20 = new JSeparator();
		e_productControlMenuPanel.add(separator_20, "cell 0 7 3 1,growx");

		btnBackToEmployee_2 = new JButton("BACK TO EMPLOYEE MENU");
		btnBackToEmployee_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_employeeMenuPanel");
			}
		});
		e_productControlMenuPanel.add(btnBackToEmployee_2, "cell 1 8,growx");

		e_orderControlMenuPanel = new JPanel();
		contentPane
				.add(e_orderControlMenuPanel, "card_e_orderControlMenuPanel");
		e_orderControlMenuPanel.setLayout(new MigLayout("",
				"[1000px][][1000px]", "[][][][][][][]"));

		lblOrderControlMenu = new JLabel("ORDER CONTROL MENU");
		e_orderControlMenuPanel.add(lblOrderControlMenu,
				"cell 1 0,alignx center");

		separator_21 = new JSeparator();
		e_orderControlMenuPanel.add(separator_21, "cell 0 1 3 1,growx");

		btnAddProductsTo = new JButton("ADD PRODUCTS TO ORDER");
		e_orderControlMenuPanel.add(btnAddProductsTo, "cell 1 2,growx");

		btnNewButton_12 = new JButton("LIST ALL ORDERS");
		e_orderControlMenuPanel.add(btnNewButton_12, "cell 1 3,growx");

		btnSearchOrder = new JButton("SEARCH ORDER");
		e_orderControlMenuPanel.add(btnSearchOrder, "cell 1 4,growx");

		separator_22 = new JSeparator();
		e_orderControlMenuPanel.add(separator_22, "cell 0 5 3 1,growx");

		btnBackToEmployee_3 = new JButton("BACK TO EMPLOYEE MENU");
		btnBackToEmployee_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_employeeMenuPanel");
			}
		});
		e_orderControlMenuPanel.add(btnBackToEmployee_3, "cell 1 6,growx");

		e_leaseControlMenuPanel = new JPanel();
		contentPane
				.add(e_leaseControlMenuPanel, "card_e_leaseControlMenuPanel");
		e_leaseControlMenuPanel.setLayout(new MigLayout("",
				"[1000px][][1000px]", "[][][][][][][][][]"));

		lblLeaseControlMenu = new JLabel("LEASE CONTROL MENU");
		e_leaseControlMenuPanel.add(lblLeaseControlMenu,
				"cell 1 0,alignx center");

		separator_23 = new JSeparator();
		e_leaseControlMenuPanel.add(separator_23, "cell 0 1 3 1,growx");

		btnMakeLease = new JButton("MAKE LEASE");
		e_leaseControlMenuPanel.add(btnMakeLease, "cell 1 2,growx");

		btnAdd = new JButton("ADD PRODUCTS ");
		e_leaseControlMenuPanel.add(btnAdd, "cell 1 3,growx");

		btnChangeStatus = new JButton("CHANGE STATUS");
		e_leaseControlMenuPanel.add(btnChangeStatus, "cell 1 4,growx");

		btnReturnProduct = new JButton("RETURN PRODUCT");
		e_leaseControlMenuPanel.add(btnReturnProduct, "cell 1 5,growx");

		btnSearch = new JButton("SEARCH LEASE");
		e_leaseControlMenuPanel.add(btnSearch, "cell 1 6,growx");

		separator_24 = new JSeparator();
		e_leaseControlMenuPanel.add(separator_24, "cell 0 7 3 1,growx");

		btnBackToEmployee_4 = new JButton("BACK TO EMPLOYEE MENU");
		btnBackToEmployee_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) contentPane.getLayout();
				cl.show(contentPane, "card_employeeMenuPanel");
			}
		});
		e_leaseControlMenuPanel.add(btnBackToEmployee_4, "cell 1 8");
	}
}
