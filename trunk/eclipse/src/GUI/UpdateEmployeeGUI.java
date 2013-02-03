package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Window.Type;

import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ControlLayer.PersonCtr;
import javax.swing.JScrollPane;

public class UpdateEmployeeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private JTextField idField;
	private JTextField addressField;
	private JTextField phoneNrField;
	private JTextField positionField;
	private JTextField salaryField;
	private PersonCtr controller = new PersonCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateEmployeeGUI frame = new UpdateEmployeeGUI();
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
	public UpdateEmployeeGUI() {
		setResizable(false);
		setTitle("UPDATE EMPLOYEE");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 403, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][]", "[][][][grow][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("UPDATE EMPLOYEE");
		contentPane.add(lblNewLabel, "cell 2 0,alignx center");
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");
		
		JLabel lblSearchName = new JLabel("SEARCH NAME:");
		contentPane.add(lblSearchName, "cell 1 2,alignx trailing");
		
		searchField = new JTextField();
		contentPane.add(searchField, "cell 2 2,growx");
		searchField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 2 3,grow");
		
		
		final JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setEditable(false);
		
		JLabel lblNewLabel_1 = new JLabel("ID:");
		contentPane.add(lblNewLabel_1, "cell 1 4");
		
		idField = new JTextField();
		contentPane.add(idField, "cell 2 4,growx");
		idField.setColumns(10);
		
		final JButton btnUpdateId = new JButton("UPDATE");
		btnUpdateId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = idField.getText();
				String name = searchField.getText();
				if (idField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.updateEmployeeId(name, id);
					JOptionPane.showMessageDialog(null,
							"Employee updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdateId.setEnabled(false);
				}
			}
		});
		btnUpdateId.setEnabled(false);
		contentPane.add(btnUpdateId, "cell 3 4");
		
		JLabel lblAddress = new JLabel("ADDRESS:");
		contentPane.add(lblAddress, "cell 1 5");
		
		addressField = new JTextField();
		contentPane.add(addressField, "cell 2 5,growx");
		addressField.setColumns(10);
		
		final JButton btnUpdateAddress = new JButton("UPDATE");
		btnUpdateAddress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String address = addressField.getText();
				String name = searchField.getText();
				if (addressField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else
					controller.updateEmployeeAddress(name, address);
				{
					JOptionPane.showMessageDialog(null,
							"Employee updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdateAddress.setEnabled(false);
				}
			}
		});
		btnUpdateAddress.setEnabled(false);
		contentPane.add(btnUpdateAddress, "cell 3 5");
		
		JLabel lblPhoneNr = new JLabel("PHONE NR:");
		contentPane.add(lblPhoneNr, "cell 1 6");
		
		phoneNrField = new JTextField();
		contentPane.add(phoneNrField, "cell 2 6,growx");
		phoneNrField.setColumns(10);
		
		final JButton btnUpdatePhoneNr = new JButton("UPDATE");
		btnUpdatePhoneNr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String phoneNr = phoneNrField.getText();
				String name = searchField.getText();
				if (phoneNrField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else
					controller.updateEmployeePhoneNumber(name, phoneNr);
				{
					JOptionPane.showMessageDialog(null,
							"Employee updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdatePhoneNr.setEnabled(false);
				}
			}
		});
		btnUpdatePhoneNr.setEnabled(false);
		contentPane.add(btnUpdatePhoneNr, "cell 3 6");
		
		JLabel lblPosition = new JLabel("POSITION:");
		contentPane.add(lblPosition, "cell 1 7");
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		positionField = new JTextField();
		contentPane.add(positionField, "cell 2 7,growx");
		positionField.setColumns(10);
		
		final JButton btnUpdatePosition = new JButton("UPDATE");
		btnUpdatePosition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String position = positionField.getText();
				String name = searchField.getText();
				if (positionField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else
					controller.updateEmployeePosition(name, position);
				{
					JOptionPane.showMessageDialog(null,
							"Employee updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdatePosition.setEnabled(false);
				}
			}
		});
		btnUpdatePosition.setEnabled(false);
		contentPane.add(btnUpdatePosition, "cell 3 7");
		
		JLabel lblSalary = new JLabel("SALARY:");
		contentPane.add(lblSalary, "cell 1 8");
		
		salaryField = new JTextField();
		contentPane.add(salaryField, "cell 2 8,growx");
		salaryField.setColumns(10);
		
		final JButton btnUpdateSalary = new JButton("UPDATE");
		btnUpdateSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String salary = salaryField.getText();
				String name = searchField.getText();
				if (salaryField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else
					controller.updateEmployeeSalary(name, Integer.parseInt(salary));
				{
					JOptionPane.showMessageDialog(null,
							"Employee updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdateSalary.setEnabled(false);
				}
			}
		});
		btnUpdateSalary.setEnabled(false);
		contentPane.add(btnUpdateSalary, "cell 3 8");
		contentPane.add(btnCancel, "cell 2 9,growx");
		

		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchName;
				searchName = searchField.getText();

				if (searchField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {

					if (controller.listEmployeeByName(searchName)) {
						textPane.setText(controller
								.listEmployeeByNamePrint(searchName));
						btnUpdateId.setEnabled(true);
						btnUpdateAddress.setEnabled(true);
						btnUpdatePhoneNr.setEnabled(true);
						btnUpdatePosition.setEnabled(true);
						btnUpdateSalary.setEnabled(true);
					} else
						textPane
								.setText("No employee with that name found in the system.");
				}
			}
		});
		contentPane.add(btnSearch, "cell 3 2");
	}

}
