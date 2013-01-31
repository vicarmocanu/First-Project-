package GUI;

import ControlLayer.CategoryCtr;
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

public class DeleteDiscountGUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private CategoryCtr controller = new CategoryCtr();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteDiscountGUI frame = new DeleteDiscountGUI();
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
	public DeleteDiscountGUI() {
		setTitle("DELETE DISCOUNT CATEGORY");
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 373, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow][]",
				"[][][][grow][][]"));

		JLabel lblDeleteContractor = new JLabel("DELETE CATEGORY");
		contentPane.add(lblDeleteContractor, "cell 2 0,alignx center");

		JSeparator separator = new JSeparator();
		contentPane.add(separator, "cell 0 1 4 1,growx");

		JLabel lblSearch = new JLabel("SEARCH CATEGORY:");
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

				String category = searchField.getText();

				if (searchField.getText().equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.deleteCategory(Integer.parseInt(category));

					{
						JOptionPane.showMessageDialog(null,
								"Discount category deleted from the system. ",
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
				int cat = 0;
				try {
					cat = Integer.parseInt(name);
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "This is not a number",
							"Input error", JOptionPane.ERROR_MESSAGE);
					searchField.setText("");
					name = "";

				}
				if (name.equals("")) {
					JOptionPane.showMessageDialog(null,
							"Empty fields are not allowed!", "Input error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					if (controller.categoryExists(cat)) {
						textPane.setText(controller.searchCategoryAndPrint(cat));
						btnDelete.setEnabled(true);

					} else {
						textPane.setText("No category with that name found");
						btnDelete.setEnabled(false);
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
