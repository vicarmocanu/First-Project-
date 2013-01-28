package GUI;
import ControlLayer.ProductCtr;

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

public class CreateProductGUI extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField barCodeField;
	private JTextField locationField;
	private JTextField descriptionField;
	private JTextField buyPriceField;
	private JTextField minimNumberOfProductsField;
	private JTextField maximNumbersOfProductsField;
	private JTextField numberOfProductsField;
	private ProductCtr controller= new ProductCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateProductGUI frame = new CreateProductGUI();
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
	public CreateProductGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("CREATE PRODUCT");
		setType(Type.UTILITY);
		setBounds(100, 100, 272, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow][]", "[][][][][][][][][][][][]"));
		
		JLabel lblCreateContractor = new JLabel("CREATE PRODUCT");
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
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblBuyPrice = new JLabel("BUY PRICE:");
		contentPane.add(lblBuyPrice, "cell 1 6,growx");
		
		buyPriceField = new JTextField();
		buyPriceField.setColumns(10);
		contentPane.add(buyPriceField, "cell 2 6,growx");
		
		JLabel lblMinimOfProducts = new JLabel("MINIM OF PRODUCTS");
		contentPane.add(lblMinimOfProducts, "cell 1 7,growx");
		
		minimNumberOfProductsField = new JTextField();
		minimNumberOfProductsField.setColumns(10);
		contentPane.add(minimNumberOfProductsField, "cell 2 7,growx");
		
		JLabel lblMaximOfProducts = new JLabel("MAXIM OF PRODUCTS");
		contentPane.add(lblMaximOfProducts, "cell 1 8,growx");
		
		maximNumbersOfProductsField = new JTextField();
		maximNumbersOfProductsField.setColumns(10);
		contentPane.add(maximNumbersOfProductsField, "cell 2 8,growx");
		
		JLabel lblNumberOfProducts = new JLabel("NUMBER OF PRODUCTS");
		contentPane.add(lblNumberOfProducts, "cell 1 9,growx");
		
		numberOfProductsField = new JTextField();
		numberOfProductsField.setColumns(10);
		contentPane.add(numberOfProductsField, "cell 2 9,growx");
		
		JButton btnCreate = new JButton("CREATE");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String barCode=barCodeField.getText();
				String location=locationField.getText();
				String name=nameField.getText();
				String description=descriptionField.getText();
				String buyPrice=buyPriceField.getText();
				String min=minimNumberOfProductsField.getText();
				String max=maximNumbersOfProductsField.getText();
				String numberOfProducts=numberOfProductsField.getText();
				
				
				controller.addProduct(barCode, location, name,description, Integer.parseInt(buyPrice), 0, Integer.parseInt(min), Integer.parseInt(max), Integer.parseInt(numberOfProducts));
				
				
				JOptionPane.showMessageDialog(null,
						"Product added!", "Successful",
						JOptionPane.INFORMATION_MESSAGE);
				
				
				barCodeField.setText("");
				locationField.setText("");
				nameField.setText("");
				descriptionField.setText("");
				buyPriceField.setText("");
				minimNumberOfProductsField.setText("");
				maximNumbersOfProductsField.setText("");
				numberOfProductsField.setText("");
			}
		});
		contentPane.add(btnCreate, "cell 1 11,growx");
		contentPane.add(btnCancel, "cell 2 11,growx");
	}

}
