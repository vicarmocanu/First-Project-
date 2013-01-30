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
import ControlLayer.ProductCtr;
public class UpdateProductGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private JTextField barCodeField;
	private JTextField priceField;
	private JTextField descriptionField;
	private JTextField locationField;
	private JTextField maxField;
	private JTextField minField;
	private ProductCtr controller = new ProductCtr();
	private JTextField quantityField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateProductGUI frame = new UpdateProductGUI();
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
	public UpdateProductGUI() {
		setTitle("UPDATE PRODUCT");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 501, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][]", "[][][][grow][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("UPDATE PRODUCT");
		contentPane.add(lblNewLabel, "cell 2 0,alignx center");
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");
		
		JLabel lblSearchName = new JLabel("SEARCH NAME:");
		contentPane.add(lblSearchName, "cell 1 2,alignx trailing");
		
		searchField = new JTextField();
		contentPane.add(searchField, "cell 2 2,growx");
		searchField.setColumns(10);
		
		
		
		final JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		contentPane.add(textPane, "cell 2 3,grow");
		
		JLabel lblNewLabel_1 = new JLabel("BAR CODE:");
		contentPane.add(lblNewLabel_1, "cell 1 4,growx");
		
		barCodeField = new JTextField();
		contentPane.add(barCodeField, "cell 2 4,growx");
		barCodeField.setColumns(10);
		
		final JButton btnUpdateBarCode = new JButton("UPDATE");
		btnUpdateBarCode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String barCode = barCodeField.getText();
				String name = searchField.getText();
				if (barCodeField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.updateProductBarCode(name, barCode);
					JOptionPane.showMessageDialog(null,
							"Product updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdateBarCode.setEnabled(false);
				}
			}
		});
		btnUpdateBarCode.setEnabled(false);
		contentPane.add(btnUpdateBarCode, "cell 3 4");
		
		JLabel lblAddress = new JLabel("BUY PRICE:");
		contentPane.add(lblAddress, "cell 1 5,growx");
		
		priceField = new JTextField();
		contentPane.add(priceField, "cell 2 5,growx");
		priceField.setColumns(10);
		
		final JButton btnUpdatePrice = new JButton("UPDATE");
		btnUpdatePrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String price = priceField.getText();
				String name = searchField.getText();
				if (priceField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.updateProductBuyPrice(name, Integer.parseInt(price));
					JOptionPane.showMessageDialog(null,
							"Product updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdatePrice.setEnabled(false);
				}
			}
		});
		btnUpdatePrice.setEnabled(false);
		contentPane.add(btnUpdatePrice, "cell 3 5");
		
		JLabel lblPhoneNr = new JLabel("DESCRIPTION:");
		contentPane.add(lblPhoneNr, "cell 1 6,growx");
		
		descriptionField = new JTextField();
		contentPane.add(descriptionField, "cell 2 6,growx");
		descriptionField.setColumns(10);
		
		final JButton btnUpdateDescription = new JButton("UPDATE");
		btnUpdateDescription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String description = descriptionField.getText();
				String name = searchField.getText();
				if (descriptionField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.updateProductDescription(name, description);
					JOptionPane.showMessageDialog(null,
							"Product updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdateDescription.setEnabled(false);
				}
			}
		});
		btnUpdateDescription.setEnabled(false);
		contentPane.add(btnUpdateDescription, "cell 3 6");
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblLocation = new JLabel("LOCATION:");
		contentPane.add(lblLocation, "cell 1 7,growx");
		
		locationField = new JTextField();
		locationField.setColumns(10);
		contentPane.add(locationField, "cell 2 7,growx");
		
		final JButton btnUpdateLocation = new JButton("UPDATE");
		btnUpdateLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String location = locationField.getText();
				String name = searchField.getText();
				if (locationField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.updateProductLocation(name, location);
					JOptionPane.showMessageDialog(null,
							"Product updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdateLocation.setEnabled(false);
				}
			}
		});
		btnUpdateLocation.setEnabled(false);
		contentPane.add(btnUpdateLocation, "cell 3 7");
		
		JLabel lblMaximOfProducts = new JLabel("MAXIM OF PRODUCTS:");
		contentPane.add(lblMaximOfProducts, "cell 1 8,growx");
		
		maxField = new JTextField();
		maxField.setColumns(10);
		contentPane.add(maxField, "cell 2 8,growx");
		
		final JButton btnUpdateMax = new JButton("UPDATE");
		btnUpdateMax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String max = maxField.getText();
				String name = searchField.getText();
				if (maxField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.updateProductMax(name, Integer.parseInt(max));
					JOptionPane.showMessageDialog(null,
							"Product updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdateMax.setEnabled(false);
				}
			}
		});
		btnUpdateMax.setEnabled(false);
		contentPane.add(btnUpdateMax, "cell 3 8");
		
		JLabel lblMinimOfProducts = new JLabel("MINIM OF PRODUCTS:");
		contentPane.add(lblMinimOfProducts, "cell 1 9,growx");
		
		minField = new JTextField();
		minField.setColumns(10);
		contentPane.add(minField, "cell 2 9,growx");
		
		final JButton btnUpdateMin = new JButton("UPDATE");
		btnUpdateMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String min = minField.getText();
				String name = searchField.getText();
				if (minField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.updateProductMin(name, Integer.parseInt(min));
					JOptionPane.showMessageDialog(null,
							"Product updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdateMin.setEnabled(false);
				}
			}
		});
		btnUpdateMin.setEnabled(false);
		contentPane.add(btnUpdateMin, "cell 3 9");
		
		JLabel lblQuantity = new JLabel("QUANTITY:");
		contentPane.add(lblQuantity, "cell 1 10");
		
		quantityField = new JTextField();
		contentPane.add(quantityField, "cell 2 10,growx");
		quantityField.setColumns(10);
		
		final JButton btnUpdateQuantity = new JButton("UPDATE");
		btnUpdateQuantity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String quantity = quantityField.getText();
				String name = searchField.getText();
				if (quantityField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.updateProductQuantity(name, Integer.parseInt(quantity));
					JOptionPane.showMessageDialog(null,
							"Product updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdateQuantity.setEnabled(false);
				}
			}
		});
		btnUpdateQuantity.setEnabled(false);
		contentPane.add(btnUpdateQuantity, "cell 3 10");
		contentPane.add(btnCancel, "cell 2 11,growx");
		
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

					if (controller.searchProductAndPrint(searchName)) {
						textPane.setText(controller
								.searchProductAndPrintPrint(searchName));
						btnUpdateBarCode.setEnabled(true);
						btnUpdatePrice.setEnabled(true);
						btnUpdateDescription.setEnabled(true);
						btnUpdateLocation.setEnabled(true);
						btnUpdateDescription.setEnabled(true);
						btnUpdateMax.setEnabled(true);
						btnUpdateMin.setEnabled(true);
						btnUpdateQuantity.setEnabled(true);
					} else
						textPane
								.setText("No product with that name found in the system.");
				}

			}
		});
		contentPane.add(btnSearch, "cell 3 2");
	}

}
