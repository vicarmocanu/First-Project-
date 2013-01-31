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
import ControlLayer.LeaseCtr;

public class ReturnProductGUI extends JFrame {

	private JPanel contentPane;
	private JTextField leaseIdField;
	private JTextField productNameField;
	private LeaseCtr controller = new LeaseCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReturnProductGUI frame = new ReturnProductGUI();
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
	public ReturnProductGUI() {
		setResizable(false);
		setTitle("RETURN PRODUCT");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 245, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][]",
				"[][][][][][][][][]"));

		JLabel lblNewLabel = new JLabel("RETURN PRODUCT");
		contentPane.add(lblNewLabel, "cell 2 0,alignx center");

		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");

		JLabel lblSearchName = new JLabel("LEASE ID:");
		contentPane.add(lblSearchName, "cell 1 2,alignx trailing");

		leaseIdField = new JTextField();
		contentPane.add(leaseIdField, "cell 2 2,growx");
		leaseIdField.setColumns(10);

		JLabel lblName = new JLabel("PRODUCT NAME:");
		contentPane.add(lblName, "cell 1 3,alignx trailing");

		productNameField = new JTextField();
		productNameField.setColumns(10);
		contentPane.add(productNameField, "cell 2 3,growx");

		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JButton btnReturnIt = new JButton("RETURN IT");
		btnReturnIt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String leaseId = leaseIdField.getText();
				String productName = productNameField.getText();
				if (leaseId.equals("") || productName.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.returnLeasedProduct(leaseId, productName);
					JOptionPane.showMessageDialog(null,
							"Product returned successful!", "Successful!",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		contentPane.add(btnReturnIt, "cell 2 5,growx");
		contentPane.add(btnCancel, "cell 2 7,growx");
	}

}
