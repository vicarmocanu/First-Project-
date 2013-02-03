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
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.JScrollBar;
import ControlLayer.ProductCtr;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JScrollPane;

public class SetSalePriceGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private JTextField priceField;
	private ProductCtr controller = new ProductCtr();
	private String productsWithoutSalePrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetSalePriceGUI frame = new SetSalePriceGUI();
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
	public SetSalePriceGUI() {
		
		setResizable(false);
		setTitle("SET PRICE FOR PRODUCTS");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 424, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow][]", "[][][grow][][grow][][]"));
		
		JLabel lblNewLabel = new JLabel("PRODUCTS");
		contentPane.add(lblNewLabel, "cell 0 0 4 1,alignx center");
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 1 2 3 1,grow");
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textArea.setEditable(false);
		
		JLabel lblSearchName = new JLabel("SEARCH NAME:");
		contentPane.add(lblSearchName, "cell 1 3,alignx trailing");
		
		searchField = new JTextField();
		contentPane.add(searchField, "cell 2 3,growx");
		searchField.setColumns(10);
		final JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		
		contentPane.add(textPane, "cell 0 4 4 1,grow");
		
		
		
		
		JLabel lblSalary = new JLabel("PRICE:");
		contentPane.add(lblSalary, "cell 1 5,alignx trailing");
		
		priceField = new JTextField();
		contentPane.add(priceField, "cell 2 5,growx");
		priceField.setColumns(10);
		
		final JButton btnUpdatePrice = new JButton("UPDATE");
		btnUpdatePrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = searchField.getText();
				String price = priceField.getText();

				if (price.equals("") || name.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					
						controller.updateProductSalePrice(name, Integer.parseInt(price));
						JOptionPane.showMessageDialog(null,
								"Sale price was set!", "Sucessfull",
								JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnUpdatePrice.setEnabled(false);
		contentPane.add(btnUpdatePrice, "cell 3 5");
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnCancel, "cell 2 6,growx");
		
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = searchField.getText();

				if (name.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
						if(controller.searchProductAndPrint(name))
						{
						textPane.setText(controller.searchProductAndPrintPrint(name));
						btnUpdatePrice.setEnabled(true);
						}
						else
							textPane.setText(controller.searchProductAndPrintPrint(name));
					
				}
			}
		});
		contentPane.add(btnSearch, "cell 3 3");
		
	}

}
