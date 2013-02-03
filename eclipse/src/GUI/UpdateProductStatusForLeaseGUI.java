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
import ControlLayer.ProductForLeaseCtr;
import javax.swing.JScrollPane;

public class UpdateProductStatusForLeaseGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private ProductForLeaseCtr controller = new ProductForLeaseCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateProductStatusForLeaseGUI frame = new UpdateProductStatusForLeaseGUI();
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
	public UpdateProductStatusForLeaseGUI() {
		setResizable(false);
		setTitle("UPDATE STATUS");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 397, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][]", "[][][][grow][][]"));
		
		JLabel lblNewLabel = new JLabel("UPDATE PRODUCT STATUS");
		contentPane.add(lblNewLabel, "cell 2 0,alignx center");
		
		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");
		
		JLabel lblSearchName = new JLabel("SEARCH NAME:");
		contentPane.add(lblSearchName, "cell 1 2,alignx trailing");
		
		searchField = new JTextField();
		contentPane.add(searchField, "cell 2 2,growx");
		searchField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 2 3,grow");
		
		
		
		final JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setEditable(false);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("STATUS:");
		contentPane.add(lblNewLabel_1, "cell 1 4");
		
		final JButton btnUpdateStatus = new JButton("UPDATE");
		btnUpdateStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchName;
				searchName = searchField.getText();
				controller.changeProductForLeaseStatus(searchName);
				JOptionPane.showMessageDialog(null,
						"Product updated in the system. ", "Successful",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnUpdateStatus.setEnabled(false);
		contentPane.add(btnUpdateStatus, "cell 2 4,growx");
		contentPane.add(btnCancel, "cell 2 5,growx");
		
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

					if (controller.searchExistProduct(searchName)) {
						textPane.setText(controller
								.searchProduct(searchName).print());
						btnUpdateStatus.setEnabled(true);
						
					} else
						textPane
								.setText("No product with that name found in the system.");
				}
			}
		});
		contentPane.add(btnSearch, "cell 3 2");
	}

}
