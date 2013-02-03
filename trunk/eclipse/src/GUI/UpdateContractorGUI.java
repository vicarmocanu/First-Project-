package GUI;

import java.awt.BorderLayout;
import ControlLayer.PersonCtr;
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
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class UpdateContractorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private JTextField idField;
	private JTextField addressField;
	private JTextField phoneField;
	private PersonCtr controller = new PersonCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateContractorGUI frame = new UpdateContractorGUI();
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
	public UpdateContractorGUI() {
		setResizable(false);
		setTitle("UPDATE CONTRACTOR");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 403, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][]", "[][][][grow][][][][]"));

		JLabel lblNewLabel = new JLabel("UPDATE CONTRACTOR");
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
		
		final JTextPane textField = new JTextPane();
		textField.setEditable(false);
		scrollPane.setViewportView(textField);

		JLabel lblNewLabel_1 = new JLabel("ID:");
		contentPane.add(lblNewLabel_1, "cell 1 4,growx");

		idField = new JTextField();
		idField.setColumns(10);
		contentPane.add(idField, "cell 2 4,growx");

		final JButton btnUpdateId = new JButton("UPDATE");
		btnUpdateId.setEnabled(false);
		btnUpdateId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String id = idField.getText();
				String name = searchField.getText();
				if (idField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.updateContractorId(name, id);
					JOptionPane.showMessageDialog(null,
							"Contractor updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdateId.setEnabled(false);
				}

			}
		});
		contentPane.add(btnUpdateId, "cell 3 4");

		JLabel lblAddress = new JLabel("ADDRESS:");
		contentPane.add(lblAddress, "cell 1 5,growx");

		addressField = new JTextField();
		addressField.setColumns(10);
		contentPane.add(addressField, "cell 2 5,growx");

		final JButton btnUpdateAddress = new JButton("UPDATE");
		btnUpdateAddress.setEnabled(false);
		btnUpdateAddress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String address = addressField.getText();
				String name = searchField.getText();
				if (addressField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else
					controller.updateContractorAddress(name, address);
				{
					JOptionPane.showMessageDialog(null,
							"Contractor updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdateAddress.setEnabled(false);
				}
			}
		});
		contentPane.add(btnUpdateAddress, "cell 3 5");

		JLabel lblPhoneNr = new JLabel("PHONE NR:");
		contentPane.add(lblPhoneNr, "cell 1 6,growx");

		phoneField = new JTextField();
		phoneField.setColumns(10);
		contentPane.add(phoneField, "cell 2 6,growx");

		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		final JButton btnUpdatePhoneNr = new JButton("UPDATE");
		btnUpdatePhoneNr.setEnabled(false);
		btnUpdatePhoneNr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String phone = phoneField.getText();
				String name = searchField.getText();
				if (phoneField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else
					controller.updateContractorPhoneNumber(name, phone);
				{
					JOptionPane.showMessageDialog(null,
							"Contractor updated in the system. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);
					btnUpdatePhoneNr.setEnabled(false);
				}
			}
		});
		contentPane.add(btnUpdatePhoneNr, "cell 3 6");
		contentPane.add(btnCancel, "cell 2 7,growx");
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String searchName;
				searchName = searchField.getText();

				if (searchField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {

					if (controller.listContractorByName(searchName)) {
						textField.setText(controller
								.listContractorByNamePrint(searchName));
						btnUpdateId.setEnabled(true);
						btnUpdateAddress.setEnabled(true);
						btnUpdatePhoneNr.setEnabled(true);
					} else
						textField
								.setText("No contractor with that name found in the system.");
				}

			}
		}

		);
		contentPane.add(btnSearch, "cell 3 2");
	}

}
