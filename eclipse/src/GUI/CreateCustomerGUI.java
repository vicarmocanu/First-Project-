package GUI;

import java.awt.BorderLayout;
import ControlLayer.PersonCtr;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CreateCustomerGUI extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField idField;
	private JTextField addressField;
	private JTextField phoneField;
	private PersonCtr controller=new PersonCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateCustomerGUI frame = new CreateCustomerGUI();
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
	public CreateCustomerGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("CREATE CUSTOMER");
		setResizable(false);
		setType(Type.UTILITY);
		setBounds(100, 100, 256, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][]", "[][][][][][][]"));
		
		JLabel lblCreateContractor = new JLabel("CREATE CUSTOMER");
		contentPane.add(lblCreateContractor, "cell 1 0 2 1,alignx center");
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");
		
		JLabel lblName = new JLabel("NAME:");
		contentPane.add(lblName, "cell 1 2,alignx trailing");
		
		nameField = new JTextField();
		contentPane.add(nameField, "cell 2 2,growx");
		nameField.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		contentPane.add(lblId, "cell 1 3,alignx trailing");
		
		idField = new JTextField();
		contentPane.add(idField, "cell 2 3,growx");
		idField.setColumns(10);
		
		JLabel lblAddress = new JLabel("ADDRESS:");
		contentPane.add(lblAddress, "cell 1 4,alignx trailing");
		
		addressField = new JTextField();
		contentPane.add(addressField, "cell 2 4,growx");
		addressField.setColumns(10);
		
		JLabel lblTelNr = new JLabel("TEL NR:");
		contentPane.add(lblTelNr, "cell 1 5,alignx trailing");
		
		phoneField = new JTextField();
		contentPane.add(phoneField, "cell 2 5,growx");
		phoneField.setColumns(10);
		
		JButton btnCreate = new JButton("CREATE");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=nameField.getText();
				String id=idField.getText();
				String address=addressField.getText();
				String phone=phoneField.getText();
				
				
				
				controller.createContractor(name, id, address, phone);
				
				
				JOptionPane.showMessageDialog(null,
						"New customer added to the system. ", "Successful",
						JOptionPane.INFORMATION_MESSAGE);
				
				
				nameField.setText("");
				idField.setText("");
				addressField.setText("");
				phoneField.setText("");
				
			}
		});
		contentPane.add(btnCreate, "cell 1 6");
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnCancel, "cell 2 6,growx");
	}

}
