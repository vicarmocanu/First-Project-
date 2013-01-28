package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddProductForLeaseGUI extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField idField;
	private JTextField addressField;
	private JTextField telNrField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddProductForLeaseGUI frame = new AddProductForLeaseGUI();
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
	public AddProductForLeaseGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("ADD PRODUCT FOR LEASE");
		setType(Type.UTILITY);
		setBounds(100, 100, 256, 279);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][]", "[][][][][][][][]"));
		
		JLabel lblCreateContractor = new JLabel("ADD PRODUCT FOR LEASE");
		contentPane.add(lblCreateContractor, "cell 1 0 2 1,alignx center");
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");
		
		JLabel lblName = new JLabel("NAME:");
		contentPane.add(lblName, "cell 1 2,growx");
		
		nameField = new JTextField();
		contentPane.add(nameField, "cell 2 2,growx");
		nameField.setColumns(10);
		
		JLabel lblId = new JLabel("SCAN BAR CODE:");
		contentPane.add(lblId, "cell 1 3,growx");
		
		idField = new JTextField();
		contentPane.add(idField, "cell 2 3,growx");
		idField.setColumns(10);
		
		JLabel lblAddress = new JLabel("LOCATION:");
		contentPane.add(lblAddress, "cell 1 4,growx");
		
		addressField = new JTextField();
		contentPane.add(addressField, "cell 2 4,growx");
		addressField.setColumns(10);
		
		JLabel lblTelNr = new JLabel("DESCRIPTION:");
		contentPane.add(lblTelNr, "cell 1 5,growx");
		
		telNrField = new JTextField();
		contentPane.add(telNrField, "cell 2 5,growx");
		telNrField.setColumns(10);
		
		JLabel lblPricePerDay = new JLabel("PRICE PER DAY:");
		contentPane.add(lblPricePerDay, "cell 1 6,growx");
		
		textField = new JTextField();
		textField.setColumns(10);
		contentPane.add(textField, "cell 2 6,growx");
		
		JButton btnCreate = new JButton("CREATE");
		contentPane.add(btnCreate, "cell 1 7");
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnCancel, "cell 2 7,growx");
	}

}
