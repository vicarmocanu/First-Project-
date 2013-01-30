package GUI;

import ControlLayer.PersonCtr;
import java.awt.BorderLayout;
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

public class DeleteCustomerGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private PersonCtr controller = new PersonCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteCustomerGUI frame = new DeleteCustomerGUI();
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
	public DeleteCustomerGUI() {
		setTitle("DELETE CUSTOMER");
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 373, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][]",
				"[][][][grow][][]"));

		JLabel lblDeleteContractor = new JLabel("DELETE CUSTOMER");
		contentPane.add(lblDeleteContractor, "cell 2 0,alignx center");

		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");

		JLabel lblSearch = new JLabel("SEARCH NAME:");
		contentPane.add(lblSearch, "cell 1 2,alignx trailing");

		searchField = new JTextField();
		contentPane.add(searchField, "cell 2 2,growx");
		searchField.setColumns(10);

		
		

		final JTextPane textPane = new JTextPane();
		contentPane.add(textPane, "cell 2 3,grow");

		final JButton btnDelete = new JButton("DELETE");
		btnDelete.setEnabled(false);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String name = searchField.getText();

				if (searchField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.deleteCustomer(name);

					{
						JOptionPane.showMessageDialog(null,
								"Customer deleted from the system. ",
								"Successful", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
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
					if (controller.listCustomerByName(name)) {
						textPane.setText(controller
								.listCustomerByNamePrint(name));
						btnDelete.setEnabled(true);

					} else {
						textPane.setText(controller
								.listCustomerByNamePrint(name));
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
