package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CreateEmployeeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		setTitle("CREATE EMPLOYEE");
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[120px][][grow][120px]", "[][][][][][][][][]"));
		
		JLabel lblCreateEmployee = new JLabel("CREATE EMPLOYEE");
		contentPane.add(lblCreateEmployee, "cell 1 0 2 1,alignx center");
		
		JLabel lblName = new JLabel("NAME:");
		contentPane.add(lblName, "cell 1 1,alignx left");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 2 1,growx");
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		contentPane.add(lblId, "cell 1 2,alignx left");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 2 2,growx");
		textField_1.setColumns(10);
		
		JLabel lblAddress = new JLabel("ADDRESS:");
		contentPane.add(lblAddress, "cell 1 3,alignx left");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 2 3,growx");
		textField_2.setColumns(10);
		
		JLabel lblTelNr = new JLabel("TEL NR:");
		contentPane.add(lblTelNr, "cell 1 4,alignx left");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "cell 2 4,growx");
		textField_3.setColumns(10);
		
		JLabel lblPosition = new JLabel("POSITION:");
		contentPane.add(lblPosition, "cell 1 5,alignx left");
		
		textField_4 = new JTextField();
		contentPane.add(textField_4, "cell 2 5,growx");
		textField_4.setColumns(10);
		
		JLabel lblSalary = new JLabel("SALARY:");
		contentPane.add(lblSalary, "cell 1 6,alignx left");
		
		textField_5 = new JTextField();
		contentPane.add(textField_5, "cell 2 6,growx");
		textField_5.setColumns(10);
		
		JButton btnCreate = new JButton("CREATE");
		contentPane.add(btnCreate, "cell 1 7,growx");
		
		JButton btnClear = new JButton("CLEAR");
		contentPane.add(btnClear, "cell 2 7,growx");
		
		JButton btnQuit = new JButton("QUIT");
		contentPane.add(btnQuit, "cell 1 8,growx");
	}

}
