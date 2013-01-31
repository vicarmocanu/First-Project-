package GUI;

import ControlLayer.ProductForLeaseCtr;
import java.awt.BorderLayout;
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

public class CreateProductForLeaseGUI extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField barCodeField;
	private JTextField locationField;
	private JTextField descriptionField;
	private JTextField pricePerDayField;
	private ProductForLeaseCtr controller = new ProductForLeaseCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateProductForLeaseGUI frame = new CreateProductForLeaseGUI();
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
	public CreateProductForLeaseGUI() {
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
		
		JLabel lblId = new JLabel("BAR CODE:");
		contentPane.add(lblId, "cell 1 3,growx");
		
		barCodeField = new JTextField();
		contentPane.add(barCodeField, "cell 2 3,growx");
		barCodeField.setColumns(10);
		
		JLabel lblAddress = new JLabel("LOCATION:");
		contentPane.add(lblAddress, "cell 1 4,growx");
		
		locationField = new JTextField();
		contentPane.add(locationField, "cell 2 4,growx");
		locationField.setColumns(10);
		
		JLabel lblTelNr = new JLabel("DESCRIPTION:");
		contentPane.add(lblTelNr, "cell 1 5,growx");
		
		descriptionField = new JTextField();
		contentPane.add(descriptionField, "cell 2 5,growx");
		descriptionField.setColumns(10);
		
		JLabel lblPricePerDay = new JLabel("PRICE PER DAY:");
		contentPane.add(lblPricePerDay, "cell 1 6,alignx trailing");
		
		JButton btnCreate = new JButton("CREATE");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				   String name = nameField.getText();
				   String barCode = barCodeField.getText();
				   String location = locationField.getText();
				   String description = descriptionField.getText();
				   int pricePerDay = Integer.parseInt(pricePerDayField.getText());
				   String status = "Available";
				   
			       controller.makeProductForLease(barCode, location, name, description, status, pricePerDay);
				
				
				
				JOptionPane.showMessageDialog(null,
						"Product added!", "Successful",
						JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		
		pricePerDayField = new JTextField();
		pricePerDayField.setColumns(10);
		contentPane.add(pricePerDayField, "cell 2 6,growx");
		contentPane.add(btnCreate, "cell 1 7,growx");
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnCancel, "cell 2 7,growx");
	}

}
