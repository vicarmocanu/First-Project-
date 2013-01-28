package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ControlLayer.PersonCtr; 

public class CreateEmployeeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField idField;
	private JTextField addressField;
	private JTextField phoneField;
	private JTextField positionField;
	private JTextField salaryField;
	private PersonCtr controller=new PersonCtr();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateEmployeeGUI frame = new CreateEmployeeGUI();
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
	public CreateEmployeeGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("CREATE EMPLOYEE");
		setType(Type.UTILITY);
		setResizable(false);
		setBounds(100, 100, 260, 245);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][100px][]", "[][][][][][][][][][]"));
		
		JLabel lblCreateEmployee = new JLabel("CREATE EMPLOYEE");
		contentPane.add(lblCreateEmployee, "cell 1 0 2 1,alignx center");
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");
		
		JLabel lblName = new JLabel("NAME:");
		contentPane.add(lblName, "cell 1 2,alignx left");
		
		nameField = new JTextField();
		contentPane.add(nameField, "cell 2 2,growx");
		nameField.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		contentPane.add(lblId, "cell 1 3,alignx left");
		
		idField = new JTextField();
		contentPane.add(idField, "cell 2 3,growx");
		idField.setColumns(10);
		
		JLabel lblAddress = new JLabel("ADDRESS:");
		contentPane.add(lblAddress, "cell 1 4,alignx left");
		
		addressField = new JTextField();
		contentPane.add(addressField, "cell 2 4,growx");
		addressField.setColumns(10);
		
		JLabel lblTelNr = new JLabel("TEL NR:");
		contentPane.add(lblTelNr, "cell 1 5,alignx left");
		
		phoneField = new JTextField();
		contentPane.add(phoneField, "cell 2 5,growx");
		phoneField.setColumns(10);
		
		JLabel lblPosition = new JLabel("POSITION:");
		contentPane.add(lblPosition, "cell 1 6,alignx left");
		
		positionField = new JTextField();
		contentPane.add(positionField, "cell 2 6,growx");
		positionField.setColumns(10);
		
		JLabel lblSalary = new JLabel("SALARY:");
		contentPane.add(lblSalary, "cell 1 7,alignx left");
		
		salaryField = new JTextField();
		contentPane.add(salaryField, "cell 2 7,growx");
		salaryField.setColumns(10);
		
		JButton btnCreate = new JButton("CREATE");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name= nameField.getText();
				String id= idField.getText();
				String address= addressField.getText();
				String phone= phoneField.getText();
				String position = positionField.getText();
				String salary= salaryField.getText();
				
				controller.createEmployee(name, id, address, phone, position, Integer.parseInt(salary));
				
				JOptionPane.showMessageDialog(null,
						"New employee added to the system. ", "Successful",
						JOptionPane.INFORMATION_MESSAGE);
				
				
				nameField.setText("");
				idField.setText("");
				addressField.setText("");
				phoneField.setText("");
				positionField.setText("");
				salaryField.setText("");
				
			}
		});
		contentPane.add(btnCreate, "cell 1 8,growx");
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				
			}
		});
		contentPane.add(btnCancel, "cell 2 8,growx");
	}

}
