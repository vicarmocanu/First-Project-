package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Window.Type;

import ControlLayer.PersonCtr;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class SetDiscountGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private JTextField categoryField;

	private PersonCtr controller2 = new PersonCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetDiscountGUI frame = new SetDiscountGUI();
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
	public SetDiscountGUI() {
		setResizable(false);
		setTitle("SET DISCOUNT");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 403, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][]", "[][][][grow][][]"));

		JLabel lblNewLabel = new JLabel("SET CUSTOMER DISCOUNT");
		contentPane.add(lblNewLabel, "cell 2 0,alignx center");

		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");

		JLabel lblSearchName = new JLabel("SEARCH NAME:");
		contentPane.add(lblSearchName, "cell 1 2,alignx trailing");

		searchField = new JTextField();
		contentPane.add(searchField, "cell 2 2,growx");
		searchField.setColumns(10);

		JButton btnSearch = new JButton("SEARCH");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 2 3,grow");

		final JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setEditable(false);

		JLabel lblNewLabel_1 = new JLabel("CATEGORY:");
		contentPane.add(lblNewLabel_1, "cell 1 4");

		categoryField = new JTextField();
		contentPane.add(categoryField, "cell 2 4,growx");
		categoryField.setColumns(10);

		final JButton btnSetCategory = new JButton("SET");
		btnSetCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String category = categoryField.getText();
				if (category.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller2.setDiscountCategory(searchField.getText(),
							Integer.parseInt(category));

					JOptionPane.showMessageDialog(null,
							"Discount category updated. ", "Successful",
							JOptionPane.INFORMATION_MESSAGE);

				}
			}

		});
		btnSetCategory.setEnabled(false);
		contentPane.add(btnSetCategory, "cell 3 4,growx");

		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnCancel, "cell 2 5,growx");

		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = searchField.getText();

				if (name.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					if (controller2.listCustomerByName(name)) {
						textPane.setText(controller2
								.listCustomerByNamePrint(name));
						btnSetCategory.setEnabled(true);

					} else {
						textPane.setText(controller2
								.listCustomerByNamePrint(name));
					}
				}
			}
		});
		contentPane.add(btnSearch, "cell 3 2");
	}

}
