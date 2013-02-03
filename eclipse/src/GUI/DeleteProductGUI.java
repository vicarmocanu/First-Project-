package GUI;

import java.awt.BorderLayout;
import ControlLayer.ProductCtr;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Window.Type;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class DeleteProductGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private ProductCtr controller = new ProductCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteProductGUI frame = new DeleteProductGUI();
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
	public DeleteProductGUI() {
		setResizable(false);
		setTitle("DELETE PRODUCT");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 373, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][]", "[][][][grow][][]"));

		JLabel lblDeleteContractor = new JLabel("DELETE PRODUCT");
		contentPane.add(lblDeleteContractor, "cell 2 0,alignx center");

		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");

		JLabel lblSearch = new JLabel("SEARCH NAME:");
		contentPane.add(lblSearch, "cell 1 2,alignx trailing");

		searchField = new JTextField();
		contentPane.add(searchField, "cell 2 2,growx");
		searchField.setColumns(10);
		String name = searchField.getText();
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 2 3,grow");

		final JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		scrollPane.setViewportView(textPane);

		final JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = searchField.getText();

				if (searchField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.deleteProduct(name);

					{
						JOptionPane.showMessageDialog(null,
								"Product deleted from the system. ",
								"Successful", JOptionPane.INFORMATION_MESSAGE);
						btnDelete.setEnabled(false);
					}
				}
			}
		});
		btnDelete.setEnabled(false);
		contentPane.add(btnDelete, "cell 2 4,growx");

		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = searchField.getText();

				if (name.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					if (controller.searchProductAndPrint(name)) {
						textPane.setText(controller
								.searchProductAndPrintPrint(name));
						btnDelete.setEnabled(true);

					} else {
						textPane.setText(controller
								.searchProductAndPrintPrint(name));
					}
				}
			}
		});
		contentPane.add(btnSearch, "cell 3 2");

		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnCancel, "cell 2 5,growx");
	}

}
