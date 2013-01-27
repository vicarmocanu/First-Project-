package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Window.Type;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateProductGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private JTextField idField;
	private JTextField addressField;
	private JTextField phoneNrField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setBounds(100, 100, 424, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][]", "[][][][grow][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("UPDATE PRODUCT");
		contentPane.add(lblNewLabel, "cell 2 0,alignx center");
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");
		
		JLabel lblSearchName = new JLabel("SEARCH NAME:");
		contentPane.add(lblSearchName, "cell 1 2,alignx trailing");
		
		searchField = new JTextField();
		contentPane.add(searchField, "cell 2 2,growx");
		searchField.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		contentPane.add(btnSearch, "cell 3 2");
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		contentPane.add(textPane, "cell 2 3,grow");
		
		JLabel lblNewLabel_1 = new JLabel("BAR CODE:");
		contentPane.add(lblNewLabel_1, "cell 1 4,growx");
		
		idField = new JTextField();
		idField.setEnabled(false);
		contentPane.add(idField, "cell 2 4,growx");
		idField.setColumns(10);
		
		JButton btnUpdateId = new JButton("UPDATE");
		btnUpdateId.setEnabled(false);
		contentPane.add(btnUpdateId, "cell 3 4");
		
		JLabel lblAddress = new JLabel("BUY PRICE:");
		contentPane.add(lblAddress, "cell 1 5,growx");
		
		addressField = new JTextField();
		addressField.setEnabled(false);
		contentPane.add(addressField, "cell 2 5,growx");
		addressField.setColumns(10);
		
		JButton btnUpdateAddress = new JButton("UPDATE");
		btnUpdateAddress.setEnabled(false);
		contentPane.add(btnUpdateAddress, "cell 3 5");
		
		JLabel lblPhoneNr = new JLabel("DESCRIPTION:");
		contentPane.add(lblPhoneNr, "cell 1 6,growx");
		
		phoneNrField = new JTextField();
		phoneNrField.setEnabled(false);
		contentPane.add(phoneNrField, "cell 2 6,growx");
		phoneNrField.setColumns(10);
		
		JButton btnUpdatePhoneNr = new JButton("UPDATE");
		btnUpdatePhoneNr.setEnabled(false);
		contentPane.add(btnUpdatePhoneNr, "cell 3 6");
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblLocation = new JLabel("LOCATION:");
		contentPane.add(lblLocation, "cell 1 7,growx");
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setColumns(10);
		contentPane.add(textField, "cell 2 7,growx");
		
		JButton button = new JButton("UPDATE");
		button.setEnabled(false);
		contentPane.add(button, "cell 3 7");
		
		JLabel lblMaximOfProducts = new JLabel("MAXIM OF PRODUCTS");
		contentPane.add(lblMaximOfProducts, "cell 1 8,growx");
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		contentPane.add(textField_1, "cell 2 8,growx");
		
		JButton button_1 = new JButton("UPDATE");
		button_1.setEnabled(false);
		contentPane.add(button_1, "cell 3 8");
		
		JLabel lblMinimOfProducts = new JLabel("MINIM OF PRODUCTS:");
		contentPane.add(lblMinimOfProducts, "cell 1 9,growx");
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		contentPane.add(textField_2, "cell 2 9,growx");
		
		JButton button_2 = new JButton("UPDATE");
		button_2.setEnabled(false);
		contentPane.add(button_2, "cell 3 9");
		contentPane.add(btnCancel, "cell 2 10,growx");
	}

}
